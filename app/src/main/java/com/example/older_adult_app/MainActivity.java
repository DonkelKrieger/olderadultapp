package com.example.older_adult_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Intent whatsAppActivity = new Intent(this, WhatsAppActivity.class);
        startActivity(whatsAppActivity);

    }

    public void onClickWifi(View view){
        Intent wifiActivity = new Intent(this, Activity_wifi_app.class);
        startActivity(wifiActivity);

    }

    public void onClickGmail(View view){
        Intent gmailActivity = new Intent(this, ActivityGmail.class);
        startActivity(gmailActivity);

    }
    public void onClickCalls(View view){
        Intent callsActivity = new Intent(this, ActivityCalls.class);
        startActivity(callsActivity);

    }
}