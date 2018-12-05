package com.samset.androidshimmerlayout.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.samset.androidshimmerlayout.R;
import com.samset.androidshimmerlayout.SecondActivity;

import androidx.recyclerview.widget.RecyclerView;

/**
 * Copyright (C) ShimmerLayout-master - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential.
 * Created by samset on 05/12/18 at 12:00 PM for ShimmerLayout-master .
 */


public class MyShimmerAdapter extends RecyclerView.Adapter<MyShimmerAdapter.MyViewHolder> {
    private Context context;

    public MyShimmerAdapter(Context ctx) {
        this.context = ctx;
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SecondActivity.class);
                context.startActivity(intent);
            }
        });
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        LinearLayout container;


        public MyViewHolder(View view) {
            super(view);
            container = view.findViewById(R.id.llcontainer);

        }
    }

}
