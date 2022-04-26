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
        /*switch (view.getId()){
            break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }*/
    }
}