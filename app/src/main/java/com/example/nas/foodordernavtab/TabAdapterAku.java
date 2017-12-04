package com.example.nas.foodordernavtab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static com.example.nas.foodordernavtab.TabFragment.int_items;

/**
 * Created by nas on 29/11/2017.
 */

public class TabAdapterAku extends FragmentPagerAdapter {

    public TabAdapterAku(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SatayFragment();
            case 1:
                return new MakanFragment();
            case 2:
                return new MinumFragment();
            case 3:
                return new JajanFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return int_items;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Satay";
            case 1:
                return "Makan";
            case 2:
                return "Minum";
            case 3:
                return "Jajan";
        }

        return null;
    }
}
