package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;



public class spinwheel2 extends AppCompatActivity {

    Button btnSpin;
    ImageView ivWheel;
    Handler handler;
    Runnable runnable;
    int rotationIncrement;
    int totalRotation;
    boolean isSpinning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinwheel1);

        btnSpin = findViewById(R.id.rectangle_11);
        ivWheel = findViewById(R.id.wheel_bg);
        handler = new Handler();

        btnSpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnSpin.setEnabled(false);
                startSpin();
            }
        });
    }

    private void startSpin() {
        Random random = new Random();
        int segments = 10; // Number of segments in your wheel
        int segmentAngle = 360 / segments;

        // Calculate a random number of full rotations and add a random segment
        totalRotation = (random.nextInt(5) + 5) * 360; // Between 5 and 9 full rotations
        int randomSegment = random.nextInt(segments);
        totalRotation += randomSegment * segmentAngle; // Plus a random segment

        rotationIncrement = 20;  // Initial speed
        isSpinning = true;

        runnable = new Runnable() {
            @Override
            public void run() {
                if (isSpinning) {
                    float rotation = ivWheel.getRotation() + rotationIncrement;
                    ivWheel.setRotation(rotation);

                    totalRotation -= rotationIncrement;
                    if (totalRotation <= 0) {
                        // Ensure the wheel stops at a segment center
                        float finalRotation = (rotation % 365) % segmentAngle;
                        float adjustment = segmentAngle / 2 - finalRotation;
                        ivWheel.setRotation(rotation + adjustment);

                        isSpinning = false;
                        rotationIncrement = 0;
                        btnSpin.setEnabled(true);

                        // Intent to move to the next activity
                        Intent intent = new Intent(spinwheel2.this, SelamatExtraUndian.class);
                        startActivity(intent);
                        finish(); // Optional: Close the current activity

                        return;
                    }

                    if (totalRotation < 360) { // Slow down when close to stop
                        rotationIncrement = Math.max(2, rotationIncrement - 1);
                    }

                    handler.postDelayed(this, 20); // Delay for smooth animation
                }
            }
        };

        handler.post(runnable);
    }


    public void back(View view) {
        Intent intent = new Intent(spinwheel2.this, Mainwebsite1.class);
        startActivity(intent);
    }
}
