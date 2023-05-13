package com.mehboob.hotelmanagement.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.mehboob.hotelmanagement.R;
import com.mehboob.hotelmanagement.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {
private ActivitySplashBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

  


       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {

               startActivity(new Intent(SplashActivity.this, LoginActivity.class));
           }
       },3000);
    }


}