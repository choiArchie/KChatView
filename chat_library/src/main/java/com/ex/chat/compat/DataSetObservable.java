package com.ex.chat.compat;

import java.util.Observable;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 */
public class DataSetObservable extends Observable {
    @Override
    public void notifyObservers(Object arg) {
        setChanged();
        super.notifyObservers(arg);
    }

    @Override
    public void notifyObservers() {
        setChanged();
        super.notifyObservers();
    }
}
