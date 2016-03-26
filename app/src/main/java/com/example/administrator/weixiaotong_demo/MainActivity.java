package com.example.administrator.weixiaotong_demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Timer time = new Timer();
        if (check()) {
            TimerTask task = new TimerTask() {
                @Override
                public void run() {


                        final Intent intent = new Intent();
                        intent.setClass(MainActivity.this, Fragment0.class);
                        startActivity(intent);
                }};   time.schedule(task,3000);
        } else {
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                        Intent intent = new Intent(MainActivity.this, Login.class);
                        startActivity(intent);
                }};
            time.schedule(task,3000);
        }





    }
    private Boolean check(){
        sp=getSharedPreferences("login",0);
        String s=sp.getString("userphone",null);

        if(TextUtils.isEmpty(s)){
            return false;
        }else{
            return true;
        }
    }
}
