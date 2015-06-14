package com.example.sunshine.app.Fragments;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.example.sunshine.app.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceHolderFragment extends Fragment {

    private ArrayAdapter<String> adapter;
    private ListView listView;


    public PlaceHolderFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] forecastArray = {
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 52/63",
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 52/63",
                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 52/63",
        };

        ArrayList<String> forecastData = new ArrayList<String>(Arrays.asList(forecastArray));


        View view = inflater.inflate(R.layout.fragment_place_holder, container, false);
        listView = (ListView) view.findViewById(R.id.listview_forecast);

        adapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_forecast,R.id.forecast_textview,forecastData);
        listView.setAdapter(adapter);

        // Inflate the layout for this fragment
        return view;
    }


}
