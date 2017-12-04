package com.example.nas.foodordernavtab.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nas.foodordernavtab.ItemCollection.Satay;
import com.example.nas.foodordernavtab.R;

import java.util.ArrayList;

/**
 * Created by nas on 29/11/2017.
 */

public class SatayAdapterAku extends RecyclerView.Adapter<SatayAdapterAku.SatayViewHolder> {

    ArrayList<Satay> dataSet;
    Context mcontext;
    LayoutInflater inflater;

    public SatayAdapterAku(ArrayList<Satay> data, Context mcontext) {
        this.dataSet = data;
        this.mcontext = mcontext;
    }

    public class SatayViewHolder extends RecyclerView.ViewHolder{
        TextView txtNamaSatay;

        public SatayViewHolder(View itemView) {
            super(itemView);
            txtNamaSatay = itemView.findViewById(R.id.txtNamaSatay);
        }
    }

    @Override
    public SatayViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.from(parent.getContext()).inflate(R.layout.single_item, parent, false);
        return new SatayViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SatayAdapterAku.SatayViewHolder holder, int position) {
        Satay satay = dataSet.get(position);
        holder.txtNamaSatay.setText(satay.getNamaSatay());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }


}
