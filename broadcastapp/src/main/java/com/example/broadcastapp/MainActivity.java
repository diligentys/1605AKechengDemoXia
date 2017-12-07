package com.example.broadcastapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MyBroadCast receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void send(View view) {
        Intent intent = new Intent();
        intent.putExtra("str","我是来自Activity当中的数据");
        intent.setAction("buba.us");
        sendBroadcast(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (receiver!=null){
            unregisterReceiver(receiver);
        }
    }
}
