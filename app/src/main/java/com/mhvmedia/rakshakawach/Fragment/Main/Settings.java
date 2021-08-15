package com.mhvmedia.rakshakawach.Fragment.Main;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mhvmedia.rakshakawach.Activity.OwnerInformation;
import com.mhvmedia.rakshakawach.Activity.UserProfile;
import com.mhvmedia.rakshakawach.Activity.ViewPhotos;
import com.mhvmedia.rakshakawach.databinding.FragmentSettingsBinding;
import com.mhvmedia.rakshakawach.databinding.PopupBackupBinding;

public class Settings extends Fragment {
    FragmentSettingsBinding binding;
    private PopupBackupBinding popupBackupBinding;
    private Dialog dialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        binding = FragmentSettingsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        // code here

        binding.databackup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupReminder popupReminder = new PopupReminder();
                popupReminder.showDialog1();
            }
        });

        binding.photogallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ViewPhotos.class);
                startActivity(intent);
            }
        });

        binding.ownerinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), OwnerInformation.class);
                startActivity(intent);
            }
        });

        return view;
    }

    class PopupReminder {
        public void showDialog1() {
            dialog = new Dialog(getContext());
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            popupBackupBinding = PopupBackupBinding.inflate(getLayoutInflater());
            View phoneVerificationView = popupBackupBinding.getRoot();
            dialog.setContentView(phoneVerificationView);
            dialog.setCancelable(true);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

            popupBackupBinding.close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialog.cancel();
                }
            });
            dialog.show();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
