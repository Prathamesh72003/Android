package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class Practical13 extends AppCompatActivity implements FragOne.sendval {

    String one_tag = "one";
    String two_tag = "two";

    FragOne f1;
    FragTwo f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical13);

        FragmentManager fm = getSupportFragmentManager();

        f1 = (FragOne) fm.findFragmentByTag(one_tag);
        if(f1 == null){
            f1 = new FragOne();
            fm.beginTransaction().add(R.id.menufragment, f1, one_tag);
        }

        f2 = (FragTwo) fm.findFragmentByTag(two_tag);
        if(f2 == null){
            f2 = new FragTwo();
            fm.beginTransaction().add(R.id.detailfragment, f2, two_tag);
        }


    }

    @Override
    public void messagefromone(String message) {
        f2.NewMessage(message);
    }
}