package com.ex.chat.module.base;

import com.ex.chat.entry.AbsEntry;
import com.ex.chat.enumeration.ModuleType;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 主图基类
 */
public abstract class MainChartModule<T extends AbsEntry> extends AbsChartModule<T> {

    public MainChartModule(ModuleType moduleType) {
        super(moduleType);
    }

}
