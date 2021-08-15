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

import com.mhvmedia.rakshakawach.databinding.FragmentInformationBinding;
import com.mhvmedia.rakshakawach.databinding.PopupBackupBinding;
import com.mhvmedia.rakshakawach.databinding.PopupShareWithFriendsBinding;

public class Information extends Fragment {
    FragmentInformationBinding binding;
    private Dialog dialog;
    private PopupShareWithFriendsBinding popupShareWithFriendsBinding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        binding = FragmentInformationBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        // code here
        binding.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupShare popupReminder = new PopupShare();
                popupReminder.showDialog1();
            }
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    class PopupShare {
        public void showDialog1() {
            dialog = new Dialog(getContext());
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            popupShareWithFriendsBinding = PopupShareWithFriendsBinding.inflate(getLayoutInflater());
            View phoneVerificationView = popupShareWithFriendsBinding.getRoot();
            dialog.setContentView(phoneVerificationView);
            dialog.setCancelable(true);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

            popupShareWithFriendsBinding.share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(Intent.ACTION_SEND);
                    myIntent.setType("text/plain");
                    String body = "Your body here";
                    String sub = "Your Subject";
                    myIntent.putExtra(Intent.EXTRA_SUBJECT,sub);
                    myIntent.putExtra(Intent.EXTRA_TEXT,body);
                    startActivity(Intent.createChooser(myIntent, "Share Using"));
                }
            });
            dialog.show();
        }
    }

}
