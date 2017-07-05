package com.example.cj.testgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by CJ on 2017/7/5.
 */

public class MyAdapter extends BaseAdapter {
    private int[] images;
    private String[] names;
    private Context context;

    public MyAdapter(int[] images, String[] names, Context context) {
        super();
        this.images = images;
        this.names = names;
        this.context = context;
    }


    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return names[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            //将一个布局转化为View对象
            convertView = LayoutInflater.from(context).inflate(R.layout.grid_adapter_item, null);
            holder = new ViewHolder();
            holder.image = (ImageView) convertView.findViewById(R.id.grid_image);
            holder.name = (TextView) convertView.findViewById(R.id.grid_name);
            //打标签
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        //赋值
        holder.image.setImageResource(images[position]);
        holder.name.setText(names[position]);
        return convertView;
    }

    class ViewHolder {
        TextView name;
        ImageView image;
    }

}
