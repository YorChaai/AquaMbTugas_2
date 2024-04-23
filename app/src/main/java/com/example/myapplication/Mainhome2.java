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

public class Mainhome2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainhome2);
    }

    public void login1(View view) {
        Intent intent = new Intent(Mainhome2.this,Mainlogin.class);
        startActivity(intent );
    }
    public void register1(View view) {
        Intent intent = new Intent(Mainhome2.this,Mainregister.class);
        startActivity(intent );
    }
}