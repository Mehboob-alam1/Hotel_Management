package com.mehboob.hotelmanagement.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mehboob.hotelmanagement.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
    }
}