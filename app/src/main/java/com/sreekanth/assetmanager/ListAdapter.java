package com.sreekanth.assetmanager;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder> {
    private Context context;
    private List<ItemBean> personList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView content, count, year;

        ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);

            content = view.findViewById(R.id.conent);
            count = view.findViewById(R.id.count);
            year = view.findViewById(R.id.year);
            thumbnail = view.findViewById(R.id.thumbnail);
        }
    }


    public ListAdapter(Context context, List<ItemBean> personList) {
        this.context = context;
        this.personList = personList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
       final ItemBean person = personList.get(position);
        holder.year.setText( person.getYear());
        holder.count.setText(person.getCount()+"");
        holder.content.setText(person.getName());
    }
    // recipe
    @Override
    public int getItemCount() {
        return personList.size();
    }


}