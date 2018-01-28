package com.vivek.hack.katha_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Share_App extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.vivek.hack.katha_app.R.layout.activity_share__app);
        Toast.makeText(this, "Welcome to Share App", Toast.LENGTH_SHORT).show();
    }
}
