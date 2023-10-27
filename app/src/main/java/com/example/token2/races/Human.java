package com.example.token2.races;

import com.example.token2.R;
import com.example.token2.races.buff.Bonus;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private final String name;
    private final int image;
    private final String alignment;
    private final String age;
    private final String language;
    private final String subrace;
    private final String bonus;
    private final List<Bonus> bonuses;

    public Human() {
        this.name = "Human";
        this.image = R.drawable._b5ee33e_bce5_459f_91b1_a6eed4e920eb;
        this.alignment = "Alignment: Humans tend toward no particular alignment. The best and the worst are found among them.";
        this.age = "Age: Humans reach adulthood in their late teens and live less than a century.";
        this.language = "Language: You can speak, read, and write Common and one extra language of your choice. Humans typically learn the languages of other peoples they deal with, including obscure dialects. They are fond of sprinkling their speech with words borrowed from other tongues: Orc curses, Elvish musical expressions, Dwarvish military phrases, and so on.";
        this.subrace = "Subrace: -";
        this.bonus = "ALL - 1";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("ALL", 1));
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
