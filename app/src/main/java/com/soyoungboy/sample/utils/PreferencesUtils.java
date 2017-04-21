package com.soyoungboy.sample.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/**
 * Created by Administrator on 2017/4/17.
 */

public class PreferencesUtils {
    private PreferencesUtils() {
        throw new AssertionError();
    }


    public static boolean putString(Context context, String key, String value) {
        return context == null ? false : putString(context, "LARK", key, value);
    }


    public static boolean putString(Context context, String name, String key, String value) {
        if (context == null) {
            return false;
        } else {
            SharedPreferences settings = context.getSharedPreferences(name, 0);
            Editor editor = settings.edit();
            editor.putString(key, value);
            return editor.commit();
        }
    }


    public static String getString(Context context, String key) {
        return context == null ? null : getString(context, key, (String) null);
    }


    public static String getString(Context context, String key, String defaultValue) {
        return context == null ? defaultValue : getString(context, "LARK", key, defaultValue);
    }


    public static String getString(Context context, String name, String key, String defaultValue) {
        if (context == null) {
            return defaultValue;
        } else {
            SharedPreferences settings = context.getSharedPreferences(name, 0);
            return settings.getString(key, defaultValue);
        }
    }


    public static boolean putInt(Context context, String key, int value) {
        return context == null ? false : putInt(context, "LARK", key, value);
    }


    public static boolean putInt(Context context, String name, String key, int value) {
        if (context == null) {
            return false;
        } else {
            SharedPreferences settings = context.getSharedPreferences(name, 0);
            Editor editor = settings.edit();
            editor.putInt(key, value);
            return editor.commit();
        }
    }


    public static int getInt(Context context, String key) {
        return context == null ? -1 : getInt(context, key, -1);
    }


    public static int getInt(Context context, String key, int defaultValue) {
        return context == null ? defaultValue : getInt(context, "LARK", key, defaultValue);
    }


    public static int getInt(Context context, String name, String key, int defaultValue) {
        if (context == null) {
            return defaultValue;
        } else {
            SharedPreferences settings = context.getSharedPreferences(name, 0);
            return settings.getInt(key, defaultValue);
        }
    }


    public static boolean putLong(Context context, String key, long value) {
        return context == null ? false : putLong(context, "LARK", key, value);
    }


    public static boolean putLong(Context context, String name, String key, long value) {
        if (context == null) {
            return false;
        } else {
            SharedPreferences settings = context.getSharedPreferences(name, 0);
            Editor editor = settings.edit();
            editor.putLong(key, value);
            return editor.commit();
        }
    }


    public static long getLong(Context context, String key) {
        return context == null ? -1L : getLong(context, key, -1L);
    }


    public static long getLong(Context context, String key, long defaultValue) {
        return context == null ? defaultValue : getLong(context, "LARK", key, defaultValue);
    }


    public static long getLong(Context context, String name, String key, long defaultValue) {
        if (context == null) {
            return defaultValue;
        } else {
            SharedPreferences settings = context.getSharedPreferences(name, 0);
            return settings.getLong(key, defaultValue);
        }
    }


    public static boolean putFloat(Context context, String key, float value) {
        return context == null ? false : putFloat(context, "LARK", key, value);
    }


    public static boolean putFloat(Context context, String name, String key, float value) {
        if (context == null) {
            return false;
        } else {
            SharedPreferences settings = context.getSharedPreferences(name, 0);
            Editor editor = settings.edit();
            editor.putFloat(key, value);
            return editor.commit();
        }
    }


    public static float getFloat(Context context, String key) {
        return context == null ? -1.0F : getFloat(context, key, -1.0F);
    }


    public static float getFloat(Context context, String key, float defaultValue) {
        return context == null ? defaultValue : getFloat(context, "LARK", key, defaultValue);
    }


    public static float getFloat(Context context, String name, String key, float defaultValue) {
        if (context == null) {
            return defaultValue;
        } else {
            SharedPreferences settings = context.getSharedPreferences(name, 0);
            return settings.getFloat(key, defaultValue);
        }
    }


    public static boolean putBoolean(Context context, String key, boolean value) {
        return context == null ? false : putBoolean(context, "LARK", key, value);
    }


    public static boolean putBoolean(Context context, String name, String key, boolean value) {
        if (context == null) {
            return false;
        } else {
            SharedPreferences settings = context.getSharedPreferences(name, 0);
            Editor editor = settings.edit();
            editor.putBoolean(key, value);
            return editor.commit();
        }
    }


    public static boolean getBoolean(Context context, String key) {
        return context == null ? false : getBoolean(context, key, false);
    }


    public static boolean getBoolean(Context context, String key, boolean defaultValue) {
        return context == null ? defaultValue : getBoolean(context, "LARK", key, defaultValue);
    }


    public static boolean getBoolean(Context context, String name, String key, boolean defaultValue) {
        if (context == null) {
            return defaultValue;
        } else {
            SharedPreferences settings = context.getSharedPreferences(name, 0);
            return settings.getBoolean(key, defaultValue);
        }
    }


    public static boolean remove(Context context, String key) {
        return context == null ? false : remove(context, "LARK", key);
    }


    public static boolean remove(Context context, String name, String key) {
        if (context == null) {
            return false;
        } else {
            SharedPreferences settings = context.getSharedPreferences(name, 0);
            Editor editor = settings.edit();
            editor.remove(key);
            return editor.commit();
        }
    }
}
