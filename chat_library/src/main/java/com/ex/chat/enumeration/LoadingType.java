package com.ex.chat.enumeration;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 图标加载模式
 */
public enum LoadingType {
    LEFT_LOADING(0),//左滑动加载

    RIGHT_LOADING(1),//右滑动加载

    REFRESH_LOADING(2);//刷新

    LoadingType(int nativeInt) {
        this.nativeInt = nativeInt;
    }

    final int nativeInt;
}
