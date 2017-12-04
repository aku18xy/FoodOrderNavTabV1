package com.example.nas.foodordernavtab;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.nas.foodordernavtab.Adapter.CartAdapterAku;
import com.example.nas.foodordernavtab.Data.SharedPreference;
import com.example.nas.foodordernavtab.ItemCollection.Order;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    RecyclerView recyclerCart;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Order> orders;
    String nama;
    SharedPreference pref;

    String now="";
    String prev = "";

    CartAdapterAku adapterAku;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);


        //first try.. just send data. no add data. failed
//        sharedPreference = new SharedPreference();
//        favorites = sharedPreference.getFavorites(activity);
//
//        if (favorites == null) {
//            showAlert(getResources().getString(R.string.no_favorites_items),
//                    getResources().getString(R.string.no_favorites_msg));
//        } else {
//
//            if (favorites.size() == 0) {
//                showAlert(
//                        getResources().getString(R.string.no_favorites_items),
//                        getResources().getString(R.string.no_favorites_msg));
//            }
//
//            favoriteList = (ListView) view.findViewById(R.id.list_product);
//            if (favorites != null) {
//                productListAdapter = new ProductListAdapter(activity, favorites);
//                favoriteList.setAdapter(productListAdapter);



        //second try.. cannot implement. failed
//        pref = new SharedPreference();
//        orders = pref.getOrders(this);

        recyclerCart = (RecyclerView) findViewById(R.id.listCart);
        recyclerCart.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerCart.setLayoutManager(layoutManager);

        CartAdapterAku adapterAku = new CartAdapterAku(this, orders);
        recyclerCart.setAdapter(adapterAku);











//        SharedPreference prefs = PreferenceManager.getDefaultSharedPreferences(this);
//        String nama = prefs.getString("nama", "no id"); //no id: default value
//
//
//        TextView test = (TextView) findViewById(R.id.test);
//
//        now = nama + prev;
//        test.setText(now);
//        prev = now;

//        addItem(orders);
//
//        recyclerCart = (RecyclerView) findViewById(R.id.listCart);
//        recyclerCart.setHasFixedSize(true);
//        layoutManager = new LinearLayoutManager(this);
//        recyclerCart.setLayoutManager(layoutManager);
//
//        CartAdapterAku adapterAku = new CartAdapterAku(this, orders);
//        recyclerCart.setAdapter(adapterAku);


    }

//    public void addItem(ArrayList<Order> orders){
//
//        Order order = new Order();
//        order.setNama(nama);
//        orders.add(order);
//
//    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

    }

    @Override
    public SharedPreferences getPreferences(int mode) {
        return super.getPreferences(mode);
    }


}
