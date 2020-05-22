package com.ex.chat.module;

import com.ex.chat.entry.CandleEntry;
import com.ex.chat.enumeration.ModuleType;
import com.ex.chat.module.base.MainChartModule;


/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 分时图组件
 */
public class TimeLineChartModule extends MainChartModule<CandleEntry> {

    public TimeLineChartModule() {
        super(ModuleType.TIME);
    }

    @Override
    public void computeMinMax(int currentIndex, CandleEntry entry) {
        //计算最小值
        if (entry.getClose().value < getMinY().value) {
            setMinY(entry.getClose());
        }
        //计算最大值
        if (entry.getClose().value > getMaxY().value) {
            setMaxY(entry.getClose());
        }
    }
}
