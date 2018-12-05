
package com.samset.samsetshimmerlayout.views;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.samset.samsetshimmerlayout.R;

import androidx.recyclerview.widget.RecyclerView;


/**
 * Created by samset on 05/06/17.
 */

public class ShimmerAdapter extends RecyclerView.Adapter<ShimmerViewHolder> {

    private int mItemCount = 10;
    private int mLayoutReference = R.layout.layout_sample_view;


    public void setMinItemCount(int itemCount) {
        mItemCount = itemCount;
    }

    @Override
    public ShimmerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ShimmerViewHolder(inflater, parent, mLayoutReference);
    }

    @Override
    public void onBindViewHolder(ShimmerViewHolder holder, int position) {
        holder.bind();
    }

    @Override
    public int getItemCount() {
        return mItemCount;
    }

    public void setLayoutReference(int layoutReference) {
        this.mLayoutReference = layoutReference;
    }
}
