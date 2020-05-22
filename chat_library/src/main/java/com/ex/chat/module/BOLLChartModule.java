
package com.ex.chat.module;

import com.ex.chat.entry.CandleEntry;
import com.ex.chat.enumeration.ModuleType;
import com.ex.chat.module.base.AuxiliaryChartModule;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * Boll组件
 */

public class BOLLChartModule extends AuxiliaryChartModule<CandleEntry> {

    public BOLLChartModule() {
        super(ModuleType.BOLL);
    }

    @Override
    public void computeMinMax(int currentIndex, CandleEntry entry) {
        if (entry.getMb().value < getMinY().value) {
            setMinY(entry.getMb());
        }

        if (entry.getMb().value > getMaxY().value) {
            setMaxY(entry.getMb());
        }

        if (currentIndex > 0) {
            if (entry.getUp().value < getMinY().value) {
                setMinY(entry.getUp());
            }
            if (entry.getDn().value < getMinY().value) {
                setMinY(entry.getDn());
            }

            if (entry.getUp().value > getMaxY().value) {
                setMaxY(entry.getUp());
            }
            if (entry.getDn().value > getMaxY().value) {
                setMaxY(entry.getDn());
            }
        }
    }
}
