package com.mehboob.hotelmanagement.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mehboob.hotelmanagement.databinding.ActivityBookingBinding;
import com.mehboob.hotelmanagement.databinding.ActivitySettingBinding;

public class BookingActivity extends AppCompatActivity {

    ActivityBookingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBookingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }
}