package com.hamnya.cardview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 85224 on 2017-03-23.
 */
public  class MyAdapter extends  RecyclerView.Adapter<MyAdapter.ViewHolder>{
    Context context;
    List<Card> cardList;
    int cardLayout;


    public static class ViewHolder extends  RecyclerView.ViewHolder{
        TextView titleText;
        TextView subtitleText;
        ImageView img;

        public ViewHolder(View itemView) {
            super(itemView);
            titleText = (TextView)itemView.findViewById(R.id.subtitle_tx);
            subtitleText = (TextView)itemView.findViewById(R.id.title_tx);
            img = (ImageView)itemView.findViewById(R.id.title_tx);
        }
    }

    public MyAdapter(Context context, List<Card> cardList, int cardLayout){
        this.context = context;
        this.cardList = cardList;
        this.cardLayout = cardLayout;

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}