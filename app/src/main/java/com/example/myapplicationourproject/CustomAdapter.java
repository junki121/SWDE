package com.example.myapplicationourproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private ArrayList<Post> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomAdapter(Context context, ArrayList<Post> listData) {
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

            convertView = layoutInflater.inflate(R.layout.show_list, null);
            holder = new ViewHolder();

            holder.title = (TextView) convertView.findViewById(R.id.text1);
            holder.name = (TextView) convertView.findViewById(R.id.text2);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.title.setText(listData.get(position).getTitle());
        holder.name.setText(listData.get(position).getName());

        return convertView;
    }

    static class ViewHolder {
        TextView name;
        TextView title;
    }

}
