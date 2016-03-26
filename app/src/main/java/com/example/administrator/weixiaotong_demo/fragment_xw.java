package com.example.administrator.weixiaotong_demo;

import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/3/20.
 */
public class fragment_xw extends Fragment {
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.xiaowang, container, false);
        ListView lv_xw = (ListView) v.findViewById(R.id.lv_xiaowang);
        lv_xw.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return 3;
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
                View v = View.inflate(getActivity(), R.layout.xiaowang_listview, null);
                ImageView iv1= (ImageView) v.findViewById(R.id.iv_xiaowang_listview_1);
                TextView tv1= (TextView) v.findViewById(R.id.tv_xiaowang_listview_1);
                ImageView iv2= (ImageView) v.findViewById(R.id.iv_xiaowang_listview_2);
                TextView tv2= (TextView) v.findViewById(R.id.tv_xiaowang_listview_2);
                TextView tv3= (TextView) v.findViewById(R.id.tv_xiaowang_listview_3);
                if(position==0){
                    iv1.setImageResource(R.drawable.gonggao);
                    tv1.setText("园所公告");
                    iv2.setImageResource(R.drawable.p2);
                    tv2.setText("111111111111111");
                    tv3.setText("222222222222222");
                }
                if(position==1){
                    iv1.setImageResource(R.drawable.xinwen);
                    tv1.setText("新闻动态");
                    iv2.setImageResource(R.drawable.p2);
                    tv2.setText("111111111111111");
                    tv3.setText("222222222222222");
                }
                if(position==2){
                    iv1.setImageResource(R.drawable.yuer);
                    tv1.setText("育儿知识");
                    iv2.setImageResource(R.drawable.p2);
                    tv2.setText("111111111111111");
                    tv3.setText("222222222222222");
                }
                return v;
            }
        });
        fixListViewHeight(lv_xw);

        return v;
    }

    public void fixListViewHeight(ListView listView) {

        // 如果没有设置数据适配器，则ListView没有子项，返回。

        ListAdapter listAdapter = listView.getAdapter();

        int totalHeight = 0;

        if (listAdapter == null) {

            return;

        }

        for (int i = 0; i < listAdapter.getCount(); i++) {

            View listViewItem = listAdapter.getView(i , null, listView);

            // 计算子项View 的宽高

            listViewItem.measure(0, 0);

            // 计算所有子项的高度和

            totalHeight += listViewItem.getMeasuredHeight();

        }



        ViewGroup.LayoutParams params = listView.getLayoutParams();

        // listView.getDividerHeight()获取子项间分隔符的高度

        // params.height设置ListView完全显示需要的高度


        params.height = totalHeight+ (listView.getDividerHeight() * (listAdapter.getCount() - 1));

        listView.setLayoutParams(params);

    }


}
