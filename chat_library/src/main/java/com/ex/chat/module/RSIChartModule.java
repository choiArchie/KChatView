

package com.ex.chat.module;

import com.ex.chat.entry.CandleEntry;
import com.ex.chat.enumeration.ModuleType;
import com.ex.chat.module.base.AuxiliaryChartModule;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * RSIC组件
 */
public class RSIChartModule extends AuxiliaryChartModule<CandleEntry> {

    public RSIChartModule() {
        super(ModuleType.RSI);
    }

    @Override
    public void computeMinMax(int currentIndex, CandleEntry entry) {
        if (entry.getRsi1().value < getMinY().value) {
            setMinY(entry.getRsi1());
        }
        if (entry.getRsi2().value < getMinY().value) {
            setMinY(entry.getRsi2());
        }
        if (entry.getRsi3().value < getMinY().value) {
            setMinY(entry.getRsi3());
        }

        if (entry.getRsi1().value > getMaxY().value) {
            setMaxY(entry.getRsi1());
        }
        if (entry.getRsi2().value > getMaxY().value) {
            setMaxY(entry.getRsi2());
        }
        if (entry.getRsi3().value > getMaxY().value) {
            setMaxY(entry.getRsi3());
        }
    }
}
