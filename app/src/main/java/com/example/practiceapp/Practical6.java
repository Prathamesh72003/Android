package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class Practical6 extends AppCompatActivity {

    CheckBox c1,c2,c3;
    Button b1;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical6);

        c1 = (CheckBox) findViewById(R.id.s1);
        c2 = (CheckBox) findViewById(R.id.s2);
        c3 = (CheckBox) findViewById(R.id.s3);

        b1 = (Button) findViewById(R.id.button);

        tv = (TextView) findViewById(R.id.res);

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (c1.isChecked()){
                    tv.append(c1.getText().toString());
                }else{
                    tv.append("");
                }
            }
        });

        c2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (c2.isChecked()){
                    tv.append(c2.getText().toString());
                }else{
                    tv.append("");
                }
            }
        });

        c3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (c3.isChecked()){
                    tv.append(c3.getText().toString());
                }else{
                    tv.append("");
                }
            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setVisibility(View.VISIBLE);
            }
        });

    }
}