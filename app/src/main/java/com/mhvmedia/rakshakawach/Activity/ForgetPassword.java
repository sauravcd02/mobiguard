package com.mhvmedia.rakshakawach.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.mhvmedia.rakshakawach.databinding.ActivityForgetPasswordBinding;
import com.mhvmedia.rakshakawach.databinding.PopupGetOtpBinding;

public class ForgetPassword extends AppCompatActivity {
    private ActivityForgetPasswordBinding binding;

    private PopupGetOtpBinding popupGetOtpBinding;
    private Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityForgetPasswordBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        binding.getotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupReminder popupReminder = new PopupReminder();
                popupReminder.showDialog1(ForgetPassword.this);
            }
        });

    }

    class PopupReminder {
        public void showDialog1(final ForgetPassword activity) {
            dialog = new Dialog(activity);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            popupGetOtpBinding = PopupGetOtpBinding.inflate(getLayoutInflater());
            View phoneVerificationView = popupGetOtpBinding.getRoot();
            dialog.setContentView(phoneVerificationView);
            dialog.setCancelable(true);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

            popupGetOtpBinding.close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.cancel();
                }
            });

            popupGetOtpBinding.verify.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getBaseContext(), ChangePassword.class);
                    startActivity(intent);
                }
            });

            dialog.show();
        }
    }

}