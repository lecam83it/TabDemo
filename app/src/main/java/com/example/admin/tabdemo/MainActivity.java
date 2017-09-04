package com.example.admin.tabdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.adapter.ViewAdapter;

public class MainActivity extends AppCompatActivity {

    private CarouselFragment carouselFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);

        if (savedInstanceState == null){
            initScreen();
        }else{
            carouselFragment = (CarouselFragment) getSupportFragmentManager().getFragments().get(0);
        }

    }

    private void initScreen() {
        carouselFragment = new CarouselFragment();

        final FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, carouselFragment)
                .commit();
    }

    @Override
    public void onBackPressed() {
        if(!carouselFragment.onBackPressed()){
            super.onBackPressed();
        }else{

        }
    }
}
