package com.example.practiceapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {

    Context context;
    public GridAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView imageView;

        if (view == null){
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(85,85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        }else{
            imageView = (ImageView) view;
        }

        imageView.setImageResource(images[i]);

        return imageView;
    }
    Integer[] images = {R.drawable.androibg,R.drawable.girl,R.drawable.grp,R.drawable.dog,R.drawable.firebaseauth,R.drawable.mongo,R.drawable.update};

}
