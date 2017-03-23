package com.hamnya.cardview;

import android.graphics.Bitmap;
import android.widget.TextView;

/**
 * Created by 85224 on 2017-03-23.
 */

public class Card {
    private String Title;
    private String SubTitle;
    private int cardImage;



    public Card() {}

    public Card(String title, String subTitle, int cardImage) {
        Title = title;
        SubTitle = subTitle;
        this.cardImage = cardImage;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSubTitle() {
        return SubTitle;
    }

    public void setSubTitle(String subTitle) {
        SubTitle = subTitle;
    }

    public int getCardImage() {
        return cardImage;
    }

    public void setCardImage(int cardImage) {
        this.cardImage = cardImage;
    }
}
