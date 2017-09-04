package com.example.admin.FragmentDetails;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.admin.FragmentTab.RootFragment;
import com.example.admin.FragmentTab.Tab1Fragment;
import com.example.admin.FragmentTab.Tab4Fragment;
import com.example.admin.tabdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Detail4 extends RootFragment {

    private Button btnBack;

    public Detail4() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detail4, container, false);


        return  view;
    }

}
