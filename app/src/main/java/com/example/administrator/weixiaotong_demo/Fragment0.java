package com.example.administrator.weixiaotong_demo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.FrameLayout;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;


public class Fragment0 extends FragmentActivity {
    private FrameLayout fm;
    private Button bt_mine;
    private Button bt_xiaowang;
    private Button bt_baby;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment);
        fm = (FrameLayout) findViewById(R.id.fm_content);
        bt_baby= (Button) findViewById(R.id.bt_fm_1);
        bt_xiaowang= (Button) findViewById(R.id.bt_fm_4);
        bt_mine = (Button) findViewById(R.id.bt_fm_5);

        FragmentManager fm1 = getFragmentManager();
        FragmentTransaction ts = fm1.beginTransaction();
        fragment_baby fm_baby=new fragment_baby();
        ts.replace(R.id.fm_content,fm_baby);
        ts.commit();

        bt_baby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm1 = getFragmentManager();
                FragmentTransaction ts = fm1.beginTransaction();
                fragment_baby fm_baby=new fragment_baby();
                ts.replace(R.id.fm_content,fm_baby);
                ts.commit();
            }
        });
        bt_xiaowang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm1 = getFragmentManager();
                FragmentTransaction ts = fm1.beginTransaction();
                fragment_xw fm_xiaowang=new fragment_xw();
                ts.replace(R.id.fm_content,fm_xiaowang);
                ts.commit();
            }
        });
        bt_mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm1 = getFragmentManager();
                FragmentTransaction ts = fm1.beginTransaction();
                fragment_mine fm_mine=new fragment_mine();
                ts.replace(R.id.fm_content,fm_mine);
                ts.commit();

            }
        });


    }


}