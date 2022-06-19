package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Practical5 extends AppCompatActivity {

    ToggleButton tbtn;
    ImageButton ibtn;
    ImageView img;
    TextView heading,para;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical5);

        tbtn = (ToggleButton) findViewById(R.id.toggleButton);
        ibtn = (ImageButton) findViewById(R.id.imageButton);
        img = (ImageView) findViewById(R.id.imageButton);
        heading = (TextView) findViewById(R.id.textView);
        para = (TextView) findViewById(R.id.des);

        tbtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (tbtn.isChecked()){
                    ibtn.setVisibility(View.VISIBLE);
                }else {
                    ibtn.setVisibility(View.INVISIBLE);
                }
            }
        });

        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                heading.setVisibility(View.VISIBLE);
                img.setVisibility(View.VISIBLE);
                para.setVisibility(View.VISIBLE);
            }
        });


    }
}