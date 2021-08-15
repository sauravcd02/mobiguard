package com.mhvmedia.rakshakawach.Activity;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

import com.mhvmedia.rakshakawach.databinding.ActivityUserProfileBinding;
import com.mhvmedia.rakshakawach.databinding.PopupLogoutBinding;

public class UserProfile extends AppCompatActivity {
    private ActivityUserProfileBinding binding;
    private Dialog dialog;
    private PopupLogoutBinding popupLogoutBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUserProfileBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.toolbarBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        binding.logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupLogout popupReminder = new PopupLogout();
                popupReminder.showDialog1(UserProfile.this);
            }
        });

    }

    class PopupLogout {
        public void showDialog1(UserProfile userProfile) {
            dialog = new Dialog(userProfile);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            popupLogoutBinding = PopupLogoutBinding.inflate(getLayoutInflater());
            View phoneVerificationView = popupLogoutBinding.getRoot();
            dialog.setContentView(phoneVerificationView);
            dialog.setCancelable(true);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

            popupLogoutBinding.close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.cancel();
                }
            });
            dialog.show();
        }
    }

}