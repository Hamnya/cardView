package com.hamnya.cardview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.CardView;
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
        CardView cardView;

        public ViewHolder(View itemView) {
            super(itemView);
            titleText = (TextView)itemView.findViewById(R.id.subtitle_tx);
            subtitleText = (TextView)itemView.findViewById(R.id.title_tx);
            img = (ImageView)itemView.findViewById(R.id.imageView);
            cardView = (CardView)itemView.findViewById(R.id.cv);
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

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Card card = cardList.get(position);
        Drawable drawable = context.getResources().getDrawable(card.getCardImage());
        holder.img.setImageDrawable(drawable);
        holder.titleText.setText(card.getTitle());
        holder.subtitleText.setText(card.getSubTitle());

    }

    @Override
    public int getItemCount() {
        return this.cardList.size();
    }

}