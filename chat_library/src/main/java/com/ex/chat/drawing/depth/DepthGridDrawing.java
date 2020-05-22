
package com.ex.chat.drawing.depth;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

import com.ex.chat.compat.FontConfig;
import com.ex.chat.compat.Utils;
import com.ex.chat.compat.ValueUtils;
import com.ex.chat.compat.attribute.BaseAttribute;
import com.ex.chat.drawing.AbsDrawing;
import com.ex.chat.module.base.AbsChartModule;
import com.ex.chat.render.DepthRender;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 轴绘制组件
 */

public class DepthGridDrawing extends AbsDrawing<DepthRender> {
    private static final String TAG = "GridDrawing";
    private BaseAttribute attribute;//配置文件

    private TextPaint gridLabelPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG); // Grid 轴标签的画笔
    private Paint gridPaint = new Paint(Paint.ANTI_ALIAS_FLAG); // Grid 轴网格线画笔

    private Rect rect = new Rect();//用于测量文字的实际占用区域

    private final float[] pointCache = new float[2];

    private float regionWidth, gridLabelY;//区域宽度,gridLabel的 Grid 轴坐标

    @Override
    public void onInit(DepthRender render, AbsChartModule chartModule) {
        super.onInit(render, chartModule);
        attribute = render.getAttribute();

        gridLabelPaint.setTypeface(FontConfig.typeFace);
        gridLabelPaint.setTextSize(attribute.labelSize);
        gridLabelPaint.setColor(attribute.labelColor);
        gridLabelPaint.setTextAlign(Paint.Align.CENTER);

        gridPaint.setStyle(Paint.Style.STROKE);
        gridPaint.setStrokeWidth(attribute.lineWidth);
        gridPaint.setColor(attribute.labelColor);

        Utils.measureTextArea(gridLabelPaint, rect);
    }

    @Override
    public void computePoint(int begin, int end, int current) {

    }

    @Override
    public void onComputeOver(Canvas canvas, int begin, int end, float[] extremum) {
        for (int i = 0, z = attribute.gridCount - 1; i <= z; i++) {
            float x = viewRect.left + i * regionWidth;
            String value;
            if (i == 0) {
                value = absChartModule.getMinX().text;
                pointCache[0] = x + gridLabelPaint.measureText(value) / 2 + attribute.gridMarkLineLength;
            } else if (i == z) {
                value = absChartModule.getMaxX().text;
                pointCache[0] = x - gridLabelPaint.measureText(value) / 2 - attribute.gridMarkLineLength;
            } else {
                pointCache[0] = x - (i > (z / 2) ? absChartModule.getxOffset() :
                        -absChartModule.getxOffset());
                render.invertMapPoints(pointCache);
                value = ValueUtils.format(pointCache[0], render.getAdapter().getQuoteScale());
                pointCache[0] = x;
            }
            canvas.drawText(value, pointCache[0], gridLabelY, gridLabelPaint);
        }
    }

    @Override
    public void onDrawOver(Canvas canvas) {
    }

    @Override
    public void onViewChange() {
        regionWidth = viewRect.width() / (attribute.gridCount - 1);
        gridLabelY = viewRect.bottom + rect.height() + attribute.gridLabelMarginTop;
    }
}
