package com.mytechideas.explicitintentexample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>  {

    private String[] mDataset;
    //TODO 1: Add an mContext member variable of type Context
    private Context mContext;
    //TODO 4: Create an OnClickAdapter interface with a single OnClickView() method with a View parameter

    public interface OnclickAdapter{
        void OnClickView(View view);
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;

        public MyViewHolder(TextView v) {
            super(v);
            textView = v;
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    //TODO 2: Modify the constructor to receive a second parameter of type Context
    public MyAdapter(String[] myDataset, Context context) {
        mDataset = myDataset;
        //TODO 3: Assign activity context to the mContext variable
        mContext = context;

    }

    // Create new views (invoked by the layout manager)
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {

        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);



        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.textView.setText(mDataset[position]);
        //TODO 5: Add an OnClickListener to the textview in the holder
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OnclickAdapter Obinterface= (OnclickAdapter)mContext;
                Obinterface.OnClickView(view);
            }
        });
        //TODO 6: Cast mContext to an OnCLickAdapter interface
        //TODO 7: Create an OnCLickAdapter interface variable named Obinterface and assign the casted mContext variable to it
        //TODO 8: Call the OnClickView method from the interface object and pass the view as a parameter


    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
