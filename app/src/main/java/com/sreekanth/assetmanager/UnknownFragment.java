package com.sreekanth.assetmanager;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class UnknownFragment extends Fragment {


    ListView mListView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_unknown,container,false);
        mListView = v.findViewById(R.id.listView);
        ArrayList<String> elememnts = new ArrayList<>();
        elememnts.add("12345789098754321");
        elememnts.add("12345789098754321");
        elememnts.add("12345789098754321");
        elememnts.add("12345789098754321");

        ArrayAdapter<String> adp = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,elememnts);
        mListView.setAdapter(adp);
        return v;
    }
}