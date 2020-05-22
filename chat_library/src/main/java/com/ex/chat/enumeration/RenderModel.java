package com.ex.chat.enumeration;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 图标渲染模式
 */
public enum RenderModel {
    CANDLE(0),//蜡烛图

    DEPTH(1);//深度图

    RenderModel(int nativeInt) {
        this.nativeInt = nativeInt;
    }

    final int nativeInt;
}
