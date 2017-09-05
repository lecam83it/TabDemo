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
import com.example.admin.tabdemo.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1Fragment extends RootFragment {

    private ListView lvStudent;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;

    public Tab1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_tab1, container, false);

        addControls(view);
        addEvents();
        return view;
    }

    private void addEvents() {

        lvStudent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                getChildFragmentManager().beginTransaction().replace(R.id.frame_layout_tab_1, Detail1.newInstance(list.get(i))).addToBackStack(null).commit();
            }
        });
    }

    private void addControls(View view) {
        lvStudent = view.findViewById(R.id.lvStudent);
        list = new ArrayList<>();
        list.add("Nguyễn Thế Anh");
        list.add("Trần Xuân Bách");
        list.add("Nguyễn Văn Bảy");
        list.add("Nguyễn Hữu Quốc Cường");
        list.add("Lê Minh Tường Dung");
        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list);
        lvStudent.setAdapter(adapter);
    }
}
