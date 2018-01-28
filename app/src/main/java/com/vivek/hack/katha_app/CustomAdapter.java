package com.vivek.hack.katha_app;


import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import static android.content.ContentValues.TAG;


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {


    private ArrayList<DataModel> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;

        public MyViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            this.textViewName = (TextView) itemView.findViewById(com.vivek.hack.katha_app.R.id.textViewName);
            this.imageViewIcon = (ImageView) itemView.findViewById(com.vivek.hack.katha_app.R.id.imageView);
        }

        @Override
        public void onClick(View itemview) {
            int a;
            Log.d(TAG, "onClick " + getPosition() + " " +itemview);
            a=getPosition();
            Log.d(TAG,"your value"+a);
           String p=null;
            if (a==0)
            {
                p="zero";
            }
            if (a==1)
            {
                p="one";
            }
            if (a==2)
            {
                p="two";
            }
            if (a==3)
            {
                p="three";
            }
            if (a==4)
            {
                p="four";
            }
 Intent intent = new Intent (itemview.getContext(), katha_detail.class);
            intent.putExtra("Data",p);
            itemview.getContext().startActivity(intent);
          }
    }


    public CustomAdapter(ArrayList<DataModel> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(com.vivek.hack.katha_app.R.layout.card_layout, parent, false);


        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(dataSet.get(listPosition).getName());
        imageView.setImageResource(dataSet.get(listPosition).getImage());
    }


    @Override
    public int getItemCount() {
        return dataSet.size();
    }


}