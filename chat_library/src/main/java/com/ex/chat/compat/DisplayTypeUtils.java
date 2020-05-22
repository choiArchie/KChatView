package com.ex.chat.compat;

import com.ex.chat.enumeration.DisplayType;

import java.util.Date;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 时间格式化器
 */
public class DisplayTypeUtils {

    public static String format(Date date, DisplayType displayType) {
        return DateUtil.formatDateToString(date, displayType.pattern());
    }

    public static String selectorFormat(Date date, DisplayType displayType) {
        return DateUtil.formatDateToString(date, displayType == DisplayType.oneDay
                ? DateUtil.DATE_FORMAT_YMD : DateUtil.DATE_FORMAT_YMDHM);
    }
}
