package com.example.randomselector;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.randomselector.adapter.TabsAdapter;
import com.example.randomselector.databinding.ActivityMainBinding;
import com.example.randomselector.fragments.CategoryFragment;
import com.example.randomselector.fragments.HomeFragment;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<Fragment> fragments=new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new CategoryFragment());

        binding.pager.setAdapter(new TabsAdapter(MainActivity.this,fragments));


        binding.bottomTabs.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.item_home:
                        binding.pager.setCurrentItem(0);
                        binding.bottomTabs.getMenu().findItem(R.id.item_home).setChecked(true);
                        break;
                    case R.id.item_category:
                        binding.pager.setCurrentItem(1);
                        binding.bottomTabs.getMenu().findItem(R.id.item_category).setChecked(true);
                        break;
                }
                return false;
            }
        });

        binding.pager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                switch (position){

                    case 0:
                        binding.bottomTabs.getMenu().findItem(R.id.item_home).setChecked(true);
                        break;
                    case 1:
                        binding.bottomTabs.getMenu().findItem(R.id.item_category).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
    }
}