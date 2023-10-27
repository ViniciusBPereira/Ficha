package com.example.token2.classes;

import com.example.token2.R;

public class Paladin {
    private String name;
    private int img;

    public Paladin(){
        this.name = "Paladin";
        this.img = R.drawable.dustin_rivers_paladin;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }
}
