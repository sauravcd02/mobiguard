package com.mhvmedia.rakshakawach.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.mhvmedia.rakshakawach.databinding.ActivityAppCleanerBinding;
import com.mhvmedia.rakshakawach.databinding.ActivityOwnerInformationBinding;

public class OwnerInformation extends AppCompatActivity {
    private ActivityOwnerInformationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOwnerInformationBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);


    }
}