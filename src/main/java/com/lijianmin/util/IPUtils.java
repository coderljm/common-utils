package com.lijianmin.util;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

/**
 * @Author: 12817
 * @Description: ip工具类
 * @Date: 23:51 2018/7/6
 */
public class IPUtils {
    /**
     * @Author: 12817
     * @Description: 获取客户端真实IP
     * @Date: 23:52 2018/7/6
     * @Param: [request]
     * @return: java.lang.String
     */
    public static String getIpAddressAdvanced(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_CLIENT_IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if (ip != null && ip.indexOf(",") != -1) {
            String[] ipWithMultiProxy = ip.split(",");
            for (String eachIpSegement : ipWithMultiProxy) {
                if (!"unknown".equalsIgnoreCase(eachIpSegement)) {
                    ip = eachIpSegement;
                    break;
                }
            }
        }
        return ip;
    }

    /**
     * @Author: 12817
     * @Description: 获取本机IP
     * @Date: 0:10 2018/7/7
     * @Param: []
     * @return: java.lang.String
     */
    public static String getLocalIp() throws SocketException, UnknownHostException {
        InetAddress candidateAddress = null;
        for (Enumeration ifaces = NetworkInterface.getNetworkInterfaces(); ifaces.hasMoreElements(); ) {
            NetworkInterface iface = (NetworkInterface) ifaces.nextElement();
            for (Enumeration inetAddrs = iface.getInetAddresses(); inetAddrs.hasMoreElements(); ) {
                InetAddress inetAddr = (InetAddress) inetAddrs.nextElement();
                if (!inetAddr.isLoopbackAddress()) {
                    if (inetAddr.isSiteLocalAddress()) {
                        return inetAddr.getHostAddress();
                    } else if (candidateAddress == null) {
                        candidateAddress = inetAddr;
                    }
                }
            }
        }
        if (candidateAddress != null) {
            return candidateAddress.getHostAddress();
        }
        InetAddress jdkSuppliedAddress = InetAddress.getLocalHost();
        return jdkSuppliedAddress.getHostAddress();
    }
}
