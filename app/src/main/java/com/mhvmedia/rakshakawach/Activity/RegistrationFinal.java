package com.mhvmedia.rakshakawach.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mhvmedia.rakshakawach.databinding.ActivityRegistrationFinalBinding;

public class RegistrationFinal extends AppCompatActivity {
    private ActivityRegistrationFinalBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegistrationFinalBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.continueprocess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), AppLock.class);
                startActivity(intent);
            }
        });

    }
}