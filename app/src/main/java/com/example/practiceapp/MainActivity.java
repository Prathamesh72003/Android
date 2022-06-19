
package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b2 = (Button) findViewById(R.id.p2);
        b3 = (Button) findViewById(R.id.p3);
        b4 = (Button) findViewById(R.id.p4);
        b5 = (Button) findViewById(R.id.p5);
        b6 = (Button) findViewById(R.id.p6);
        b7 = (Button) findViewById(R.id.p7);
        b8 = (Button) findViewById(R.id.p8);
        b9 = (Button) findViewById(R.id.p9);
        b10 = (Button) findViewById(R.id.p10);
        b11 = (Button) findViewById(R.id.p11);
        b12 = (Button) findViewById(R.id.p12);
        b13 = (Button) findViewById(R.id.p13);
        b14 = (Button) findViewById(R.id.p14);
        b15 = (Button) findViewById(R.id.p15);
        b16 = (Button) findViewById(R.id.p16);
        b17 = (Button) findViewById(R.id.p17);
        b18 = (Button) findViewById(R.id.p18);
        b19 = (Button) findViewById(R.id.p19);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical1.class);
                startActivity(i1);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical1.class);
                startActivity(i1);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical4.class);
                startActivity(i1);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical5.class);
                startActivity(i1);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical6.class);
                startActivity(i1);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical7.class);
                startActivity(i1);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical8.class);
                startActivity(i1);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical9.class);
                startActivity(i1);
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical10.class);
                startActivity(i1);
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical6.class);
                startActivity(i1);
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical12.class);
                startActivity(i1);
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical13.class);
                startActivity(i1);
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical14.class);
                startActivity(i1);
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical15.class);
                startActivity(i1);
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical16.class);
                startActivity(i1);
            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical17.class);
                startActivity(i1);
            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical12.class);
                startActivity(i1);
            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Practical12.class);
                startActivity(i1);
            }
        });
    }
}