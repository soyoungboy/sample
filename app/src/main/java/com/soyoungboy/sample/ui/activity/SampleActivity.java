package com.soyoungboy.sample.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.soyoungboy.sample.R;

/**
 * 1 Toolbar的使用
 * 2 调用横向RecyclerView的TopicActivity
 * Created by Administrator on 2017/4/17.
 */

public class SampleActivity extends Activity implements View.OnClickListener {
    /** start download apk */
    private Button button;


    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sampleactivity);
        initView();
    }


    private void initView() {
        button = (Button) findViewById(R.id.button);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ActionMenuView action_menu_view = (ActionMenuView) findViewById(R.id.action_menu_view);
        getMenuInflater().inflate(R.menu.main, action_menu_view.getMenu());
        action_menu_view.setOnMenuItemClickListener(new ActionMenuView.OnMenuItemClickListener() {
            @Override public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_first:
                        toastMenuTitle(item);
                        break;
                    case R.id.item_second:
                        toastMenuTitle(item);
                        break;
                    case R.id.item_third:
                        toastMenuTitle(item);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });

        //Toolbar 设置标题
        toolbar.setTitle("title");
        toolbar.setSubtitle("subTitle");
        //加载menu设置
        toolbar.inflateMenu(R.menu.main);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_first:
                        toastMenuTitle(item);
                        break;
                    case R.id.item_second:
                        toastMenuTitle(item);
                        break;
                    case R.id.item_third:
                        toastMenuTitle(item);
                        break;
                    default:
                        break;
                }
                return true;
            }
        });
        button.setOnClickListener(this);

    }


    private void toastMenuTitle(MenuItem item) {
        Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT)
            .show();
    }


    @Override public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent intent = new Intent(SampleActivity.this, TopicActivity.class);
                startActivity(intent);
                break;
        }
    }
}
