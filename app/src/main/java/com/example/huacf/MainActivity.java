package com.example.huacf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TabLayout home_tab;
    private FrameLayout home_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    private void initData() {
        home_tab = findViewById(R.id.home_tab);
        home_fragment = findViewById(R.id.home_fragment);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }
}