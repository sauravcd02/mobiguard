package com.mhvmedia.rakshakawach.Fragment.Controller;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mhvmedia.rakshakawach.databinding.FragmentControllerBinding;
import com.mhvmedia.rakshakawach.databinding.FragmentControllerExtraBinding;

public class Extra extends Fragment {
    FragmentControllerExtraBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        binding = FragmentControllerExtraBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        // code here

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
