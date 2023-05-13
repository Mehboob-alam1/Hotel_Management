package com.mehboob.hotelmanagement.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mehboob.hotelmanagement.R;
import com.mehboob.hotelmanagement.databinding.ActivityOcractivityBinding;

public class OCRActivity extends AppCompatActivity {


    ActivityOcractivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding  = ActivityOcractivityBinding.inflate(getLayoutInflater());
                setContentView(binding.getRoot());
                getSupportActionBar().hide();


    }
}