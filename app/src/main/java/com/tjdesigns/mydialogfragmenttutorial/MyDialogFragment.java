package com.tjdesigns.mydialogfragmenttutorial;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyDialogFragment extends DialogFragment {

    String[] left_string_array;
    String[] right_string_array;

    ListView leftListView;
    ListView rightListView;

    public MyDialogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        left_string_array = getResources().getStringArray(R.array.left_string_array);
        right_string_array = getResources().getStringArray(R.array.right_string_array);

        View view = inflater.inflate(R.layout.fragment_my_dialog, container, true);
        leftListView = (ListView)view.findViewById(R.id.leftListView);
        rightListView = (ListView)view.findViewById(R.id.rightListView);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, left_string_array);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, right_string_array);
    }
}
