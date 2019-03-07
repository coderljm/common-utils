package com.lijianmin.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.JedisCluster;

import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Author: jianmin.li
 * @Description: 分布式锁工具类
 * @Date: 2019/3/2 15:36
 * @Version: 1.0
 */

public class DistributedLockUtils {
    private static final Logger log = LoggerFactory.getLogger(DistributedLockUtils.class);
    private static final ThreadLocal<String> THREAD_LOCAL = new ThreadLocal<String>();
    /**
     * 当key不存在时，进行set操作；若key已经存在，则不做任何操作
     */
    private static final String SET_IF_NOT_EXIST = "NX";
    /**
     * 给这个key加一个过期的设置
     */
    private static final String SET_WITH_EXPIRE_TIME = "PX";
    /**
     * 加锁成功标识
     */
    private static final String LOCK_SUCCESS = "OK";
    /**
     * 获取分布式锁最大等待时间-->5 seconds
     */
    private static final long GET_LOCK_MAX_WAIT_TIME = 5000L;
    /**
     * 解锁成功标识
     */
    private static final Long RELEASE_SUCCESS = 1L;
    /**
     * 锁生存时间-->6 seconds
     */
    private static final long LOCK_EXPIRE_TIME = 5000L;
    /**
     * Lua脚本代码
     */
    private static final String SCRIPT = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', " +
            "KEYS[1]) else return 0 end";

    /**
     * 5秒轮询获取分布式锁
     *
     * @param jedisCluster jedis客户端
     * @param lockKey      锁
     * @Author: jianmin.li
     * @Date: 2019/3/2 15:39
     * @return: 是否获取成功
     */
    public static boolean lock(JedisCluster jedisCluster,String lockKey) {
        long begin = System.currentTimeMillis();
        // 第一个为key，我们使用key来当锁，因为key是唯一的。
        // 第二个为value，我们传的是requestId,requestId可以使用UUID.randomUUID().toString()方法生成。
        // 第三个为nxxx，这个参数我们填的是NX，意思是SET IF NOT EXIST，即当key不存在时，我们进行set操作；若key已经存在，则不做任何操作；
        // 第四个为expx，这个参数我们传的是PX，意思是我们要给这个key加一个过期的设置，具体时间由第五个参数决定。
        // 第五个为time，与第四个参数相呼应，代表key的过期时间。
        try {
            //5秒内获取到锁返回成功，超时未获取到锁返回失败
            while (System.currentTimeMillis() - begin < GET_LOCK_MAX_WAIT_TIME) {
                if (lock(jedisCluster,lockKey,LOCK_EXPIRE_TIME)) {
                    return true;
                }
                TimeUnit.SECONDS.sleep(1L);
            }
            log.warn("============加锁超时!lockKey:{}===========",lockKey);
        } catch (Exception e) {
            log.error("===============加锁异常!==================",e);
        }
        return false;
    }

    /**
     * 获取分布式锁
     *
     * @param jedisCluster jedis客户端
     * @param lockKey      锁
     * @param expireTime   锁生存时间(毫秒)
     * @Author: jianmin.li
     * @Date: 2019/3/7 23:19
     * @return: 是否获取成功
     */
    public static boolean lock(JedisCluster jedisCluster,String lockKey,long expireTime) {
        String requestId = UUID.randomUUID().toString();
        THREAD_LOCAL.set(requestId);
        try {
            if (LOCK_SUCCESS.equals(jedisCluster.set(lockKey,requestId,SET_IF_NOT_EXIST,SET_WITH_EXPIRE_TIME,
                    expireTime))) {
                return true;
            }
        } catch (Exception e) {
            log.error("===============加锁异常!==================",e);
        }
        THREAD_LOCAL.remove();
        return false;
    }

    /**
     * 释放分布式锁
     *
     * @param jedisCluster jedis客户端
     * @param lockKey      锁
     * @Author: jianmin.li
     * @Date: 2019/3/2 15:51
     * @return: 是否释放锁成功
     */
    public static boolean unlock(JedisCluster jedisCluster,String lockKey) {
        //将Lua代码传到jedis.eval()方法里，并使参数KEYS[1]赋值为lockKey，ARGV[1]赋值为requestId。eval()方法是将Lua代码交给Redis服务端执行
        //执行eval()方法可以确保原子性，源于Redis的特性，就是在eval命令执行Lua代码的时候，Lua代码将被当成一个命令去执行，并且直到eval命令执行完成，Redis才会执行其他命令
        try {
            if (RELEASE_SUCCESS.equals(jedisCluster.eval(SCRIPT,Collections.singletonList(lockKey),Collections
                    .singletonList(THREAD_LOCAL.get())))) {
                return true;
            }
            log.warn("===============解锁失败!lockKey:{}==============",lockKey);
            return false;
        } catch (Exception e) {
            log.error("=================解锁异常!=================",e);
            return false;
        } finally {
            THREAD_LOCAL.remove();
        }
    }
}
