package com.soyoungboy.sample.utils;

import android.content.Context;
import android.view.WindowManager;

/**
 * Created by Administrator on 2017/4/17.
 */

public class DisplayUtil {
    public DisplayUtil() {
    }

    public static int dip2px(Context context, float dpValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dpValue * scale + 0.5F);
    }

    public static int px2dip(Context context, float pxValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int)(pxValue / scale + 0.5F);
    }

    public static int getScreenHeight(Context context) {
        int screenHeight = PreferencesUtils.getInt(context, "screenHeight", 0);
        if(screenHeight == 0) {
            WindowManager wm = (WindowManager)context.getSystemService("window");
            screenHeight = wm.getDefaultDisplay().getHeight();
            PreferencesUtils.putInt(context, "screenHeight", screenHeight);
        }

        return screenHeight;
    }

    public static int getScreenWidth(Context context) {
        int screenWidth = PreferencesUtils.getInt(context, "screenWidth", 0);
        if(screenWidth == 0) {
            WindowManager wm = (WindowManager)context.getSystemService("window");
            screenWidth = wm.getDefaultDisplay().getWidth();
            PreferencesUtils.putInt(context, "screenWidth", screenWidth);
        }

        return screenWidth;
    }
}
