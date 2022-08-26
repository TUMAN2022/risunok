package com.example.risunok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(new risunok(this));
        setContentView(new DrawFractals(this));
        getSupportActionBar().hide();
    }
}