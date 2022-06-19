package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Practical14 extends AppCompatActivity {

    Switch s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical14);

        s1 = (Switch) findViewById(R.id.wifistate);

        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (s1.isChecked()){
                    WifiManager wm = (WifiManager) getBaseContext().getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wm.setWifiEnabled(true);
                }else{
                    WifiManager wm = (WifiManager) getBaseContext().getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                    wm.setWifiEnabled(false);
                }
            }
        });

    }
}