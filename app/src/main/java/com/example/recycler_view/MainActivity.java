package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.rcView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String arr[]={"c","c==","java","php","c","c==","java","php","c","c==","java","php","c","c" +
                "==","java","php","c","c==","java","php"};
        recyclerView.setAdapter(new myAdapter(arr));
    }
}