package com.ex.chat.enumeration;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 数据展示类型
 */
public enum DataDisplayType {
    PAGING(0),//分页

    REAL_TIME(1);//实时

    DataDisplayType(int nativeInt) {
        this.nativeInt = nativeInt;
    }

    final int nativeInt;
}
