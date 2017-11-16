

package com.samset.samsetshimmerlayout.views;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.samset.samsetshimmerlayout.R;
import com.samset.samsetshimmerlayout.placeholder.RecyclerLayout;


/**
 * Created by samset on 05/06/17.
 */
public class ShimmerViewHolder extends RecyclerView.ViewHolder {

    public ShimmerViewHolder(LayoutInflater inflater, ViewGroup parent, int innerViewResId) {
        super(inflater.inflate(R.layout.viewholder_shimmer, parent, false));
        RecyclerLayout layout = (RecyclerLayout) itemView;

        View innerView = inflater.inflate(innerViewResId, layout, false);
        layout.addView(innerView);
        layout.setAutoStart(false);
    }

    /**
     * Binds the view
     */
    public void bind() {

        RecyclerLayout layout = (RecyclerLayout) itemView;
        layout.startShimmerAnimation();
    }
}
