package com.example.administrator.weixiaotong_demo;

import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/3/20.
 */
public class fragment_mine extends Fragment {
    private SharedPreferences sp;

    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState){
        View v= inflater.inflate(R.layout.mine, container,false);
        sp=getActivity().getSharedPreferences("login",0);
        ListView lv1= (ListView) v.findViewById(R.id.lv1);
        ListView lv2= (ListView) v.findViewById(R.id.lv2);
        ListView lv3=(ListView)v.findViewById(R.id.lv3);
        ListView lv4=(ListView)v.findViewById(R.id.lv4);
        ListView lv5=(ListView)v.findViewById(R.id.lv5);
        ListView lv6=(ListView)v.findViewById(R.id.lv6);
        ListView lv7=(ListView)v.findViewById(R.id.lv7);
        Button bt_mine_exit= (Button)v. findViewById(R.id.bt_mine_exit);
        lv1.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 1;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                return View.inflate(getActivity(),R.layout.mine_listview1,null);
            }
        });

        lv2.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 1;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                String s = sp.getString("userphone", null);
                View view= View.inflate(getActivity(), R.layout.mine_listview2, null);
                TextView tv_user=(TextView) view.findViewById(R.id.tv_user);
                tv_user.setText(s);



                return view;
            }
        });
        lv3.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 1;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                return View.inflate(getActivity(),R.layout.mine_listview3,null);
            }
        });
        lv4.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 1;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                return View.inflate(getActivity(),R.layout.mine_listview4,null);
            }
        });
        lv5.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 1;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                return View.inflate(getActivity(),R.layout.mine_listview5,null);
            }
        });
        lv6.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 1;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                return View.inflate(getActivity(),R.layout.mine_listview6,null);
            }
        });
        lv7.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 1;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                return View.inflate(getActivity(), R.layout.mine_listview7, null);
            }
        });
        bt_mine_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sp.edit();
                editor.remove("userphone");
                editor.commit();
                Toast.makeText(getActivity(), "退出成功", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getActivity(), Login.class);
                startActivity(intent);
            }
        });
        return v;
    }


}
