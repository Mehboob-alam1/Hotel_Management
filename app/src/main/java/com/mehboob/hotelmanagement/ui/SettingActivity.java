package com.mehboob.hotelmanagement.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mehboob.hotelmanagement.databinding.ActivitySettingBinding;

public class SettingActivity extends AppCompatActivity {

    ActivitySettingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivitySettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}