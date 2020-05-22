package com.ex.chat.enumeration;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 */
public enum AxisMarkerAlign {
    TOP(0),

    BOTTOM(1),

    AUTO(2);

    AxisMarkerAlign(int nativeInt) {
        this.nativeInt = nativeInt;
    }

    final int nativeInt;
}
