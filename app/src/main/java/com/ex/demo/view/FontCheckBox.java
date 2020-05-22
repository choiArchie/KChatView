package com.ex.demo.view;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatCheckBox;

import com.ex.chat.compat.FontConfig;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 * 自定义字体的checkbox
 */
public class FontCheckBox extends AppCompatCheckBox {

    public FontCheckBox(Context context) {
        super(context);
        initFont();
    }

    public FontCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        initFont();
    }

    public FontCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initFont();
    }

    public void initFont() {
        if (null != getTypeface() && getTypeface().isBold()) {
            this.setTypeface(FontConfig.boldTypeFace);
        } else {
            this.setTypeface(FontConfig.typeFace);
        }
        this.postInvalidate();
    }
}
