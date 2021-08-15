package com.mhvmedia.rakshakawach.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.mhvmedia.rakshakawach.databinding.ActivityUserProfileBinding;
import com.mhvmedia.rakshakawach.databinding.ActivityViewPhotosBinding;

public class ViewPhotos extends AppCompatActivity {
    private ActivityViewPhotosBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViewPhotosBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}