package com.amit.test;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Dashboardfrag extends Fragment {

    private DrawerLayout mDrawerlayout;
    private ActionBarDrawerToggle mToggle;
    ViewPager viewPager;
    int images[] = {R.drawable.corousel_1, R.drawable.corousel_2};
    ViewpagerAdapter myCustomPagerAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboardfrag, container, false);
        viewPager = (ViewPager)view.findViewById(R.id.corousel);

        myCustomPagerAdapter = new ViewpagerAdapter(getContext(), images);
        viewPager.setAdapter(myCustomPagerAdapter);
        return view;
    }


}
