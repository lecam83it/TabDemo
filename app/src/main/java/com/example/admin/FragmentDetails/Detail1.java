package com.example.admin.FragmentDetails;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.admin.FragmentTab.RootFragment;
import com.example.admin.FragmentTab.Tab1Fragment;
import com.example.admin.tabdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Detail1 extends RootFragment {

    private static final String NAME = "nameOfObject";

    public static Detail1 newInstance(String value) {
        
        Bundle args = new Bundle();
        args.putCharSequence(NAME , value);
        Detail1 fragment = new Detail1();
        fragment.setArguments(args);
        return fragment;
    }
    
    public Detail1() {
        // Required empty public constructor
    }

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_detail1, container, false);

        addControls(view);

        return  view;
    }

    private void addControls(View view) {
        textView = view.findViewById(R.id.textView);
        Bundle args = getArguments();
        String name = (String) args.getCharSequence(NAME);
        textView.setText(name);
    }

}
