package com.example.admin.FragmentTab;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.admin.FragmentDetails.Detail1;
import com.example.admin.FragmentDetails.Detail3;
import com.example.admin.tabdemo.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab3Fragment extends RootFragment {

    private ListView lvLevel;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;

    public Tab3Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_tab3, container, false);

        addControls(view);
        addEvents();
        return view;
    }

    private void addEvents() {
        lvLevel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getChildFragmentManager().beginTransaction().replace(R.id.frame_layout_tab_3, new Detail3()).addToBackStack(null).commit();
            }
        });
    }

    private void addControls(View view) {
        lvLevel = view.findViewById(R.id.lvLevel);
        list = new ArrayList<>();
        list.add("Cực Dễ");
        list.add("Dễ");
        list.add("Bình Thường");
        list.add("Khó");
        list.add("Cực Khó");
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list);
        lvLevel.setAdapter(adapter);
    }

}
