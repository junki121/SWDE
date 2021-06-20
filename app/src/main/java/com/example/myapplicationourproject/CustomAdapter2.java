package com.example.myapplicationourproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter2 extends BaseAdapter {
    private ArrayList<Comment> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomAdapter2(Context context, ArrayList<Comment> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {

            convertView = layoutInflater.inflate(R.layout.show_list2, null);
            holder = new ViewHolder();

            holder.comment = (TextView) convertView.findViewById(R.id.text2);
            holder.name = (TextView) convertView.findViewById(R.id.text1);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.comment.setText(listData.get(position).getComment());
        holder.name.setText(listData.get(position).getName());

        return convertView;
    }

    static class ViewHolder {
        TextView name;
        TextView comment;
    }

}