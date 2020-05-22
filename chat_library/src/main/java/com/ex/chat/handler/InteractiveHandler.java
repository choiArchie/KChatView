

package com.ex.chat.handler;

import android.view.MotionEvent;

import com.ex.chat.entry.AbsEntry;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 */
public abstract class InteractiveHandler {

    public abstract void onLeftRefresh(AbsEntry firstData);

    public abstract void onRightRefresh(AbsEntry lastData);

    public void onSingleTap(MotionEvent e, float x, float y) {
    }

    public void onDoubleTap(MotionEvent e, float x, float y) {
    }

    public void onHighlight(AbsEntry entry, int entryIndex, float x, float y) {
    }

    public void onCancelHighlight() {
    }
}
