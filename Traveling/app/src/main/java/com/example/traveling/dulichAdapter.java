package com.example.traveling;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class dulichAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List <dulich> arrayDulich;

    public dulichAdapter(Context context, int layout, List<dulich> dulichList) {
        myContext = context;
        myLayout = layout;
        arrayDulich = dulichList;
    }

    @Override
    public int getCount() {
        return arrayDulich.size();
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

        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout, null);

        TextView tvSong = (TextView) convertView.findViewById(R.id.tvTen);
        tvSong.setText(arrayDulich.get(position).Ten);
        TextView tvSinger = (TextView) convertView.findViewById(R.id.tvMota);
        tvSinger.setText(arrayDulich.get(position).Mota);
        ImageView ivPicture = (ImageView) convertView.findViewById(R.id.ivHinh);
        ivPicture.setImageResource(arrayDulich.get(position).Hinh);

        return convertView;
    }
}
