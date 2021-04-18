package com.example.kotawisatabatu.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import com.example.kotawisatabatu.R;

public class SplashActivity extends AppCompatActivity {
    private int waktu_loading=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        // Send user to MainActivity as soon as this activity loads
        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(intent);
        // remove this activity from the stack
        finish();
    }
}