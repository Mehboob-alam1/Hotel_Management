package com.mehboob.hotelmanagement.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.mehboob.hotelmanagement.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.editTextRoomNo.getText().toString().isEmpty() && binding.editTextPin.getText().toString().isEmpty())
                {
                    Toast.makeText(LoginActivity.this, "Enter your room no \nand password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String userRoomNo = binding.editTextRoomNo.getText().toString();
                    String userPin = binding.editTextRoomNo.getText().toString();

                    Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                    startActivity(intent);
                }
            }
        });



    }
}