package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;

public class Mainlogin extends AppCompatActivity {

    EditText password1,password;
    boolean passwordVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainlogin);

        password1 = findViewById(R.id.rectangle_4);
        password = findViewById(R.id.rectangle_5);

        password.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                final int Right = 2;
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getRawX() >= password.getRight() - password.getCompoundDrawables()[Right].getBounds().width()) {
                        int selection = password.getSelectionEnd();
                        if (passwordVisible) {
                            password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passwordVisible = false;
                            password.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.vector_kunci1, 0, R.drawable.ic_visibility_off, 0);
                        } else {
                            password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            passwordVisible = true;
                            password.setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.vector_kunci1, 0, R.drawable.ic_visibility_on, 0);
                        }
                        password.setSelection(selection);
                        return true;

                    }
                }

                return false;
            }
        });

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