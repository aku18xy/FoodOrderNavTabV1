package com.example.nas.foodordernavtab;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nas.foodordernavtab.Adapter.SatayAdapterAku;
import com.example.nas.foodordernavtab.Interface.ItemClickListener;
import com.example.nas.foodordernavtab.ItemCollection.Satay;
import com.example.nas.foodordernavtab.TouchListener.RecyclerTouchListener;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SatayFragment extends Fragment {

    RecyclerView recyclerSatay;
    RecyclerView.LayoutManager layoutManager;
    static ArrayList<Satay> sataylist;


    public SatayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satay, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        sataylist = new ArrayList<>();

        sataylist.add(new Satay("Ayam", 0.9));
        sataylist.add(new Satay("Daging", 1.0));
        sataylist.add(new Satay("Kambing", 1.5));
        sataylist.add(new Satay("Perut", 1.2));

        recyclerSatay = (RecyclerView) view.findViewById(R.id.recyclerSatay);
        recyclerSatay.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this.getActivity());
        recyclerSatay.setLayoutManager(layoutManager);

        loadSatay();

    }

    public void loadSatay(){

        SatayAdapterAku a = new SatayAdapterAku(sataylist, this.getActivity());
        recyclerSatay.setAdapter(a);

        recyclerSatay.addOnItemTouchListener(new RecyclerTouchListener(this.getContext(),
                recyclerSatay, new ItemClickListener(){
            @Override
            public void onClick(View view, int position) {
                Satay satay = sataylist.get(position);
                Intent i = new Intent(SatayFragment.this.getActivity(), DetailActivity.class);
                Bundle b = new Bundle();
                b.putString("nama", satay.getNamaSatay());
                b.putDouble("harga", satay.getHargaSatay());
                i.putExtra("makan", b);


                startActivity(i);
            }

            @Override
            public void onLongClick(View child, int childPosition) {

            }
        }));
    }

}





















