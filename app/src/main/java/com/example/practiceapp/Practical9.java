package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

public class Practical9 extends AppCompatActivity {
    ListView lv;
    GridView gv;
    String[] departments = {"Computer", "IT", "Civil", "Mechanical","Meta","DDGM"};
    GridAdapter gridAdapter;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical9);

        lv = (ListView) findViewById(R.id.ListDep);
        tv = (TextView) findViewById(R.id.res);
//        gv = (GridView) findViewById(R.id.gridview);

//        gridAdapter = new GridAdapter(getApplicationContext());

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, departments);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv.setText(lv.getItemAtPosition(i).toString());
            }
        });

//        gv.setAdapter(gridAdapter);

    }
}