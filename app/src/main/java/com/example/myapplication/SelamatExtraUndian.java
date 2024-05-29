package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelamatExtraUndian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selamat_extra_undian);
    }
    public void spinwheel1(View view) {
        Intent intent = new Intent(SelamatExtraUndian.this, spinwheel1.class);
        startActivity(intent);
    }
}