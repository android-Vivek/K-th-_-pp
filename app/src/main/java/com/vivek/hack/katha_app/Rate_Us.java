package com.vivek.hack.katha_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Rate_Us extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.vivek.hack.katha_app.R.layout.activity_rate__us);
        Toast.makeText(this, "Rate Us", Toast.LENGTH_SHORT).show();
    }
}
