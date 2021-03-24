package com.example.newsreader;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public interface OnRecyclerViewItemClickListener <VH extends RecyclerView.ViewHolder> {
    void onItemClick(int position, View view);
}
