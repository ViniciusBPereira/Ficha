package com.example.token2.classes;

import com.example.token2.R;

public class Sorcerer {
    private String name;
    private int img;

    public Sorcerer(){
        this.name = "Sorcerer";
        this.img = R.drawable.dustin_rivers_sorcerer;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }
}
