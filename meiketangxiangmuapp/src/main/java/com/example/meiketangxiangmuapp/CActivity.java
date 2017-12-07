package com.example.meiketangxiangmuapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;

import butterknife.ButterKnife;

/**
 * Created by hp on 2017/12/4.
 */
public class CActivity extends Activity{
    private Button btn01,btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09,btn10,btn11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cactivity_main);
        btn01= (Button) findViewById(R.id.btn01);
        btn02= (Button) findViewById(R.id.btn02);
        btn03= (Button) findViewById(R.id.btn03);
        btn04= (Button) findViewById(R.id.btn04);
        btn05= (Button) findViewById(R.id.btn05);
        btn06= (Button) findViewById(R.id.btn06);
        btn07= (Button) findViewById(R.id.btn07);
        btn08= (Button) findViewById(R.id.btn08);
        btn09= (Button) findViewById(R.id.btn09);
        btn10= (Button) findViewById(R.id.btn10);
        btn11= (Button) findViewById(R.id.btn11);

    }


}
