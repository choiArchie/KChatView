package com.ex.chat.compat;

import com.ex.chat.Chart;
import com.ex.chat.entry.ChartEntry;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 缓存
 */
public class CacheHolder {
    private static Chart cacheChart = null;

    /**
     * 缓存图表
     */
    public static void cacheChart(ChartEntry chart) {
        cacheChart = chart.getChart();
    }

    /**
     * 获取缓存的图表
     */
    public static Chart getCacheChart() {
        return cacheChart;
    }

    /**
     * 清空缓存图表
     */
    public static void clearCacheChart() {
        cacheChart = null;
    }

    /**
     * 图表是否缓存过
     */
    public static boolean isCache() {
        return null != cacheChart;
    }
}
