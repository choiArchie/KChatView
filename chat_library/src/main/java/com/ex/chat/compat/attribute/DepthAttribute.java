
package com.ex.chat.compat.attribute;

import android.content.Context;

import androidx.annotation.NonNull;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 深度图属性配置类
 */

public class DepthAttribute extends BaseAttribute {

  public DepthAttribute(@NonNull Context context) {
    super(context);
  }

  /**
   * 与深度图有关的属性
   */
  public float polylineWidth = 6f; // 折线宽度
  public float circleSize = 12f;// 圆点大小
  public int bidLineColor = 0xffb5fc00; // 买单折线颜色
  public int askLineColor = 0xfffe0d5e; // 卖单折线颜色
  public int bidShaderColor = 0x14b5fc00;// 买单阴影颜色
  public int askShaderColor = 0x14fe0d5e;// 卖单阴影颜色
  public int bidHighlightColor = 0x40b5fc00;// 买单高亮线颜色
  public int askHighlightColor = 0x40fe0d5e;// 卖单高亮线颜色
}