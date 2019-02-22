package com.amit.test;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Dashboard extends AppCompatActivity {


    private DrawerLayout mDrawerlayout;
    private ActionBarDrawerToggle mToggle;
    ViewPager viewPager;
    int images[] = {R.drawable.corousel_1, R.drawable.corousel_2};
    ViewpagerAdapter myCustomPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        viewPager = (ViewPager)findViewById(R.id.corousel);

        myCustomPagerAdapter = new ViewpagerAdapter(Dashboard.this, images);
        viewPager.setAdapter(myCustomPagerAdapter);


    }}
