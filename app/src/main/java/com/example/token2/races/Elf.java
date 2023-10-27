package com.example.token2.races;

import com.example.token2.R;
import com.example.token2.races.buff.Bonus;

import java.util.ArrayList;
import java.util.List;

public class Elf {
    private final String name;
    private final int image;
    private final String alignment;
    private final String age;
    private final String language;
    private final String subrace;
    private final String bonus;
    private final List<Bonus> bonuses;

    public Elf() {
        this.name = "Elf";
        this.image = R.drawable.fbea5c4d_2323_45f3_9a97_3b62a18f1a1d;
        this.alignment = "Alignment: Elves love freedom, variety, and self-expression, so they lean strongly toward the gentler aspects of chaos. They value and protect others' freedom as well as their own, and they are more often good than not.";
        this.age = "Age: Although elves reach physical maturity at about the same age as humans, the elven understanding of adulthood goes beyond physical growth to encompass worldly experience. An elf typically claims adulthood and an adult name around the age of 100 and can live to be 750 years old.";
        this.language = "Language: You can speak, read, and write Common and Elvish. Elvish is fluid, with subtle intonations and intricate grammar. Elven literature is rich and varied, and their songs and poems are famous among other races. Many bards learn their language so they can add Elvish ballads to their repertoires.";
        this.subrace = "Subrace: High-Elf";
        this.bonus = "DEX - 2";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("DEX", 2));
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
