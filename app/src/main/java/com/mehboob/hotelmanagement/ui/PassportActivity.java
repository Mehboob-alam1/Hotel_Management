package com.mehboob.hotelmanagement.ui;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import com.bumptech.glide.Glide;
import com.mehboob.hotelmanagement.databinding.ActivityPassportBinding;

public class PassportActivity extends AppCompatActivity {

    ActivityPassportBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPassportBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent galleryIntent = new Intent(Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(galleryIntent, 100);

            }
        });

        binding.btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, 101);

            }
        });

        binding.btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == 100) {
                Uri selectedImage = data.getData();
                Glide.with(this).load(selectedImage).into(binding.SelectedImage);
            } else if (requestCode == 101) {
                Bitmap photo = (Bitmap) data.getExtras().get("data");
                binding.SelectedImage.setImageBitmap(photo);
            }
        }
    }
}