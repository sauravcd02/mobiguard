package com.mhvmedia.rakshakawach.Fragment.Main;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mhvmedia.rakshakawach.Activity.AppCleaner;
import com.mhvmedia.rakshakawach.Activity.AppScan;
import com.mhvmedia.rakshakawach.databinding.FragmentHomeBinding;


public class Home extends Fragment {
    FragmentHomeBinding binding;
    private Dialog dialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        binding = FragmentHomeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        // code here

        binding.appcleaner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AppCleaner.class);
                startActivity(intent);
            }
        });

        binding.sanitize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), AppScan.class);
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }


}
