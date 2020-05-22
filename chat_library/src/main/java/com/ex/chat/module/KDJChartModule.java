

package com.ex.chat.module;

import com.ex.chat.entry.CandleEntry;
import com.ex.chat.enumeration.ModuleType;
import com.ex.chat.module.base.AuxiliaryChartModule;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * KDJ组件
 */
public class KDJChartModule extends AuxiliaryChartModule<CandleEntry> {

    public KDJChartModule() {
        super(ModuleType.KDJ);
    }

    @Override
    public void computeMinMax(int currentIndex, CandleEntry entry) {
        if (entry.getK().value < getMinY().value) {
            setMinY(entry.getK());
        }
        if (entry.getD().value < getMinY().value) {
            setMinY(entry.getD());
        }
        if (entry.getJ().value < getMinY().value) {
            setMinY(entry.getJ());
        }

        if (entry.getK().value > getMaxY().value) {
            setMaxY(entry.getK());
        }
        if (entry.getD().value > getMaxY().value) {
            setMaxY(entry.getD());
        }
        if (entry.getJ().value > getMaxY().value) {
            setMaxY(entry.getJ());
        }
    }
}
