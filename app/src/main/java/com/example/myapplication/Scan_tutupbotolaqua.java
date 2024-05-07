package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Scan_tutupbotolaqua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_tutupbotolaqua);
    }
    public void Website1(View view) {
        Intent intent = new Intent(Scan_tutupbotolaqua.this,Mainwebsite1.class);
        startActivity(intent );

    }
    public void ScanKTP(View view) {
        Intent intent = new Intent(Scan_tutupbotolaqua.this,Scan_ktpaqua.class);
        startActivity(intent );

    }
}