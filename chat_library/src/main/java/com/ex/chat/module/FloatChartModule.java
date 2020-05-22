package com.ex.chat.module;

import android.graphics.RectF;

import com.ex.chat.entry.AbsEntry;
import com.ex.chat.enumeration.ModuleType;
import com.ex.chat.module.base.AuxiliaryChartModule;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 浮动组件
 */
public class FloatChartModule extends AuxiliaryChartModule<AbsEntry> {

  public FloatChartModule(RectF rect) {
    super(ModuleType.FLOAT);
    setRect(rect);
  }

  @Override
  public void computeMinMax(int currentIndex, AbsEntry entry) {
  }
}
