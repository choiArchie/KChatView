package com.ex.chat.compat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 时间工具类
 */
@SuppressWarnings("all")
public class DateUtil {
    /**
     * 常用变量
     */
    private static final SimpleDateFormat format = new SimpleDateFormat();
    public static final String DATE_FORMAT_YMD = "yyyy-MM-dd";
    public static final String DATE_FORMAT_YMDHM = "yyyy-MM-dd HH:mm";

    /**
     * 日期转换为制定格式字符串
     */
    public static String formatDateToString(Date time, String pattern) {
        try {
            format.applyPattern(pattern);
            return format.format(time);
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * 计算两个时间的间隔
     */
    public static long getDiffBetween(Date startDate, Date endDate, long type) {
        if (null == startDate || null == endDate) {
            return 0;
        }
        return (int) ((endDate.getTime() - startDate.getTime()) / type);
    }
}

