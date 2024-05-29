package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.drawerlayout.widget.DrawerLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.GravityCompat;


public class Mainwebsite1 extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private Button groupButton;
    private TextView scoreTextView;
    private int score = 30; // Default score

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainwebsite1);

        drawerLayout = findViewById(R.id.drawer_layout);
        groupButton = findViewById(R.id.group_869);
        scoreTextView = findViewById(R.id.some_id);

        drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);

        groupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.END);
            }
        });
        // Load score from SharedPreferences
        SharedPreferences prefs = getSharedPreferences("myPrefs", MODE_PRIVATE);
        score = prefs.getInt("score", 30);
        scoreTextView.setText(String.valueOf(score));
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Refresh the score when returning to the activity
        SharedPreferences prefs = getSharedPreferences("myPrefs", MODE_PRIVATE);
        score = prefs.getInt("score", 30);
        scoreTextView.setText(String.valueOf(score));
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Reset the score to the default value when the app is closed
        resetScore();

    }
    public void ScanBotol(View view) {
        Intent intent = new Intent(Mainwebsite1.this, Scan_tutupbotolaqua.class);
        startActivity(intent);
    }

    public void ScanBotol1(View view) {
        Intent intent = new Intent(Mainwebsite1.this, Scan_tutupbotolaqua.class);
        startActivity(intent);
    }
    public void reedemvaganza(View view) {
        Intent intent = new Intent(Mainwebsite1.this, Redeemvolume2.class);
        startActivity(intent);
    }
    public void wheel(View view) {
        Intent intent = new Intent(Mainwebsite1.this, SelamatExtraUndian.class);
        startActivity(intent );

    }

    private void resetScore() {
        SharedPreferences prefs = getSharedPreferences("myPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt("score", 30); // Reset to default score
        editor.apply();
    }
}

