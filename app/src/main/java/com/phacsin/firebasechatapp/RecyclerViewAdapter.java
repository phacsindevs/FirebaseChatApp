package com.phacsin.firebasechatapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sachin on 17/10/17.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private List<ListItem> list;

    // ViewHolder which contains the individual item view for the recyclerview
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, message, time;

        public MyViewHolder(View view) {
            super(view);
            // Retrieve the reference from the view
            name =  view.findViewById(R.id.name);
            message = view.findViewById(R.id.message);
            time = view.findViewById(R.id.time);

        }
    }

    // Public Constructor
    public RecyclerViewAdapter(List<ListItem> list) {
        this.list = list;
    }

    // Method which is called when each item is created
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate our layout and return it to the adapter
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    // Method which binds data to the itemview
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // Binding our data from the list to the itemview
        ListItem item = list.get(position);
        holder.name.setText(item.getName());
        holder.message.setText(item.getMessage());
        holder.time.setText(item.getTime());

    }

    // Necessary Method
    @Override
    public int getItemCount() {
        return list.size();
    }
}
