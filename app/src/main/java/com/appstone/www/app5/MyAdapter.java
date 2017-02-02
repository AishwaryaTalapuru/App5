package com.appstone.www.app5;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.os.Bundle;

/**
 * Created by aishwaryatalapuru on 01/02/17.
 */

public class MyAdapter extends FragmentPagerAdapter {

    final int pageCount=2;
    Bundle info;


    public MyAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int pos){
        info=new Bundle();
        switch (pos) {
            case 0:
                FirstFloor firstFloor=new FirstFloor();
                info.putInt("currentPage", pos++);cdcd
                firstFloor.setArguments(info);
                return firstFloor;
            case 1:

                SecondFloor secondFloor=new SecondFloor();
                info.putInt("currentPage", pos++);
                secondFloor.setArguments(info);
                return secondFloor;

        }
        return null;
    }

    @Override
    public int getCount(int pos){
        return pageCount;
    }










}


