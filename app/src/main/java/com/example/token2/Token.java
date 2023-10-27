package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.token2.attributes.Attributes;
import com.example.token2.races.Dragonborn;
import com.example.token2.races.Dwarf;
import com.example.token2.races.Elf;
import com.example.token2.races.Gnome;
import com.example.token2.races.Half_Elf;
import com.example.token2.races.Half_Orc;
import com.example.token2.races.Halfling;
import com.example.token2.races.Human;
import com.example.token2.races.Tiefling;

public class Token extends AppCompatActivity {

    Attributes str = new Attributes("Strength", 0);
    Attributes con = new Attributes("Constitution", 0);
    Attributes dex = new Attributes("Dexterity", 0);
    Attributes int2 = new Attributes("Intelligence", 0);
    Attributes wis = new Attributes("Wisdom", 0);
    Attributes cha = new Attributes("Charisma", 0);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_token);
        TextView textView = findViewById(R.id.STR);
        textView.setText(str.getAtt());
        TextView textView2 = findViewById(R.id.CON);
        textView2.setText(con.getAtt());
        TextView textView3 = findViewById(R.id.DEX);
        textView3.setText(dex.getAtt());
        TextView textView4 = findViewById(R.id.INT);
        textView4.setText(int2.getAtt());
        TextView textView5 = findViewById(R.id.WIS);
        textView5.setText(wis.getAtt());
        TextView textView6 = findViewById(R.id.CHA);
        textView6.setText(cha.getAtt());


        TextView valueStr = findViewById(R.id.value_str);
        valueStr.setText(Integer.toString(str.getAmount()));
        TextView valueCon = findViewById(R.id.value_con);
        valueCon.setText(Integer.toString(con.getAmount()));
        TextView valueDex = findViewById(R.id.value_dex);
        valueDex.setText(Integer.toString(dex.getAmount()));
        TextView valueInt = findViewById(R.id.value_int);
        valueInt.setText(Integer.toString(int2.getAmount()));
        TextView valueWis = findViewById(R.id.value_wis);
        valueWis.setText(Integer.toString(wis.getAmount()));
        TextView valueCha = findViewById(R.id.value_cha);
        valueCha.setText(Integer.toString(cha.getAmount()));

        String r = getIntent().getStringExtra("r");
        String c = getIntent().getStringExtra("c");
        int c2 = Integer.parseInt(c);
        if(c2 == 1){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Barbaric");
        }else if(c2 == 2){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Bard");
        }else if(c2 == 3){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Cleric");
        }else if(c2 == 4){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Druid");
        }else if(c2 == 5){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Fighter");
        }else if(c2 == 6){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Monk");
        }else if(c2 == 7){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Paladin");
        }else if(c2 == 8){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Ranger");
        }else if(c2 == 9){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Rogue");
        }else if(c2 == 10){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Sorcerer");
        }else if(c2 == 11){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Warlock");
        }else if(c2 == 12){
            TextView classes = findViewById(R.id.classes);
            classes.setText("Wizard");
        }
        int r2 = Integer.parseInt(r);
        if(r2 == 1){
            Dragonborn d = new Dragonborn();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(d.getImage());
        }else if (r2 == 2) {
            Dwarf dw = new Dwarf();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(dw.getImage());
        }else if (r2 == 3) {
            Elf e = new Elf();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(e.getImage());
        }else if (r2 == 4) {
            Gnome g = new Gnome();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(g.getImage());
        }else if (r2 == 5) {
            Half_Elf he = new Half_Elf();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(he.getImage());
        }else if (r2 == 6) {
            Half_Orc ho = new Half_Orc();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(ho.getImage());
        }else if (r2 == 7) {
            Halfling h = new Halfling();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(h.getImage());
        }else if (r2 == 8) {
            Human hu = new Human();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(hu.getImage());
        }else if (r2 == 9) {
            Tiefling t = new Tiefling();
            ImageView img = findViewById(R.id.img_token);
            img.setImageResource(t.getImage());
        }
    }
}