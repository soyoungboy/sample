package com.soyoungboy.sample.download;

import android.app.DownloadManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Environment;
import android.os.IBinder;
import android.support.annotation.Nullable;
import java.io.File;

/**
 * DownloadService调用DownloadManager进行应用下载
 * Created by Administrator on 2017/4/17.
 */

public class DownloadService extends Service {
    private long enqueue;
    private BroadcastReceiver receiver;


    public DownloadService() {
    }


    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }


    public int onStartCommand(Intent intent, int flags, int startId) {
        this.receiver = new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                long id = intent.getLongExtra("extra_download_id", -1L);
                if (id == DownloadService.this.enqueue) {
                    intent = new Intent("android.intent.action.VIEW");
                    intent.setFlags(268435456);
                    intent.setDataAndType(
                        Uri.fromFile(new File(Environment.getExternalStorageDirectory() +
                            "/download/app-lark-release.apk")),
                        "application/vnd.android.package-archive");
                    DownloadService.this.startActivity(intent);
                    DownloadService.this.stopSelf();
                }

            }
        };
        this.registerReceiver(this.receiver,
            new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        this.startDownload();
        return Service.START_STICKY;
    }


    public void onDestroy() {
        this.unregisterReceiver(this.receiver);
        super.onDestroy();
    }


    private void startDownload() {
        DownloadManager dm = (DownloadManager) this.getSystemService("download");
        DownloadManager.Request request = new DownloadManager.Request(
            Uri.parse("http://file.anruan.com/soft/2/com.qihoo.appstore_300050260.apk"));
        request.setMimeType("application/vnd.android.package-archive");
        request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,
            "app-lark-release.apk");
        this.enqueue = dm.enqueue(request);
    }
}
