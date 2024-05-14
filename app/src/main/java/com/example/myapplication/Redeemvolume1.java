package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Redeemvolume1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redeemvolume1);
    }

    public void main_menu(View view) {
        Intent intent = new Intent(Redeemvolume1.this,Mainwebsite1.class);
        startActivity(intent );

    }
    public void redeemv2(View view) {
        Intent intent = new Intent(Redeemvolume1.this,Redeemvolume2.class);
        startActivity(intent );

    }
}