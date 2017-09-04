package com.example.admin.FragmentTab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.admin.FragmentDetails.Detail4;
import com.example.admin.tabdemo.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab4Fragment extends RootFragment {

    private ListView lvExercise;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;

    public Tab4Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_tab4, container, false);

        addControls(view);
        addEvents();
        return view;
    }

    private void addEvents() {
        lvExercise.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getChildFragmentManager().beginTransaction().replace(R.id.frame_layout_tab_4, new Detail4()).addToBackStack(null).commit();
            }
        });
    }

    private void addControls(View view) {
        lvExercise = view.findViewById(R.id.lvExercise);
        list = new ArrayList<>();
        for(int i = 0; i < 20; i++) list.add("Bài "+ (i + 1));
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list);
        lvExercise.setAdapter(adapter);
    }

}
