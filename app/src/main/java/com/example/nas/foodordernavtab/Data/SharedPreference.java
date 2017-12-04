package com.example.nas.foodordernavtab.Data;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import com.example.nas.foodordernavtab.ItemCollection.Order;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nas on 30/11/2017.
 */

public class SharedPreference {

    public static final String PREFS_NAME = "PRODUCT_APP";
    public static final String ORDERS = "Product_Favorite";


//    public void saveFavorites(Context context, List<Product> favorites) {
//        SharedPreference settings;
//        SharedPreference.Editor editor;
//
//        settings = context.getSharedPreferences(PREFS_NAME,
//                Context.MODE_PRIVATE);
//        editor = settings.edit();
//
//        Gson gson = new Gson();
//        String jsonFavorites = gson.toJson(favorites);
//
//        editor.putString(FAVORITES, jsonFavorites);
//
//        editor.apply();
//    }

    public void saveOrders(Context context, String nama){
        SharedPreferences settings;
        SharedPreferences.Editor editor;

        settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        editor = settings.edit();

        Gson gson = new Gson();
        String jsonOrders = gson.toJson(nama);

        editor.putString(ORDERS, jsonOrders);

        editor.apply();
    }


//    public void addFavorite(Context context, Product product) {
//        List<Product> favorites = getFavorites(context);
//        if (favorites == null)
//            favorites = new ArrayList<Product>();
//        favorites.add(product);
//        saveFavorites(context, favorites);
//    }

    public void addOrder(Context context, String nama ){
        ArrayList<Order> orders = getOrders(context);
        if (orders == null)
            orders = new ArrayList<>();
        Order order = new Order();
        order.setNama(nama);
        orders.add(order);

        saveOrders(context, nama);
    }

//    public ArrayList<Product> getFavorites(Context context) {
//        SharedPreference settings;
//        List<Product> favorites;
//
//        settings = context.getSharedPreferences(PREFS_NAME,
//                Context.MODE_PRIVATE);
//
//        if (settings.contains(FAVORITES)) {
//            String jsonFavorites = settings.getString(FAVORITES, null);
//            Gson gson = new Gson();
//            Product[] favoriteItems = gson.fromJson(jsonFavorites,
//                    Product[].class);
//
//            favorites = Arrays.asList(favoriteItems);
//            favorites = new ArrayList<Product>(favorites);
//        } else
//            return null;
//
//        return (ArrayList<Product>) favorites;
//    }

    public getOrders(Context context){
        SharedPreferences settings;
        ArrayList<Order> orders;

        settings = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);

        if (settings.contains(ORDERS)){
            String jsonOrders = settings.getString(ORDERS, null);
            Gson gson = new Gson();
            String orderItems = gson.fromJson(jsonOrders, String.class);


            orders = new ArrayList<>();
            Order order = new Order();
            order.setNama(orderItems);
            orders.add(order);
        }

        return  ;

    }



}














