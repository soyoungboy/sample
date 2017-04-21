package com.soyoungboy.sample.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;
import com.angel.interfaces.OnTouchUpListener;
import com.angel.layout.SWPullRecyclerLayout;
import com.soyoungboy.sample.R;
import com.soyoungboy.sample.adapter.NumAdapter;
import java.util.ArrayList;
import java.util.List;

/**
 * SWPullRecyclerLayout使用demo
 * Created by Administrator on 2017/4/21.
 */

public class SWPullRecyclerLayoutActivity extends Activity {
    private SWPullRecyclerLayout recycler;
    private View header;
    private View footer;


    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swpullrecyclerlayout);
        initView();
    }


    private void initView() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add(i + 1 + "");
        }

        recycler = (SWPullRecyclerLayout) findViewById(R.id.recycler);
        header = LayoutInflater.from(this).inflate(R.layout.header, null);
        footer = LayoutInflater.from(this).inflate(R.layout.footer, null);
        recycler.addHeaderView(header, 100);
        recycler.addFooterView(footer, 100);
        NumAdapter adapter = new NumAdapter(this, list);
        recycler.setMyRecyclerView(new LinearLayoutManager(this), adapter);
        recycler.addOnTouchUpListener(new OnTouchUpListener() {
            @Override public void OnRefreshing() {
                Toast.makeText(getApplicationContext(), "刷新中...", Toast.LENGTH_SHORT).show();
            }


            @Override public void OnLoading() {
                Toast.makeText(getApplicationContext(), "加载更多...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
