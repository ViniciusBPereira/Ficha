package com.example.token2.classes;

import com.example.token2.R;

public class Warlock {
    private String name;
    private int img;

    public Warlock(){
        this.name = "Warlock";
        this.img = R.drawable.dustin_rivers_warlock;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }
}
