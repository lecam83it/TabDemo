package com.example.admin.adapter;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.SparseArray;
import android.view.ViewGroup;

import com.example.admin.FragmentTab.Tab1Fragment;
import com.example.admin.FragmentTab.Tab2Fragment;
import com.example.admin.FragmentTab.Tab3Fragment;
import com.example.admin.FragmentTab.Tab4Fragment;
import com.example.admin.tabdemo.R;

/**
 * Created by Admin on 9/3/2017.
 */

public class ViewAdapter extends FragmentPagerAdapter {


    SparseArray<Fragment> registeredFragments = new SparseArray<Fragment>();

    public ViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position){
            case 0:
                fragment = new Tab1Fragment();
                break;
            case 1:
                fragment = new Tab2Fragment();
                break;
            case 2:
                fragment = new Tab3Fragment();
                break;
            case 3:
                fragment = new Tab4Fragment();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String s = null;
        switch (position) {
            case 0: s = "Tab1";
                break;
            case 1: s = "Tab2";
                break;
            case 2: s = "Tab3";
                break;
            case 3: s = "Tab4";
                break;
        }
        return s;
    }
/*    *
     * On each Fragment instantiation we are saving the reference of that Fragment in a Map
     * It will help us to retrieve the Fragment by position
     *
     * @param container
     * @param position
     * @return*/

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Fragment fragment = (Fragment) super.instantiateItem(container, position);
        registeredFragments.put(position, fragment);
        return fragment;
    }

/*
    *//**
     * Remove the saved reference from our Map on the Fragment destroy
     *
     * @param container
     * @param position
     * @param object
     *//*
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        registeredFragments.remove(position);
        super.destroyItem(container, position, object);
    }*/

    /**
     * Get the Fragment by position
     *
     * @param position tab position of the fragment
     * @return
     */
    public Fragment getRegisteredFragment(int position) {
        return registeredFragments.get(position);
    }
}
