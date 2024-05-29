package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Selamat_claimtutupbotolaqua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selamat_claimtutupbotolaqua);

        // Create a handler to delay the intent for 3 seconds (3000 milliseconds)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Selamat_claimtutupbotolaqua.this, Mainwebsite1.class);
                startActivity(intent);
                finish();
            }
        }, 2000); // 3 seconds delay
    }


    }
