package com.ex.chat.compat;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 *
 */
public class ChartConstraintSet extends ConstraintSet {

    public ChartConstraintSet() {
        super();
    }

    public ChartConstraintSet(ConstraintSet set) {
        clone(set);
    }

    public ChartConstraintSet(ConstraintLayout layout) {
        clone(layout);
    }
}
