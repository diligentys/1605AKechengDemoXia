package com.example.meiketangxiangmuapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by hp on 2017/12/4.
 */
public class initListView {
    public static void initHeight(ListView lv){
        int height1=0;
        //获取listview适配器
        ListAdapter listadapter=lv.getAdapter();
        //获取适配器所有条目
        for (int i = 0; i < listadapter.getCount(); i++) {
            //设置View视图
            View view=listadapter.getView(i, null, lv);
            //从0开始测量
            view.measure(0, 0);
            //测量到最后并且加一
            height1+=view.getMeasuredHeight();
        }
        //获取listview的属性
        ViewGroup.LayoutParams params=lv.getLayoutParams();
        //给listview重新设置高度并且加上分割线
        params.height=height1+(lv.getDividerHeight()*lv.getCount()-1);
        //设置布局参数
        lv.setLayoutParams(params);
    }
}
