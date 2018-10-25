package com.example.ablex.mymvp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ablex.mymvp.R;
import com.example.ablex.mymvp.bean.Girl;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private List<Girl> datas;
    private Context context;

    public MyAdapter(Context context, List<Girl> datas) {
        this.context = context;
        this.datas = datas;
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            if (inflater != null) {
                convertView = inflater.inflate(R.layout.item, parent, false);
            }
            viewHolder = new ViewHolder();
            if (convertView != null) {
                viewHolder.id_int = convertView.findViewById(R.id.imageView);
                viewHolder.name_text = convertView.findViewById(R.id.textView);
                convertView.setTag(viewHolder);
            }
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.name_text.setText(datas.get(position).getName());
        viewHolder.id_int.setImageResource(datas.get(position).getImageId());
        return convertView;
    }

    class ViewHolder {
        TextView name_text;
        ImageView id_int;
    }
}