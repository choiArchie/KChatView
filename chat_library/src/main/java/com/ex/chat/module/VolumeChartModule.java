package com.ex.chat.module;

import com.ex.chat.entry.CandleEntry;
import com.ex.chat.enumeration.ModuleType;
import com.ex.chat.module.base.AuxiliaryChartModule;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 交易量组件
 */
public class VolumeChartModule extends AuxiliaryChartModule<CandleEntry> {

    public VolumeChartModule() {
        super(ModuleType.VOLUME);
    }

    @Override
    public void computeMinMax(int currentIndex, CandleEntry entry) {
        if (entry.getVolume().value < getMinY().value) {
            setMinY(entry.getVolume());
        }
        if (entry.getVolumeMa5().value < getMinY().value) {
            setMinY(entry.getVolumeMa5());
        }
        if (entry.getVolumeMa10().value < getMinY().value) {
            setMinY(entry.getVolumeMa10());
        }

        if (entry.getVolume().value > getMaxY().value) {
            setMaxY(entry.getVolume());
        }
        if (entry.getVolumeMa5().value > getMaxY().value) {
            setMaxY(entry.getVolumeMa5());
        }
        if (entry.getVolumeMa10().value > getMaxY().value) {
            setMaxY(entry.getVolumeMa10());
        }
    }
}
