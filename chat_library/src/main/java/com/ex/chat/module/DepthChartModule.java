package com.ex.chat.module;

import com.ex.chat.entry.DepthEntry;
import com.ex.chat.enumeration.ModuleType;
import com.ex.chat.module.base.MainChartModule;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 深度图组件
 */
public class DepthChartModule extends MainChartModule<DepthEntry> {

    public DepthChartModule() {
        super(ModuleType.DEPTH);
    }

    @Override
    public void computeMinMax(int currentIndex, DepthEntry entry) {
        //计算最小值
        if (entry.getTotalAmount().value < getMinY().value) {
            setMinY(entry.getTotalAmount());
        }
        if (entry.getPrice().value < getMinX().value) {
            setMinX(entry.getPrice());
        }
        //计算最大值
        if (entry.getTotalAmount().value > getMaxY().value) {
            setMaxY(entry.getTotalAmount());
        }
        if (entry.getPrice().value > getMaxX().value) {
            setMaxX(entry.getPrice());
        }
    }
}
