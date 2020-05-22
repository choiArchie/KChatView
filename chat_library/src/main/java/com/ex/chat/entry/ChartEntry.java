package com.ex.chat.entry;

import com.ex.chat.Chart;
import com.ex.chat.handler.InteractiveHandler;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 */
public class ChartEntry {
    private Chart chart;
    private InteractiveHandler handler;

    public ChartEntry() {
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

    public Chart getChart() {
        return chart;
    }

    public InteractiveHandler getHandler() {
        return handler;
    }

    public void setHandler(InteractiveHandler handler) {
        this.handler = handler;
    }
}
