package com.example.randomselector.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.randomselector.R;
import com.example.randomselector.databinding.FragmentCategoryBinding;

public class CategoryFragment extends Fragment {
    /*
    behtare az binding estefade konim
   */
    FragmentCategoryBinding binding;

    public CategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentCategoryBinding.inflate(getLayoutInflater());


        return binding.getRoot();
    }
}