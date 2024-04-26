package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.drawerlayout.widget.DrawerLayout;
import android.view.View;
import android.widget.Button;
import androidx.core.view.GravityCompat;


public class Mainwebsite1 extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private Button groupButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainwebsite1);

        drawerLayout = findViewById(R.id.drawer_layout);
        groupButton = findViewById(R.id.group_869);

        groupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.END);
            }
        });

    }
}