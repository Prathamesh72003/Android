package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Practical10 extends AppCompatActivity {
    Button btn;
    LayoutInflater layoutInflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical10);
        btn = (Button) findViewById(R.id.btn);

        layoutInflater = getLayoutInflater();
        View layout = layoutInflater.inflate(R.layout.customtoast,(ViewGroup) findViewById(R.id.custom));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast t = new Toast(getApplicationContext());
                t.setView(layout);
                t.setDuration(Toast.LENGTH_LONG);
                t.show();
            }
        });
    }
}