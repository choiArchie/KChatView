package com.ex.chat.enumeration;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 */
public enum AxisLabelLocation {
  LEFT(0),//左边

  RIGHT(1),//右边

  ALL(2);//左右都有

  AxisLabelLocation(int nativeInt) {
    this.nativeInt = nativeInt;
  }

  final int nativeInt;
}
