package com.example.randomselector.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.randomselector.R;
import com.example.randomselector.databinding.FragmentCategoryBinding;
import com.example.randomselector.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
FragmentHomeBinding binding;
    /*
     behtare az binding estefade konim
      */
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentHomeBinding.inflate(getLayoutInflater());
        // Inflate the layout for this fragment


        return binding.getRoot();
    }
}