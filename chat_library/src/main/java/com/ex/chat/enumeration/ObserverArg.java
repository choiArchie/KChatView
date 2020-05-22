package com.ex.chat.enumeration;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 通知类型
 */
public enum ObserverArg {
    normal(0),//无改变

    add(1),//添加

    push(2),//推送

    init(3);//初始化

    ObserverArg(int nativeInt) {
        this.nativeInt = nativeInt;
    }

    final int nativeInt;

    public static ObserverArg getObserverArg(int value) {
        for (ObserverArg item : values()) {
            if (item.ordinal() == value) {
                return item;
            }
        }
        return normal;
    }

}
