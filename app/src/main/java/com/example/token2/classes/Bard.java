package com.example.token2.classes;

import com.example.token2.R;

public class Bard {
    private String name;
    private int img;

    public Bard(){
        this.name = "Bard";
        this.img = R.drawable.dustin_rivers_bard;
    }

    public String getName() {
        return name;
    }

    public int getImg() {
        return img;
    }
}
