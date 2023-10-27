package com.example.token2.races;

import com.example.token2.R;
import com.example.token2.races.buff.Bonus;

import java.util.ArrayList;
import java.util.List;

public class Tiefling {
    private final String name;
    private final int image;
    private final String alignment;
    private final String age;
    private final String language;
    private final String subrace;
    private final String bonus;
    private final List<Bonus> bonuses;

    public Tiefling() {
        this.name = "Tiefling";
        this.image = R.drawable._f133ae8_16b3_45a1_a212_a4a9c316b7de;
        this.alignment = "Alignment: Tieflings might not have an innate tendency toward evil, but many of them end up there. Evil or not, an independent nature inclines many tieflings toward a chaotic alignment.";
        this.age = "Age: Tieflings mature at the same rate as humans but live a few years longer.";
        this.language = "Language: You can speak, read, and write Common and Infernal.";
        this.subrace = "Subrace: -";
        this.bonus = "INT - 1     CHA - 2";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("INT", 1));
        bonuses.add(new Bonus("CHA", 2));
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getAlignment() {
        return alignment;
    }

    public String getAge() {
        return age;
    }

    public String getLanguage() {
        return language;
    }

    public String getSubrace() {
        return subrace;
    }

    public String getBonus() {
        return bonus;
    }

    public List<Bonus> getBonuses() {
        return bonuses;
    }
}
