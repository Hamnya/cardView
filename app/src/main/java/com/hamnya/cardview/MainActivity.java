package com.hamnya.cardview;

import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * 출처: https://developer.android.com/training/material/lists-cards.html,
 * https://medium.com/android-develop-android/android-개발-11-recyclerview와-cardview-fce1f4fc6c23#.3j2d75ccp
 * This is card view example using RecyclerView.
 */

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<Card> cardList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        cardList = new ArrayList<>();
        Card[] card = new Card[5];

        for(int i=0; i<5; i++){
            card[i] = new Card("Hi", "My name is hamnyahamnyaham", R.drawable.gift);
            cardList.add(card[i]);
        }

        adapter = new MyAdapter(MainActivity.this, cardList, R.layout.item_card);
        recyclerView.setAdapter(adapter);
    }


}
