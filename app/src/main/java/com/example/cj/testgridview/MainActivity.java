package com.example.cj.testgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private int[] images = {R.drawable.dao, R.drawable.dog, R.drawable.doge, R.drawable.flower, R.drawable.grass, R.drawable.dao, R.drawable.dog, R.drawable.doge, R.drawable.flower, R.drawable.grass, R.drawable.dao, R.drawable.dog, R.drawable.doge, R.drawable.flower, R.drawable.grass};
    private String[] names = {"刀", "狗1", "狗2", "花", "草", "刀", "狗1", "狗2", "花", "草", "刀", "狗1", "狗2", "花", "草"};
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化
        gridView = (GridView) findViewById(R.id.grid);
        adapter = new MyAdapter(images, names, this);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "点击了" + adapter.getItem(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
