package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Practical8 extends AppCompatActivity {

    ProgressBar progressBar;
    Button btn;
    EditText editText;
    TextView textView;
    int progress;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical8);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        btn = (Button) findViewById(R.id.btn);
        editText = (EditText) findViewById(R.id.input);
        textView = (TextView) findViewById(R.id.prog);

        handler = new Handler();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                progress = progressBar.getProgress();

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (progress = Integer.parseInt(editText.getText().toString()); progress < 100; progress++) {
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar.setProgress(progress);
                                    textView.setText(progress+"/"+progressBar.getMax());
                                }
                            });

                            try {
                                Thread.sleep(200);
                            }catch (Exception e){
                                Log.d("Thread", "run: "+e);
                            }
                        }
                    }
                }).start();
            }
        });


    }
}