package com.lijianmin.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author: jianmin.li
 * @Description: 时间工具类
 * @Date: 12:23 2018/7/7
 */
public class TimeUtils {
    private static final String COMMON_PATTERN = "yyyy-MM-dd HH:mm:ss";

    private static SimpleDateFormat getSimpleDateFormat(String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern,Locale.CHINA);
        format.setTimeZone(TimeZone.getTimeZone("GMT+8:00"));
        return format;
    }

    /**
     * 获取当前时间字符串, 可以指定时间格式
     *
     * @param pattern 格式
     * @Author: jianmin.li
     * @Date: 2018/11/30 16:53
     * @return: java.lang.String
     */
    public static String getCurrentTimeString(String pattern) {
        return getSimpleDateFormat(pattern).format(new Date());
    }

    /**
     * 获取当前时间字符串, 格式为"yyyy-MM-dd HH:mm:ss"
     *
     * @Author: jianmin.li
     * @Date: 2018/11/30 16:54
     * @return: java.lang.String
     */
    public static String getCurrentTimeString() {
        return getCurrentTimeString(COMMON_PATTERN);
    }

    /**
     * 获取当前时间,可能抛出{@link ParseException}异常
     *
     * @Author: jianmin.li
     * @Date: 2018/11/30 16:54
     * @return: java.util.Date
     */
    public static Date getCurrentTimeDate() throws ParseException {
        return getSimpleDateFormat(COMMON_PATTERN).parse(getCurrentTimeString(COMMON_PATTERN));
    }

    /**
     * 得当前时间距离给定天数零点的毫秒时间
     *
     * @param amount 天数
     * @Author: jianmin.li
     * @Date: 2018/11/30 16:58
     * @return: java.lang.Long
     */
    public static Long getDelayTime(int amount) {
        //1 设置当前时间
        Date newDate = new Date();
        Calendar calendar = getCalendar(newDate);
        //2 将时分秒设置成0
        calendar.set(Calendar.HOUR_OF_DAY,0);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        //3 设置指定天数
        calendar.add(Calendar.DATE,amount);
        //4 计算当前时间距离设置日期零点的延迟时间
        return calendar.getTimeInMillis() - newDate.getTime();
    }

    /**
     * 当前时间距离明天零点的毫秒时间
     *
     * @Author: jianmin.li
     * @Date: 2018/11/30 16:58
     * @return: java.lang.Long
     */
    public static Long getDelayTime() {
        return getDelayTime(1);
    }


    /**
     * 获得一天的毫秒值
     *
     * @param
     * @Author: jianmin.li
     * @Date: 2018/11/30 16:59
     * @return: java.lang.Long
     */
    public static Long getOneDay() {
        return 24 * 60 * 60 * 1000L;
    }

    /**
     * 得传入日期的几月(两位)
     *
     * @param date 日期
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:00
     * @return: java.lang.String
     */
    public static String getAppointedDateMonth(Date date) {
        //1 设置当前时间
        Calendar calendar = getCalendar(date);
        int m = calendar.get(Calendar.MONTH) + 1;
        return m < 10 ? "0" + m : "" + m;
    }

    private static GregorianCalendar getCalendar(Date date) {
        GregorianCalendar calendar = new GregorianCalendar(TimeZone.getTimeZone("GMT+8:00"),Locale.CHINA);
        calendar.setTime(date);
        return calendar;
    }

    /**
     * 获得传入日期的几号(两位)
     *
     * @param date 日期
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:00
     * @return: java.lang.String
     */
    public static String getAppointedDateDay(Date date) {
        //1 设置当前时间
        Calendar calendar = getCalendar(date);
        int d = calendar.get(Calendar.DATE);
        return d < 10 ? "0" + d : "" + d;
    }

    /**
     * @Author: 12817
     * @Description: 获得传入日期的年份
     * @Date: 21:53 2018/12/20
     * @Param: [date]
     * @return: java.lang.String
     */
    public static String getAppointedDateYear(Date date) {
        //1 设置当前时间
        Calendar calendar = getCalendar(date);
        int y = calendar.get(Calendar.YEAR);
        return "" + y;
    }

    /**
     * 将毫秒值转换为指定格式的时间字符串
     *
     * @param pattern    时间字符串格式
     * @param timeMillis 时间毫秒值
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:01
     * @return: java.lang.String
     */
    public static String timeMillisConvertToTimeString(String pattern,long timeMillis) throws ParseException {
        return getSimpleDateFormat(pattern).format(timeMillis);
    }

    /**
     * 将毫秒值转换为<b>"yyyy-MM-dd HH:mm:ss"</b>格式的时间字符串
     *
     * @param timeMillis 时间毫秒值
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:01
     * @return: java.lang.String
     */
    public static String timeMillisConvertToTimeString(long timeMillis) throws ParseException {
        return timeMillisConvertToTimeString(COMMON_PATTERN,timeMillis);
    }

    /**
     * 将毫秒值转换为日期,可能抛出{@link ParseException}异常
     *
     * @param timeMillis 时间毫秒值
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:02
     * @return: java.util.Date
     */
    public static Date timeMillisConvertToDate(long timeMillis) throws ParseException {
        return getSimpleDateFormat(COMMON_PATTERN).parse(timeMillisConvertToTimeString(timeMillis));
    }


    /**
     * 将指定格式的时间字符串转换为毫秒值,可能抛出{@link ParseException}异常
     *
     * @param pattern    日期格式
     * @param timeString 时间字符串
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:04
     * @return: java.lang.Long
     */
    public static Long timeStringConvertToTimeMillis(String pattern,String timeString) throws
            ParseException {
        return getSimpleDateFormat(pattern).parse(timeString).getTime();
    }

    /**
     * 將<b>"yyyy-MM-dd HH:mm:ss"</b>格式的时间转换为毫秒值
     *
     * @param timeString 时间字符串
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:04
     * @return: java.lang.Long
     */
    public static Long timeStringConvertToTimeMillis(String timeString) throws ParseException {
        return timeStringConvertToTimeMillis(COMMON_PATTERN,timeString);
    }


    /**
     * 获取距离当前时间几天后的时间,可以指定格式
     *
     * @param days    天数
     * @param pattern 返回的时间字符串格式
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:05
     * @return: java.lang.String
     */
    public static String getFewDaysTimeStringFromTheCurrentTime(int days,String pattern) {
        return getSimpleDateFormat(pattern).format(getDate(Calendar.DATE,days));
    }

    /**
     * 获取距离当前时间几天后的时间,格式为<b>"yyyy-MM-dd HH:mm:ss"</b>
     *
     * @param days 天数
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:06
     * @return: java.lang.String
     */
    public static String getFewDaysTimeStringFromTheCurrentTime(int days) {
        return getFewDaysTimeStringFromTheCurrentTime(days,COMMON_PATTERN);
    }


    /**
     * 取距离当前时间几天后的时间,可能抛出{@link ParseException}异常
     *
     * @param days 天数
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:07
     * @return: java.util.Date
     */
    public static Date getFewDaysDateFromTheCurrentTime(int days) throws ParseException {
        return getSimpleDateFormat(COMMON_PATTERN).parse(getFewDaysTimeStringFromTheCurrentTime(days));
    }

    /**
     * 获取距离当前时间几月后的时间，可以指定格式
     *
     * @param months  月数
     * @param pattern 格式
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:08
     * @return: java.lang.String
     */
    public static String getFewMonthsTimeStringFromTheCurrentTime(int months,String pattern) {
        return getSimpleDateFormat(pattern).format(getDate(Calendar.MONTH,months));
    }


    /**
     * 获取距离当前时间几月后的时间，格式为<b>"yyyy-MM-dd HH:mm:ss"</b>
     *
     * @param months 月数
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:09
     * @return: java.lang.String
     */
    public static String getFewMonthsTimeStringFromTheCurrentTime(int months) {
        return getFewMonthsTimeStringFromTheCurrentTime(months,COMMON_PATTERN);
    }


    /**
     * 获取距离当前时间几月后的时间,可能抛出{@link ParseException}异常
     *
     * @param months 月数
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:10
     * @return: java.util.Date
     */
    public static Date getFewMonthsDateFromTheCurrentTime(int months) throws ParseException {
        return getSimpleDateFormat(COMMON_PATTERN).parse(getFewMonthsTimeStringFromTheCurrentTime(months));
    }


    /**
     * 获取距离当前时间几年后的时间，可以指定格式
     *
     * @param years   年数
     * @param pattern 格式
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:11
     * @return: java.lang.String
     */
    public static String getFewYearsTimeStringFromTheCurrentTime(int years,String pattern) {
        return getSimpleDateFormat(pattern).format(getDate(Calendar.YEAR,years));
    }


    /**
     * 获取距离当前时间几年后的时间，格式为<b>"yyyy-MM-dd HH:mm:ss"</b>
     *
     * @param years 年数
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:11
     * @return: java.lang.String
     */
    public static String getFewYearsTimeStringFromTheCurrentTime(int years) {
        return getFewYearsTimeStringFromTheCurrentTime(years,COMMON_PATTERN);
    }

    /**
     * 获取距离当前时间几年后的时间,可能抛出{@link ParseException}异常
     *
     * @param years 年数
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:12
     * @return: java.util.Date
     */
    public static Date getFewYearsDateFromTheCurrentTime(int years) throws ParseException {
        return getSimpleDateFormat(COMMON_PATTERN).parse(getFewYearsTimeStringFromTheCurrentTime(years));
    }

    private static Date getDate(int type,int count) {
        GregorianCalendar calendar = getCalendar(new Date());
        calendar.add(type,count);
        return calendar.getTime();
    }


    /**
     * 判断传入的日期是否为闰年
     *
     * @param date 日期
     * @Author: jianmin.li
     * @Date: 2018/11/30 17:13
     * @return: boolean
     */
    public static boolean isLeapYear(Date date) {
        GregorianCalendar calendar = getCalendar(date);
        return calendar.isLeapYear(calendar.get(Calendar.YEAR));
    }

    /**
     * 获取时间戳: <b>yyyyMMddHHmmssms</b>
     *
     * @param
     * @Author: jianmin.li
     * @Date: 2018/11/30 20:00
     * @return: java.lang.String
     */
    public static String getTimeStamp() {
        return getCurrentTimeString("yyyyMMddHHmmssms");
    }
}
