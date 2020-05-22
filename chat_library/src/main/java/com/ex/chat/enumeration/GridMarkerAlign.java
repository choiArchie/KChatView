package com.ex.chat.enumeration;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 */
public enum GridMarkerAlign {
    LEFT(0),//靠左

    RIGHT(1),//靠右

    AUTO(2);//自动

    GridMarkerAlign(int nativeInt) {
        this.nativeInt = nativeInt;
    }

    final int nativeInt;
}
