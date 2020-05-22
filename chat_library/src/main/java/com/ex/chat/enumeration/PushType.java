package com.ex.chat.enumeration;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 推送类型
 */
public enum PushType {
    UPDATE(0),//更改

    ADD(1),//添加

    INTERMITTENT(2),//间断

    INVALID(3);//无效

    PushType(int nativeInt) {
        this.nativeInt = nativeInt;
    }

    final int nativeInt;
}
