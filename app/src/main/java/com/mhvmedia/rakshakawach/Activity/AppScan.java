package com.mhvmedia.rakshakawach.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mhvmedia.rakshakawach.databinding.ActivityAppScanBinding;

public class AppScan extends AppCompatActivity {
    private ActivityAppScanBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAppScanBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        binding.viewdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ScannedAppList.class);
                startActivity(intent);
            }
        });
    }
}