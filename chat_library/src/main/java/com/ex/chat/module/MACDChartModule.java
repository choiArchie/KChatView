

package com.ex.chat.module;

import com.ex.chat.entry.CandleEntry;
import com.ex.chat.enumeration.ModuleType;
import com.ex.chat.module.base.AuxiliaryChartModule;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * MACD组件
 */
public class MACDChartModule extends AuxiliaryChartModule<CandleEntry> {

    public MACDChartModule() {
        super(ModuleType.MACD);
    }

    @Override
    public void computeMinMax(int currentIndex, CandleEntry entry) {
        if (entry.getMacd().value < getMinY().value) {
            setMinY(entry.getMacd());
        }
        if (entry.getDea().value < getMinY().value) {
            setMinY(entry.getDea());
        }
        if (entry.getDiff().value < getMinY().value) {
            setMinY(entry.getDiff());
        }

        if (entry.getMacd().value > getMaxY().value) {
            setMaxY(entry.getMacd());
        }
        if (entry.getDea().value > getMaxY().value) {
            setMaxY(entry.getDea());
        }
        if (entry.getDiff().value > getMaxY().value) {
            setMaxY(entry.getDiff());
        }
    }
}
