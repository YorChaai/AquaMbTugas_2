package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Selamat_claimtutupbotolaqua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selamat_claimtutupbotolaqua);
    }
    public void backtutupbotol(View view) {
        Intent intent = new Intent(Selamat_claimtutupbotolaqua.this,Scan_tutupbotolaqua .class);
        startActivity(intent);
    }

}