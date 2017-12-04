package com.example.nas.foodordernavtab.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nas.foodordernavtab.ItemCollection.Order;
import com.example.nas.foodordernavtab.R;

import java.util.ArrayList;

/**
 * Created by nas on 30/11/2017.
 */

public class CartAdapterAku extends RecyclerView.Adapter<CartAdapterAku.CartViewHolder> {

    Context mcontext;
    ArrayList<Order> dataset;
    LayoutInflater inflater;

    public CartAdapterAku(Context context, ArrayList<Order> data) {
        this.mcontext = context;
        this.dataset = data;
    }

    public class CartViewHolder extends RecyclerView.ViewHolder {
        TextView txtNamaCart;

        public CartViewHolder(View itemView) {
            super(itemView);

            txtNamaCart = (TextView) itemView.findViewById(R.id.txtNamaCart);
        }
    }


    public CartViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.from(parent.getContext()).inflate(R.layout.single_item, parent, false);
        return new CartViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CartViewHolder holder, int position) {
    Order order = dataset.get(position);
    holder.txtNamaCart.setText(order.getNama());

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
