package com.example.practiceapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Practical17 extends AppCompatActivity {

    DatabaseAdapter db;
    EditText name,enroll,id,uid,uname,uenroll;
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical17);

        db = new DatabaseAdapter(this);

        name = (EditText) findViewById(R.id.name);
        enroll = (EditText) findViewById(R.id.enroll);
        id = (EditText) findViewById(R.id.id);

        uname = (EditText) findViewById(R.id.upname);
        uenroll = (EditText) findViewById(R.id.upenroll);
        uid = (EditText) findViewById(R.id.upid);

        b1 = (Button) findViewById(R.id.button2);
        b2 = (Button) findViewById(R.id.del);
        b3 = (Button) findViewById(R.id.upbtn);
        b4 = (Button) findViewById(R.id.seebtn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean check = db.InsertData(name.getText().toString(),enroll.getText().toString());

                if (check == true){
                    Toast.makeText(getApplicationContext(), "Data inserted successfully", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Failed to insert data", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res = db.DeleteData(id.getText().toString());

                if (res > 0){
                    Toast.makeText(getApplicationContext(), "Data deleted successfully!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Failed to delete data!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Boolean res = db.UpdateData(uid.getText().toString(),uname.getText().toString(),uenroll.getText().toString());

                if (res == true){
                    Toast.makeText(getApplicationContext(), "Data updated!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "failed to update Data !", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = db.getData();

                if (res.getCount() == 0){
                    ShowInfo("Error","Empty dataset");
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()){
                    buffer.append("Id: "+res.getString(0)+"\n");
                    buffer.append("Name: "+res.getString(1)+"\n");
                    buffer.append("Enrollment: "+res.getString(2)+"\n");
                }
                ShowInfo("Data",buffer.toString());
            }
        });

    }

    public void ShowInfo(String title, String message){
        AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}