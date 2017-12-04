package com.example.nas.foodordernavtab.Interface;

import android.view.View;

/**
 * Created by nas on 29/11/2017.
 */

public interface ItemClickListener {

    void onClick(View view, int position);

    void onLongClick(View child, int childPosition);
}
