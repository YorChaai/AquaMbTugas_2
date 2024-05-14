package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class selamat_undian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selamat_undian);
    }
    public void spinwheel2(View view) {
        Intent intent = new Intent(selamat_undian.this, spinwheel2.class);
        startActivity(intent);
    }
}