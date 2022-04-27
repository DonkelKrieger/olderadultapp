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

    public void onClickCamera(View view){
        Intent cameraActivity = new Intent(this, CameraActivity.class);
        startActivity(cameraActivity);
    }
}