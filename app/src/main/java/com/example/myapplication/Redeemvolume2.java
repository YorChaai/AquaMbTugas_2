package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Redeemvolume2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redeemvolume2);
    }
        public void back(View view) {
            Intent intent = new Intent(Redeemvolume2.this,Redeemvolume1.class);
            startActivity(intent );
    }
        public void spin(View view) {
            Intent intent = new Intent(Redeemvolume2.this,spinwheel1.class);
            startActivity(intent );
    }
}