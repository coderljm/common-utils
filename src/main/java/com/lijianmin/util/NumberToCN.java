package com.lijianmin.util;


import java.math.BigDecimal;

/**
 * @Author: jianmin.li
 * @Description: 阿拉伯数字转中文大写工具类
 * @Date: 2019/1/6 13:12
 * @Version: 1.0
 */
public class NumberToCN {
    /**
     * 汉语中数字大写
     */
    private static final String[] CN_UPPER_NUMBER = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    /**
     * 汉语中货币单位大写
     */
    private static final String[] CN_UPPER_RMB_UNIT = {"分","角","圆","拾","佰","仟","萬","拾","佰","仟","亿","拾","佰","仟","兆",
            "拾","佰","仟"};
    /**
     * 特殊字符：整
     */
    private static final String CN_FULL = "整";
    /**
     * 特殊字符：负
     */
    private static final String CN_NEGATIVE = "负";
    /**
     * 金额的精度，默认值为2
     */
    private static final int MONEY_PRECISION = 2;
    /**
     * 特殊字符：零元整
     */
    private static final String CN_ZERO_FULL = "零圆整";

    /**
     * 把输入的金额转换为汉语中人民币的大写,最小单位:分,最大单位:兆
     *
     * @param numberOfMoney 输入的金额,不能超过千兆级别
     * @Author: jianmin.li
     * @Date: 2019/1/6 13:14
     * @return: 对应的汉语大写
     */
    public static String numberToRMBUnit(BigDecimal numberOfMoney) {
        if (null == numberOfMoney) {
            throw new NullPointerException("numberOfMoney is must not be null!");
        }
        //BigDecimal的正负号，正号:1,负号:-1,零:0
        int signum = numberOfMoney.signum();
        //零圆整的情况
        if (0 == signum) {
            return CN_ZERO_FULL;
        }
        //这里会进行金额的四舍五入
        long number = numberOfMoney.movePointRight(MONEY_PRECISION).setScale(0,BigDecimal.ROUND_HALF_EVEN).abs()
                .longValue();
        if (String.valueOf(number).length() > 18) {
            throw new RuntimeException("金额数值过大，已超过千兆!");
        }
        StringBuffer sb = new StringBuffer();
        // 得到小数点后两位值
        long scale = number % 100;
        int numUnit;
        int numIndex = 0;
        boolean getZero = false;
        // 判断最后两位数，一共有四种情况：00 = 0, 01 = 1, 10, 11
        if (!(scale > 0)) {
            numIndex = 2;
            number = number / 100;
            getZero = true;
        }
        if ((scale > 0) && (!(scale % 10 > 0))) {
            numIndex = 1;
            number = number / 10;
            getZero = true;
        }
        int zeroSize = 0;
        while (true) {
            if (number <= 0) {
                break;
            }
            // 每次获取到最后一个数
            numUnit = (int) (number % 10);
            if (numUnit > 0) {
                if ((numIndex == 9) && (zeroSize >= 3)) {
                    sb.insert(0,CN_UPPER_RMB_UNIT[6]);
                }
                if ((numIndex == 13) && (zeroSize >= 3)) {
                    sb.insert(0,CN_UPPER_RMB_UNIT[10]);
                }
                sb.insert(0,CN_UPPER_RMB_UNIT[numIndex]);
                sb.insert(0,CN_UPPER_NUMBER[numUnit]);
                getZero = false;
                zeroSize = 0;
            } else {
                ++zeroSize;
                if (!(getZero)) {
                    sb.insert(0,CN_UPPER_NUMBER[numUnit]);
                }
                if (numIndex == 2) {
                    if (number > 0) {
                        sb.insert(0,CN_UPPER_RMB_UNIT[numIndex]);
                    }
                } else if (((numIndex - 2) % 4 == 0) && (number % 1000 > 0)) {
                    sb.insert(0,CN_UPPER_RMB_UNIT[numIndex]);
                }
                getZero = true;
            }
            // 让number每次都去掉最后一个数
            number = number / 10;
            ++numIndex;
        }
        // 如果signum == -1，则说明输入的数字为负数，就在最前面追加特殊字符：负
        if (signum == -1) {
            sb.insert(0,CN_NEGATIVE);
        }
        // 输入的数字小数点后两位为"00"的情况，则要在最后追加特殊字符：整
        if (!(scale > 0)) {
            sb.append(CN_FULL);
        }
        return sb.toString();
    }

}