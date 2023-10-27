package com.example.token2.races;

import com.example.token2.R;
import com.example.token2.races.buff.Bonus;

import java.util.ArrayList;
import java.util.List;

public class Dwarf {
    private final String name;
    private final int image;
    private final String alignment;
    private final String age;
    private final String language;
    private final String subrace;
    private final String bonus;
    private final List<Bonus> bonuses;

    public Dwarf() {
        this.name = "Dwarf";
        this.image = R.drawable.cfa5c262_88ad_4360_a6a3_e39216a4199c;
        this.alignment = "Alignment: Most dwarves are lawful, believing firmly in the benefits of a well-ordered society. They tend toward good as well, with a strong sense of fair play and a belief that everyone deserves to share in the benefits of a just order.";
        this.age = "Age: Dwarves mature at the same rate as humans, but they're considered young until they reach the age of 50. On average, they live about 350 years.";
        this.language = "Language: You can speak, read, and write Common and Dwarvish. Dwarvish is full of hard consonants and guttural sounds, and those characteristics spill over into whatever other language a dwarf might speak.";
        this.subrace = "Subrace: Hill-Dwarf";
        this.bonus = "CON - 2";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("CON", 2));
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
