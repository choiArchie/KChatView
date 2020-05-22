package com.ex.demo;

import android.app.Application;
import android.content.Context;

import com.ex.demo.util.DataUtils;

/**
 * author wancheng
 * date   2020/4/29
 * desc  The code can't block the young lady!
 * version  v1.0
 */
public class KChatMyApplication extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        DataUtils.destroy();
    }
}
