package com.example.android.nieporettourguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Setting the content of the activity to use activity_main.xml
        setContentView(R.layout.activity_main);

        // Finding the view pager (swiping between fragments)
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Creating an adapter
        ViewPagerAdapter adapter = new ViewPagerAdapter(this, getSupportFragmentManager());

        // Setting the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Finding the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        // Connecting the tab layout with the view pager
        tabLayout.setupWithViewPager(viewPager);
    }
}