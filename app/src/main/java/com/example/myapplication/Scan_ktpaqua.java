package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Scan_ktpaqua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_ktpaqua);
    }
    public void ScanTutupBotol(View view) {
        Intent intent = new Intent(Scan_ktpaqua.this,Scan_tutupbotolaqua.class);
        startActivity(intent );

    }
    public void SelamatClaimTutupBotol(View view) {
        Intent intent = new Intent(Scan_ktpaqua.this,Selamat_claimtutupbotolaqua.class);
        startActivity(intent );

    }
}