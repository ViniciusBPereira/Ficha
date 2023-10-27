package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.token2.races.Dragonborn;
import com.example.token2.races.Dwarf;
import com.example.token2.races.Elf;
import com.example.token2.races.Gnome;
import com.example.token2.races.Half_Elf;
import com.example.token2.races.Half_Orc;
import com.example.token2.races.Halfling;
import com.example.token2.races.Human;
import com.example.token2.races.Tiefling;

public class Races extends AppCompatActivity {

    int i = 0;
    int r = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_races);

        Elf elf = new Elf();

        TextView name = findViewById(R.id.name);
        name.setText(elf.getName());

        ImageView img = findViewById(R.id.image_race);
        img.setImageResource(elf.getImage());

        TextView alignment = findViewById(R.id.alignment);
        alignment.setText(elf.getAlignment());
        alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView age = findViewById(R.id.age);
        age.setText(elf.getAge());
        age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView language = findViewById(R.id.language);
        language.setText(elf.getLanguage());
        language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView subrace = findViewById(R.id.subrace);
        subrace.setText(elf.getSubrace());
        subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        TextView bonus = findViewById(R.id.bonus);
        bonus.setText(elf.getBonus());
        bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        Button b = findViewById(R.id.back);
        b.setVisibility(View.INVISIBLE);
        r = 3;
    }

    public void back(View view){
        i--;
        if(i == 0){
            Button b = findViewById(R.id.back);
            b.setVisibility(View.INVISIBLE);
            Elf elf = new Elf();

            TextView name = findViewById(R.id.name);
            name.setText(elf.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(elf.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(elf.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(elf.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(elf.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(elf.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(elf.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 3;
        }else if(i == 1){
            Dwarf dwarf = new Dwarf();
            TextView name = findViewById(R.id.name);
            name.setText(dwarf.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(dwarf.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(dwarf.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(dwarf.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(dwarf.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(dwarf.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(dwarf.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 2;
        }else if(i == 2){
            Gnome gnome = new Gnome();
            TextView name = findViewById(R.id.name);
            name.setText(gnome.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(gnome.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(gnome.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(gnome.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(gnome.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(gnome.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(gnome.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 4;
        }else if(i == 3){
            Dragonborn dragonborn = new Dragonborn();
            TextView name = findViewById(R.id.name);
            name.setText(dragonborn.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(dragonborn.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(dragonborn.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(dragonborn.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(dragonborn.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(dragonborn.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(dragonborn.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 1;
        }else if(i == 4){
            Half_Elf halfElf = new Half_Elf();
            TextView name = findViewById(R.id.name);
            name.setText(halfElf.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(halfElf.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(halfElf.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(halfElf.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(halfElf.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(halfElf.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(halfElf.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 5;
        }else if(i == 5){
            Half_Orc halfOrc = new Half_Orc();
            TextView name = findViewById(R.id.name);
            name.setText(halfOrc.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(halfOrc.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(halfOrc.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(halfOrc.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(halfOrc.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(halfOrc.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(halfOrc.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 6;
        }else if(i == 6){
            Halfling halfling = new Halfling();
            TextView name = findViewById(R.id.name);
            name.setText(halfling.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(halfling.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(halfling.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(halfling.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(halfling.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(halfling.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(halfling.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 7;
        }else if(i == 7){
            Tiefling tiefling = new Tiefling();
            TextView name = findViewById(R.id.name);
            name.setText(tiefling.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(tiefling.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(tiefling.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(tiefling.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(tiefling.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(tiefling.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(tiefling.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            Button b = findViewById(R.id.next);
            b.setVisibility(View.VISIBLE);
            r = 9;
        }else if(i == 8) {
            Human human = new Human();
            TextView name = findViewById(R.id.name);
            name.setText(human.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(human.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(human.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(human.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(human.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(human.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(human.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 8;
        }
    }
    public void next(View view){
        i++;
        if(i == 1){
            Button b = findViewById(R.id.back);
            b.setVisibility(View.VISIBLE);
            Dwarf dwarf = new Dwarf();
            TextView name = findViewById(R.id.name);
            name.setText(dwarf.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(dwarf.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(dwarf.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(dwarf.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(dwarf.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(dwarf.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(dwarf.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 2;
        }else if(i == 2){
            Gnome gnome = new Gnome();
            TextView name = findViewById(R.id.name);
            name.setText(gnome.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(gnome.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(gnome.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(gnome.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(gnome.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(gnome.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(gnome.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 4;
        }else if(i == 3){
            Dragonborn dragonborn = new Dragonborn();
            TextView name = findViewById(R.id.name);
            name.setText(dragonborn.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(dragonborn.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(dragonborn.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(dragonborn.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(dragonborn.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(dragonborn.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(dragonborn.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 1;
        }else if(i == 4){
            Half_Elf halfElf = new Half_Elf();
            TextView name = findViewById(R.id.name);
            name.setText(halfElf.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(halfElf.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(halfElf.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(halfElf.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(halfElf.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(halfElf.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(halfElf.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 5;
        }else if(i == 5){
            Half_Orc halfOrc = new Half_Orc();
            TextView name = findViewById(R.id.name);
            name.setText(halfOrc.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(halfOrc.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(halfOrc.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(halfOrc.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(halfOrc.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(halfOrc.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(halfOrc.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 6;
        }else if(i == 6){
            Halfling halfling = new Halfling();
            TextView name = findViewById(R.id.name);
            name.setText(halfling.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(halfling.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(halfling.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(halfling.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(halfling.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(halfling.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(halfling.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 7;
        }else if(i == 7){
            Tiefling tiefling = new Tiefling();
            TextView name = findViewById(R.id.name);
            name.setText(tiefling.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(tiefling.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(tiefling.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(tiefling.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(tiefling.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(tiefling.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(tiefling.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 9;
        }else if(i == 8){
            Button b = findViewById(R.id.next);
            b.setVisibility(View.INVISIBLE);
            Human human = new Human();
            TextView name = findViewById(R.id.name);
            name.setText(human.getName());

            ImageView img = findViewById(R.id.image_race);
            img.setImageResource(human.getImage());

            TextView alignment = findViewById(R.id.alignment);
            alignment.setText(human.getAlignment());
            alignment.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView age = findViewById(R.id.age);
            age.setText(human.getAge());
            age.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView language = findViewById(R.id.language);
            language.setText(human.getLanguage());
            language.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView subrace = findViewById(R.id.subrace);
            subrace.setText(human.getSubrace());
            subrace.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

            TextView bonus = findViewById(R.id.bonus);
            bonus.setText(human.getBonus());
            bonus.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            r = 8;
        }
    }

    public void select(View view){
        Intent intent = new Intent(Races.this, Classes.class);
        String r2 = Integer.toString(r);
        intent.putExtra("r", r2);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_up, R.anim.slide_out_up);
    }
}