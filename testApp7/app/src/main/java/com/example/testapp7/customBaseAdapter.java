package com.example.testapp7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class customBaseAdapter extends BaseAdapter {
    Context context;
    String [] fruitList;
    int [] fruitImages;
    LayoutInflater inflater;
    public customBaseAdapter(Context ctx,String[]fruitList,int[]fruitImages) {
        this.context = ctx;
        this.fruitList = fruitList;
        this.fruitImages = fruitImages;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return fruitList.length;
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
        convertView = inflater.inflate(R.layout.activity_custom_list_view,null);
        TextView txtView = (TextView) convertView.findViewById(R.id.textView);
        convertView.findViewById(R.id.imageIcon).setBackgroundResource(fruitImages[position]);
        txtView.setText(fruitList[position]);
        return convertView;
    }
}
