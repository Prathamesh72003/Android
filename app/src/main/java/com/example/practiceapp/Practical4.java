package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Practical4 extends AppCompatActivity {

    AutoCompleteTextView actv;
    EditText name;
    TextView t1,t2;
    Button btn;

    String[] departments = {"Computer", "IT", "Civil", "Mechanical","Meta","DDGM"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical4);

        actv = (AutoCompleteTextView) findViewById(R.id.AutoChooser);
        name = (EditText) findViewById(R.id.InputField);
        t1 = (TextView) findViewById(R.id.dep);
        t2 = (TextView) findViewById(R.id.name);
        btn = (Button) findViewById(R.id.btn);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, departments);
        actv.setAdapter(adapter);

        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                t1.setText(actv.getText().toString());
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t2.setText(name.getText().toString());
            }
        });




    }
}