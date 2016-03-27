package com.example.administrator.weixiaotong_demo;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;

import java.util.Timer;


/**
 * Created by Administrator on 2016/3/27.
 */
public class wangjimima_getPhonenumber extends Activity {
    private Button bt_yanzhengma;
    int count=30;
    Timer timer = new Timer();
    Handler handler=new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){
                case 0:
                    bt_yanzhengma.setText("" + count);
                    bt_yanzhengma.setClickable(false);break;
                case 1:
                    timer.cancel();
                    bt_yanzhengma.setClickable(true);
                    bt_yanzhengma.setText("重新获取");
                    count=30;break;

            }
        }
    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getphongnumber);
        bt_yanzhengma= (Button) findViewById(R.id.yanzhengma);
        bt_yanzhengma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                starCount();
            }
        });
    }

    public void starCount(){
        new Thread() {
            public void run() {
               for(int i=0;i<30;i++){
                   count--;
                   handler.sendEmptyMessage(0);
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
                handler.sendEmptyMessage(1);


            }
        }.start();
    }
}
