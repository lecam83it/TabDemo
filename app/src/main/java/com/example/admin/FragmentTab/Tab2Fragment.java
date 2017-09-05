package com.example.admin.FragmentTab;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.admin.FragmentDetails.Detail1;
import com.example.admin.FragmentDetails.Detail2;
import com.example.admin.tabdemo.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab2Fragment extends RootFragment {

    private ListView lvSubject;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;

    public Tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_tab2, container, false);

        addControls(view);
        addEvents();
        return view;
    }

    private void addEvents() {
        lvSubject.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getChildFragmentManager().beginTransaction().replace(R.id.frame_layout_tab_2, Detail2.newInstance(list.get(i))).addToBackStack(null).commit();
            }
        });

    }

    private void addControls(View view) {
        lvSubject = view.findViewById(R.id.lvSubject);
        list = new ArrayList<>();
        list.add("Toán Học");
        list.add("Vật Lý");
        list.add("Hóa Học");
        list.add("Ngữ Văn");
        list.add("Tiếng Anh");
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list);
        lvSubject.setAdapter(adapter);
    }


}
