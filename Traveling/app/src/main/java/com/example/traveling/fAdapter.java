package com.example.traveling;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class fAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List <food> arrayF;

    public fAdapter(Context context, int layout, List<food> FList) {
        myContext = context;
        myLayout = layout;
        arrayF = FList;
    }

    @Override
    public int getCount() {
        return arrayF.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout, null);

        TextView tvSong = (TextView) convertView.findViewById(R.id.tvTen);
        tvSong.setText(arrayF.get(position).Ten);
        TextView tvSinger = (TextView) convertView.findViewById(R.id.tvMota);
        tvSinger.setText(arrayF.get(position).Mota);
        ImageView ivPicture = (ImageView) convertView.findViewById(R.id.ivHinh);
        ivPicture.setImageResource(arrayF.get(position).Hinh);

        return convertView;
    }
}
