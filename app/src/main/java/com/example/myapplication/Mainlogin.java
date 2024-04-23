package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
//import android.support.v7.widget.Toolbar;
//import android.view.View;


import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class Mainlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainlogin);
    }
    public void mainhome2(View view) {
        Intent intent = new Intent(Mainlogin.this, Mainhome2.class);
        startActivity(intent);
    }
    public void website(View view) {
        Intent intent = new Intent(Mainlogin.this, Mainwebsite1.class);
        startActivity(intent);
    }

}