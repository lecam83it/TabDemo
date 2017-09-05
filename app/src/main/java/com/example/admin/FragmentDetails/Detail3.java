package com.example.admin.FragmentDetails;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.admin.FragmentTab.RootFragment;
import com.example.admin.tabdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Detail3 extends RootFragment {

    private final static String NAME = "nameofObject";

    public static Detail2 newInstance(String value) {

        Bundle args = new Bundle();
        args.putCharSequence(NAME, value);
        Detail2 fragment = new Detail2();
        fragment.setArguments(args);
        return fragment;
    }

    public Detail3() {
        // Required empty public constructor
    }

    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        
        View view = inflater.inflate(R.layout.fragment_detail3, container, false);

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
