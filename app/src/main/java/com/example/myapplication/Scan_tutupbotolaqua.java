package com.example.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.budiyev.android.codescanner.AutoFocusMode;
import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.budiyev.android.codescanner.ErrorCallback;
import com.budiyev.android.codescanner.ScanMode;
import com.google.zxing.Result;

public class Scan_tutupbotolaqua extends AppCompatActivity {

    private static final int CAMERA_REQUEST_CODE = 101;
    private CodeScanner codeScanner;
    private CodeScannerView scannerView;
    private TextView tv_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_tutupbotolaqua);

        Button menu1 = findViewById(R.id.back1);
        menu1.setOnClickListener(view -> {
            Intent intent = new Intent(Scan_tutupbotolaqua.this, Mainwebsite1.class);
            startActivity(intent);
        });

        Button btnlogin1 = findViewById(R.id.submit1);
        btnlogin1.setOnClickListener(view -> {
            Intent intent = new Intent(Scan_tutupbotolaqua.this, Mainwebsite1.class);
            startActivity(intent);
        });

        Button cancel1 = findViewById(R.id.cancel1);
        cancel1.setOnClickListener(view -> {
            Intent intent = new Intent(Scan_tutupbotolaqua.this, Mainwebsite1.class);
            startActivity(intent);
        });

        tv_textView = findViewById(R.id.tv_textView);
        scannerView = findViewById(R.id.scanner_view);

        setupPermission();
        codeScanner();
    }

    private void codeScanner() {
        final ImageView imageView = findViewById(R.id.img_textView);
        codeScanner = new CodeScanner(this, scannerView);

        codeScanner.setCamera(CodeScanner.CAMERA_BACK);
        codeScanner.setFormats(CodeScanner.ALL_FORMATS);
        codeScanner.setAutoFocusMode(AutoFocusMode.SAFE);
        codeScanner.setScanMode(ScanMode.CONTINUOUS);
        codeScanner.setAutoFocusEnabled(true);
        codeScanner.setFlashEnabled(true);

        codeScanner.setDecodeCallback(new DecodeCallback() {
            @Override
            public void onDecoded(@NonNull final Result result) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        imageView.setVisibility(View.VISIBLE);
                        if (result.getText().equals("TEKS YANG DIHARAPKAN")) { // Ganti dengan teks yang diharapkan
                            // Jika scan berhasil
                            imageView.setImageResource(R.drawable.gagalscan); // Menampilkan gambar accscan.png
                        } else {
                            // Jika scan gagal
                            imageView.setImageResource(R.drawable.accscan); // Menampilkan gambar gagalscan.png
                        }
                    }
                });
            }
        });


        codeScanner.setErrorCallback(new ErrorCallback() {
            @Override
            public void onError(@NonNull final Throwable error) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Log.e("main", "camera error, " + error.getMessage());
                    }
                });
            }
        });


        scannerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                codeScanner.startPreview();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        codeScanner.startPreview();
    }

    @Override
    protected void onPause() {
        super.onPause();
        codeScanner.releaseResources();
    }

    private void setupPermission() {
        int permission = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA);

        if (permission != PackageManager.PERMISSION_GRANTED) {
            makeRequest();
        }
    }

    private void makeRequest() {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, CAMERA_REQUEST_CODE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == CAMERA_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                codeScanner.startPreview();
            } else {
                Toast.makeText(this, "You need camera permission", Toast.LENGTH_SHORT).show();
            }
        }
    }
}