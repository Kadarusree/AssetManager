package com.sreekanth.assetmanager;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FoundFragment extends Fragment {


    RecyclerView mFoundList;
    private ListAdapter mAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_found,container,false);
        mFoundList = v.findViewById(R.id.foundList);
        ArrayList<ItemBean> items = prepareData();
        mAdapter = new ListAdapter(getActivity(),items);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mFoundList.setLayoutManager(mLayoutManager);
        mFoundList.setItemAnimator(new DefaultItemAnimator());
        mFoundList.setAdapter(mAdapter);
        return v;
    }

    public ArrayList<ItemBean> prepareData(){
        ItemBean mItem;
        ArrayList<ItemBean> mItems = new ArrayList<ItemBean>();
        for (int i = 0;i<15;i++){
            mItem = new ItemBean(R.drawable.money_bag,1,"01-15 1KG(F21-ALL ROOMS)","2001");
            mItems.add(mItem);
        }

        return mItems;
    }
}
