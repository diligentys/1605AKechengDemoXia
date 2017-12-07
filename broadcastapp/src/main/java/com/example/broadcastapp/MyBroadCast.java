package com.example.broadcastapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by hp on 2017/12/6.
 */
public class MyBroadCast extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        String str = intent.getStringExtra("str");
        Toast.makeText(context,str, Toast.LENGTH_SHORT).show();
    }
}
