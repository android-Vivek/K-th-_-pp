package com.vivek.hack.katha_app;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash_screen extends AppCompatActivity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.vivek.hack.katha_app.R.layout.activity_splash_screen);
    handler =new Handler();
        handler.postDelayed(r,2000);
    }

    Runnable r = new Runnable() {
        @Override
        public void run() {

            startActivity(new Intent(splash_screen.this,MainActivity.class));
            finish();

        }
    };




}
