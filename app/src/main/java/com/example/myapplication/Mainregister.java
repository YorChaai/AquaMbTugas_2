package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mainregister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainregister);
    }
    public void mainhome3(View view) {
        Intent intent = new Intent(Mainregister.this, Mainhome2.class);
        startActivity(intent);
    }
    public void register(View view) {
        Intent intent = new Intent(Mainregister.this,Mainlogin .class);
        startActivity(intent);
    }
}