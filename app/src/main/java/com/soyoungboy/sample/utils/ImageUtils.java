package com.soyoungboy.sample.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

/**
 * Created by Administrator on 2017/4/17.
 */

public class ImageUtils {
    public static void loadImage(Context context, int width, int height, String url, int defaultId, ImageView view) {
        if(context != null) {
            if(!TextUtils.isEmpty(url)) {
                Glide.with(context).load(getNetWorkImageUrl(context, width, height, url)).placeholder(defaultId).dontAnimate().centerCrop().into(view);
            } else {
                view.setImageResource(defaultId);
            }

        }
    }

    public static String getNetWorkImageUrl(Context context, int dpWidth, int dpHeight, String srcUrl) {
        if(TextUtils.isEmpty(srcUrl)) {
            throw new IllegalArgumentException("[Error]=====Method ImageUtils.getNetWorkImageUrl() called error，Param srcUrl is null or empty=====");
        } else if(srcUrl.contains("upaiyun")) {
            boolean width = false;
            int width1;
            if(dpWidth == 0) {
                width1 = DisplayUtil.getScreenWidth(context);
            } else {
                width1 = DisplayUtil.dip2px(context, (float)dpWidth);
            }

            int height = DisplayUtil.dip2px(context, (float)dpHeight);
            StringBuilder builder = new StringBuilder(srcUrl);
            builder.append("!/fwfh/").append(width1).append("x").append(height);
            builder.append("/format/webp/quality/65/compress/true/strip/true");
            return builder.toString();
        } else {
            return srcUrl;
        }
    }
}
