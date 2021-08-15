package com.mhvmedia.rakshakawach.Fragment.Main;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mhvmedia.rakshakawach.databinding.FragmentInformationBinding;

public class Information extends Fragment {
    FragmentInformationBinding binding;
    private Dialog dialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        binding = FragmentInformationBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        // code here

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

}
