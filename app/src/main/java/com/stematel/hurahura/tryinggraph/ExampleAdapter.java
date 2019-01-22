package com.stematel.hurahura.tryinggraph;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter <ExampleAdapter.ExampleViewHolder>{

    private ArrayList<ExampleItem> mExampleList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView1;
        public TextView mTextView1;
        public ImageView mImageView2;
        public TextView mTextView2;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView1= itemView.findViewById(R.id.img1);
            mTextView1 = itemView.findViewById(R.id.text1);
            mImageView2 = itemView.findViewById(R.id.img2);
            mTextView2 = itemView.findViewById(R.id.text2);
        }
    }

    public ExampleAdapter(ArrayList<ExampleItem> exampleList){
        mExampleList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ex,parent,false);
        ExampleViewHolder exViewHold = new ExampleViewHolder(v);
        return exViewHold;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder exampleViewHolder, int position) {
        ExampleItem currentItem = mExampleList.get(position);

        exampleViewHolder.mImageView1.setImageResource(currentItem.getImageResource1());
        exampleViewHolder.mTextView1.setText(currentItem.getText1());
        exampleViewHolder.mImageView2.setImageResource(currentItem.getImageResource2());
        exampleViewHolder.mTextView2.setText(currentItem.getText2());
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}
