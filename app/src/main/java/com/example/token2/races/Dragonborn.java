package com.example.token2.races;

import com.example.token2.R;
import com.example.token2.races.buff.Bonus;

import java.util.ArrayList;
import java.util.List;

public class Dragonborn {
    private final String name;
    private final int image;
    private final String alignment;
    private final String age;
    private final String language;
    private final String subrace;
    private final String bonus;
    private final List<Bonus> bonuses;

    public Dragonborn() {
        this.name = "Dragonborn";
        this.image = R.drawable._f3ce5a9_4bc4_4156_a917_fd4b11abbdba;
        this.alignment = "Alignment: Dragonborn tend to extremes, making a conscious choice for one side or the other in the cosmic war between good and evil. Most dragonborn are good, but those who side with evil can be terrible villains.";
        this.age = "Age: Young dragonborn grow quickly. They walk hours after hatching, attain the size and development of a 10-year-old human child by the age of 3, and reach adulthood by 15. They live to be around 80.";
        this.language = "Language: You can speak, read, and write Common and Draconic. Draconic is thought to be one of the oldest languages and is often used in the study of magic. The language sounds harsh to most other creatures and includes numerous hard consonants and sibilants.";
        this.subrace = "Subrace: -";
        this.bonus = "STR - 2     CHA - 1";
        this.bonuses = new ArrayList<Bonus>();
        bonuses.add(new Bonus("STR", 2));
        bonuses.add(new Bonus("CHA", 1));
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
