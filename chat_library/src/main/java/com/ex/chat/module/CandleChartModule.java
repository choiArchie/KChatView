package com.ex.chat.module;

import com.ex.chat.entry.CandleEntry;
import com.ex.chat.enumeration.ModuleType;
import com.ex.chat.module.base.MainChartModule;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 蜡烛图组件
 */
public class CandleChartModule extends MainChartModule<CandleEntry> {

    public CandleChartModule() {
        super(ModuleType.CANDLE);
    }

    @Override
    public void computeMinMax(int currentIndex, CandleEntry entry) {
        //计算最小值
        if (entry.getLow().value < getMinY().value) {
            setMinY(entry.getLow());
        }
        if (entry.getMa5().value < getMinY().value) {
            setMinY(entry.getMa5());
        }
        if (entry.getMa10().value < getMinY().value) {
            setMinY(entry.getMa10());
        }
        if (entry.getMa20().value < getMinY().value) {
            setMinY(entry.getMa20());
        }
        //计算最大值
        if (entry.getHigh().value > getMaxY().value) {
            setMaxY(entry.getHigh());
        }
        if (entry.getMa5().value > getMaxY().value) {
            setMaxY(entry.getMa5());
        }
        if (entry.getMa10().value > getMaxY().value) {
            setMaxY(entry.getMa10());
        }
        if (entry.getMa20().value > getMaxY().value) {
            setMaxY(entry.getMa20());
        }
    }
}
