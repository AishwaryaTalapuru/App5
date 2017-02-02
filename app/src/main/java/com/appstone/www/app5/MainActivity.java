package com.appstone.www.app5;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;


public class MainActivity extends FragmentActivity {
    ActionBar ab;
    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ab=getActionBar();
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ab.setDisplayShowTitleEnabled(true);
        vp = (ViewPager) findViewById(R.id.pager);
        FragmentManager fm = getSupportFragmentManager();
        ViewPager.SimpleOnPageChangeListener listener= new ViewPager.SimpleOnPageChangeListener()
        {
            @Override
            public void onPageSelected(int position){
                super.onPageSelected(position);
                ab.setSelectedNavigationItem(position);
            }
        };
        vp.setOnPageChangeListener(listener);
        ActionBar.TabListener tabListener=new ActionBar.TabListener() {
            @Override
            public void onTabSelected(Tab arg0 FragmentTransaction arg1) {

            }

            @Override
            public void onTabUnselected(Tab tab, FragmentTransaction ft) {
             vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabReselected(Tab arg0, FragmentTransaction arg1) {

            }
        };
        Tab t = ab.newTab().setText("FirstFloor").setTabListener(tabListener);
        ab.addTab(t);
        Tab t = ab.newTab().setText("SecondFloor").setTabListener(tabListener);
        ab.addTab(t);
    }
}
