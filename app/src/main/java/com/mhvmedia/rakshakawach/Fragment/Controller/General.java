package com.mhvmedia.rakshakawach.Fragment.Controller;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mhvmedia.rakshakawach.R;
import com.mhvmedia.rakshakawach.databinding.FragmentControllerGeneralBinding;
import com.mhvmedia.rakshakawach.databinding.PopupItemInformationBinding;

public class General extends Fragment {
    FragmentControllerGeneralBinding binding;
    private PopupItemInformationBinding popupItemInformationBinding;
    private Dialog dialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        binding = FragmentControllerGeneralBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        // code here
/*
        binding.unplugalerm.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                PopupReminder popupReminder = new PopupReminder();
                popupReminder.showDialog1();

                return true;
            }
        });
*/
        Drawable active_button = getResources().getDrawable(R.drawable.bg_rounded_ractangle_10_selected_item);
        Drawable inactive_button = getResources().getDrawable(R.drawable.bg_rounded_ractangle_10_not_selected_item);

        binding.unplugalerm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupReminder popupReminder = new PopupReminder();
                popupReminder.showDialog1();
                binding.unplugalerm.setBackgroundResource(R.drawable.bg_rounded_ractangle_10_selected_item);
            }
        });
        binding.antitouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupReminder popupReminder = new PopupReminder();
                popupReminder.showDialog1();
                binding.antitouch.setBackgroundResource(R.drawable.bg_rounded_ractangle_10_selected_item);
            }
        });
        binding.newsim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupReminder popupReminder = new PopupReminder();
                popupReminder.showDialog1();
                binding.newsim.setBackgroundResource(R.drawable.bg_rounded_ractangle_10_selected_item);
            }
        });
        binding.antipocket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupReminder popupReminder = new PopupReminder();
                popupReminder.showDialog1();
                binding.antipocket.setBackgroundResource(R.drawable.bg_rounded_ractangle_10_selected_item);
            }
        });
        binding.rebootalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupReminder popupReminder = new PopupReminder();
                popupReminder.showDialog1();
                binding.rebootalert.setBackgroundResource(R.drawable.bg_rounded_ractangle_10_selected_item);
            }
        });
        binding.applock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupReminder popupReminder = new PopupReminder();
                popupReminder.showDialog1();
                binding.applock.setBackgroundResource(R.drawable.bg_rounded_ractangle_10_selected_item);
            }
        });

        return view;
    }

    class PopupReminder {
        public void showDialog1() {
            dialog = new Dialog(getContext());
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            popupItemInformationBinding = PopupItemInformationBinding.inflate(getLayoutInflater());
            View phoneVerificationView = popupItemInformationBinding.getRoot();
            dialog.setContentView(phoneVerificationView);
            dialog.setCancelable(true);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

            popupItemInformationBinding.close.setOnClickListener(new View.OnClickListener() {
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
