package com.example.projectapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class CategoryItems extends AppCompatActivity {

    private GridView gridView;
    static int Images[]={R.drawable.book,R.drawable.book2};
    static String names[]={"Book_1","Book_2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_items);
        gridView=(GridView)findViewById(R.id.gridView);
        CategoryItemAdapter adapter=new CategoryItemAdapter(this);
        gridView.setAdapter(adapter);
    }
}
