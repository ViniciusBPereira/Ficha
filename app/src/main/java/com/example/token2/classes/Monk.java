package com.example.token2.classes;

import com.example.token2.R;

public class Monk {
    private String name;
    private int img;

    public Monk(){
        this.name = "Monk";
        this.img = R.drawable.dustin_rivers_monk;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }
}
