package com.example.projectapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class CategoryAdapter extends BaseAdapter {
    private Context context;
    public CategoryAdapter(Context ctx)
    {
        context=ctx;
    }
    @Override
    public int getCount() {
        return MainPage.categoryImages.length;
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
        convertView= LayoutInflater.from(context).inflate(R.layout.single_category_item,null);
        ImageView imageView=convertView.findViewById(R.id.imageView);
        TextView title=convertView.findViewById(R.id.title);
        title.setText(MainPage.categoryNames[position]);
       // imageView.setImageResource(MainPage.categoryImages[position]);
       // Picasso.with(context).load(MainPage.categoryImages[position]).into(imageView);
        Glide.with(context).load(MainPage.categoryImages[position]).into(imageView);
        return convertView;
    }
}
