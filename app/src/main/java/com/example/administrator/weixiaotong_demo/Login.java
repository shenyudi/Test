package com.example.administrator.weixiaotong_demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.util.logging.LogRecord;

/**
 * Created by Administrator on 2016/3/19.
 */
public class Login extends AppCompatActivity {
    private Button bt_login;
    private EditText et_userphone;
    private SharedPreferences sp;
    private TextView tv_1;
    private TextView tv_2;
    private Handler handler=new Handler() {

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        bt_login= (Button) findViewById(R.id.bt_login);
        et_userphone= (EditText) findViewById(R.id.et_userphone);
        sp=getSharedPreferences("login",0);
        tv_1= (TextView) findViewById(R.id.tv_1);
        tv_2= (TextView) findViewById(R.id.tv_2);
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((et_userphone.getText().toString().trim()).equals("")) {
                    Toast.makeText(getApplication(), "用户名不能为空", Toast.LENGTH_SHORT).show();
                }else{


                    SharedPreferences.Editor edit=sp.edit();
                    edit.putString("userphone",et_userphone.getText().toString().trim());
                    edit.commit();
                    Intent intent = new Intent(Login.this, Fragment0.class);

                    startActivity(intent);
                }

            }
        });
        tv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,zhuze_getPhonenumber.class);

                startActivity(intent);
            }
        });
        tv_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,zhuze_getPhonenumber.class);

                startActivity(intent);
            }
        });
    }

}