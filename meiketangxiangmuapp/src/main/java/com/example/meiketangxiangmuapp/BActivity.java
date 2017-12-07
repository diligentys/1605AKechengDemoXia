package com.example.meiketangxiangmuapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.os.Handler;
import android.widget.Toast;
import com.jwenfeng.library.pulltorefresh.BaseRefreshListener;
import com.jwenfeng.library.pulltorefresh.PullToRefreshLayout;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import java.util.ArrayList;
import butterknife.ButterKnife;
import butterknife.InjectView;
import okhttp3.Call;

/**
 * Created by hp on 2017/12/4.
 */
public class BActivity extends Activity{
    @InjectView(R.id.activity_main)
    PullToRefreshLayout activityMain;
    @InjectView(R.id.mLv)
    ListView mLv;
    private ArrayList<String> list;
    private String url = "http://api.dameiketang.com/Appapi/select/selectImg.json";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bactivity_main);
        ButterKnife.inject(this);
        //接收list
        list = getIntent().getStringArrayListExtra("list");
        initwangluo(url);
        pulltorefreshlayout();
        initToasts();
    }

    private void initToasts() {
        mLv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, list));
        for (int i=0;i<list.size();i++){
            Log.e("tag",list.get(i)+"  ");
        }

    }

    private void initwangluo(String url) {
        OkHttpUtils
                .get()
                .url(url)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e, int id) {
                    }

                    @Override
                    public void onResponse(final String response, int id) {
                        Log.e("tag", response.toString() + "");
                    }
                });

    }

    private void pulltorefreshlayout() {
        activityMain.setRefreshListener(new BaseRefreshListener() {
            @Override
            public void refresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        activityMain.finishRefresh();
                        Toast.makeText(BActivity.this, "刷新", Toast.LENGTH_SHORT).show();
                    }
                }, 2000);
            }

            @Override
            public void loadMore() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        activityMain.finishLoadMore();
                        Toast.makeText(BActivity.this, "加载", Toast.LENGTH_SHORT).show();
                    }
                }, 2000);
            }
        });


    }
}
