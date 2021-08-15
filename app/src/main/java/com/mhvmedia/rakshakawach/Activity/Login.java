package com.mhvmedia.rakshakawach.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;

import com.mhvmedia.rakshakawach.R;
import com.mhvmedia.rakshakawach.databinding.ActivityLoginBinding;

public class Login extends AppCompatActivity {
    private ActivityLoginBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        binding.signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        binding.signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), AppLock.class);
                startActivity(intent);
            }
        });

        binding.forgetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), ForgetPassword.class);
                startActivity(intent);
            }
        });

        binding.showPassBtnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.password.getTransformationMethod().equals(PasswordTransformationMethod.getInstance())) {
                    //Show Password
                    binding.password.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    binding.showPassBtnP.setColorFilter(ContextCompat.getColor(Login.this, R.color.colorPrimary));
                } else {
                    //Hide Password
                    binding.password.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    binding.showPassBtnP.setColorFilter(null);
                }
            }
        });


    }
}