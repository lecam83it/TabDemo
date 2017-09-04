package com.example.admin.FragmentTab;

import android.support.v4.app.Fragment;

import com.example.admin.FragmentDetails.OnBackPressedListener;
import com.example.admin.tabdemo.BackPressImpl;


/**
 * Created by Admin on 9/4/2017.
 */

public class RootFragment extends Fragment implements OnBackPressedListener {

    @Override
    public boolean onBackPressed() {
        return new BackPressImpl(this).onBackPressed();
    }
}
