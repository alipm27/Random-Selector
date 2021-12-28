package com.example.randomselector.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.randomselector.MainActivity;
import com.example.randomselector.activities.AddCategory;
import com.example.randomselector.databinding.FragmentCategoryBinding;

import java.util.Objects;

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

        /*binding.imgAddCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getContext(), AddCategory.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);


            }
        });*/

        return binding.getRoot();
    }
}