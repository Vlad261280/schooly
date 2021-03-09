package com.example.schooly;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class Authorization extends AppCompatActivity {
    TabLayout TabLayout;
    ViewPager ViewPager;
    ArrayList<Fragment> fragments;
    FragmentAdapter fragmentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authorization);
        TabLayout = findViewById(R.id.tabLayout);
        ViewPager = findViewById(R.id.viewPager);
        fragments = new ArrayList<>();
        fragmentAdapter = new FragmentAdapter(getSupportFragmentManager(), fragments);
        updateFragments();
    }
    public void updateFragments(){
        fragmentAdapter.addFragment(new AuthorizationFragment(1));
        fragmentAdapter.addFragment(new AuthorizationFragment(2));
        fragmentAdapter.addFragment(new AuthorizationFragment(3));
        ViewPager.setAdapter(fragmentAdapter);
    }
}