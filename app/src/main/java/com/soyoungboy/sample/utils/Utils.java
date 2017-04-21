package com.soyoungboy.sample.utils;
/**
 * Created by Administrator on 2017/4/17.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class Utils {
    public Utils() {
    }


    public static boolean isCheckPhone(String phone) {
        return phone.length() == 11;
    }


    public static boolean matchTelephone(String telephone) {
        String reg = "^(13[0-9]|15[012356789]|17[05678]|18[0-9]|14[57])[0-9]{8}$";
        Matcher m = Pattern.compile(reg).matcher(telephone);
        return m.matches();
    }


    public static boolean isCheckPassword(String phone) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
        Matcher m = p.matcher(phone);
        return m.matches();
    }


    public static boolean isEmail(String email) {
        String str
            = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
        Pattern p = Pattern.compile(str);
        Matcher m = p.matcher(email);
        return m.matches();
    }


    public static String clearNotChinese(String buff) {
        String tmpString = buff.replaceAll("(?i)[^a-zA-Z0-9一-龥]", "");
        char[] carr = tmpString.toCharArray();

        for (int result = 0; result < tmpString.length(); ++result) {
            if (carr[result] < 255) {
                carr[result] = 32;
            }
        }

        String var4 = String.copyValueOf(carr).trim();
        var4 = var4.replaceAll(" ", "");
        return var4;
    }


    public static boolean isUserName(String name) {
        String reg
            = "^([a-z]|[A-Z]|[0-9]|[⺀-\u9fff])+|@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?|[wap.]{4}|[www.]{4}|[blog.]{5}|[bbs.]{4}|[.com]{4}|[.cn]{3}|[.net]{4}|[.org]{4}|[http://]{7}|[ftp://]{6}$";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(name);
        return m.matches();
    }


    public static boolean isRealname(String name) {
        String regEx
            = "^([a-z]|[A-Z]|[⺀-\u9fff])+|@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?|[wap.]{4}|[www.]{4}|[blog.]{5}|[bbs.]{4}|[.com]{4}|[.cn]{3}|[.net]{4}|[.org]{4}|[http://]{7}|[ftp://]{6}$";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(name);
        return m.matches();
    }


    public static int getWordCount(String s) {
        return s.toCharArray().length;
    }


    public static String getVersion(Context context) {
        String version = "";

        try {
            PackageInfo e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            version = e.versionName;
        } catch (NameNotFoundException var3) {
            var3.printStackTrace();
        }

        return version;
    }


    public static int getVersionCode(Context context) {
        int version = 0;

        try {
            PackageInfo e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            version = e.versionCode;
        } catch (NameNotFoundException var3) {
            var3.printStackTrace();
        }

        return version;
    }


    public static String int2ip(int ipInt) {
        StringBuilder sb = new StringBuilder();
        sb.append(ipInt & 255).append(".");
        sb.append(ipInt >> 8 & 255).append(".");
        sb.append(ipInt >> 16 & 255).append(".");
        sb.append(ipInt >> 24 & 255);
        return sb.toString();
    }


    public static String getLocalIpAddress(Context context) {
        try {
            WifiManager ex = (WifiManager) context.getSystemService("wifi");
            WifiInfo wifiInfo = ex.getConnectionInfo();
            int i = wifiInfo.getIpAddress();
            return int2ip(i);
        } catch (Exception var4) {
            return " 获取IP出错,请保证是WIFI,或者请重新打开网络!\n" + var4.getMessage();
        }
    }


    public static String getDSN(Context context) {
        TelephonyManager tm = (TelephonyManager) context.getSystemService("phone");
        return tm.getDeviceId();
    }


    public static JSONObject jsonObjectReq(Context context) {
        JSONObject obj = new JSONObject();
        String version = "";
        if (context != null) {
            version = getVersion(context);
        }

        try {
            obj.put("ver", version);
            obj.put("protocol_ver", 1);
            obj.put("platformType", 2);
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        return obj;
    }


    public static void openKeybord(EditText mEditText, Context mContext) {
        InputMethodManager imm = (InputMethodManager) mContext.getSystemService("input_method");
        imm.showSoftInput(mEditText, 2);
        imm.toggleSoftInput(2, 1);
    }


    public static void closeKeybord(EditText mEditText, Context mContext) {
        InputMethodManager imm = (InputMethodManager) mContext.getSystemService("input_method");
        imm.hideSoftInputFromWindow(mEditText.getWindowToken(), 0);
    }


    public static InputFilter getLengthFilter(final int length) {
        return new InputFilter() {
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dStart, int dEnd) {
                if ("".equals(source.toString())) {
                    return null;
                } else {
                    String dValue = dest.toString();
                    String[] splitArray = dValue.split("\\.");
                    if (splitArray.length > 1) {
                        String dotValue = splitArray[1];
                        int diff = dotValue.length() + 1 - length;
                        if (diff > 0) {
                            return source.subSequence(start, end - diff);
                        }
                    }

                    return null;
                }
            }
        };
    }


    public static SpannableStringBuilder highLight(String text, String target, String color) {
        SpannableStringBuilder spannable = new SpannableStringBuilder(text);
        Pattern p = Pattern.compile(target);
        Matcher m = p.matcher(text);

        while (m.find()) {
            ForegroundColorSpan span = new ForegroundColorSpan(Color.parseColor(color));
            spannable.setSpan(span, m.start(), m.end(), 33);
        }

        return spannable;
    }


    public static void doSendSMSTo(Context context, String phoneNumber, String message) {
        if (PhoneNumberUtils.isGlobalPhoneNumber(phoneNumber)) {
            Intent intent = new Intent("android.intent.action.SENDTO",
                Uri.parse("smsto:" + phoneNumber));
            intent.putExtra("sms_body", message);
            context.startActivity(intent);
        }

    }


    public static int getNoHasVirtualKey(Activity activity) {
        return activity.getWindowManager().getDefaultDisplay().getHeight();
    }


    public static int getHasVirtualKey(Activity activity) {
        int dpi = 0;
        Display display = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics dm = new DisplayMetrics();

        try {
            Class c = Class.forName("android.view.Display");
            Method e = c.getMethod("getRealMetrics", new Class[] { DisplayMetrics.class });
            e.invoke(display, new Object[] { dm });
            dpi = dm.heightPixels;
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        return dpi;
    }


    public static boolean checkDeviceHasNavigationBar(Context context) {
        boolean hasNavigationBar = false;
        Resources rs = context.getResources();
        int id = rs.getIdentifier("config_showNavigationBar", "bool", "android");
        if (id > 0) {
            hasNavigationBar = rs.getBoolean(id);
        }

        try {
            Class systemPropertiesClass = Class.forName("android.os.SystemProperties");
            Method m = systemPropertiesClass.getMethod("get", new Class[] { String.class });
            String navBarOverride = (String) m.invoke(systemPropertiesClass,
                new Object[] { "qemu.hw.mainkeys" });
            if ("1".equals(navBarOverride)) {
                hasNavigationBar = false;
            } else if ("0".equals(navBarOverride)) {
                hasNavigationBar = true;
            }
        } catch (Exception var7) {
            ;
        }

        return hasNavigationBar;
    }


    public static void setRemarkName(TextView tv, String userName, String remarkName) {
        if (TextUtils.isEmpty(remarkName)) {
            tv.setText(userName);
        } else {
            tv.setText(remarkName);
        }

    }


    public static void callTel(Context context, String phone) {
        Intent intent = new Intent("android.intent.action.DIAL");
        Uri data = Uri.parse("tel:" + phone);
        intent.setData(data);
        context.startActivity(intent);
    }


    public static enum FileType {
        TYPE_IMAGE_AVATAR,
        TYPE_IMAGE_ALBUM,
        TYPE_IMAGE_VENUE,
        TYPE_ACTIVITY,
        TYPE_CLUB,
        TYPE_DYNAMIC,
        TYPE_TOPIC,
        TYPE_AUCTION,
        TYPE_DEFAULT_LARK,
        TYPE_DEFAULT_ROUND_LARK,
        TYPE_BACKGROUND,
        TYPE_POSTER;


        private FileType() {
        }
    }
}
