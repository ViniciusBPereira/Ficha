package com.example.token2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.token2.classes.Barbaric;
import com.example.token2.classes.Bard;
import com.example.token2.classes.Cleric;
import com.example.token2.classes.Druid;
import com.example.token2.classes.Fighter;
import com.example.token2.classes.Monk;
import com.example.token2.classes.Paladin;
import com.example.token2.classes.Ranger;
import com.example.token2.classes.Rogue;
import com.example.token2.classes.Sorcerer;
import com.example.token2.classes.Warlock;
import com.example.token2.classes.Wizard;

public class Classes extends AppCompatActivity {

    int c = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classes);

        Barbaric b = new Barbaric();
        Paladin p = new Paladin();
        Bard ba = new Bard();
        Druid d = new Druid();
        Cleric c = new Cleric();
        Fighter f = new Fighter();
        Rogue r = new Rogue();
        Ranger ra = new Ranger();
        Monk m = new Monk();
        Warlock w = new Warlock();
        Wizard wi = new Wizard();
        Sorcerer s = new Sorcerer();

        ImageView img_barbaric = findViewById(R.id.barbaric);
        img_barbaric.setImageResource(b.getImg());
        Animation an = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg = findViewById(R.id.bg_name);
        TextView t1 = findViewById(R.id.name1);
        t1.setText(b.getName());
        t1.setAnimation(an);
        bg.setAnimation(an);
        img_barbaric.setAnimation(an);
        an.setDuration(0L);
        an.start();

        ImageView img_paladin = findViewById(R.id.paladin);
        img_paladin.setImageResource(p.getImg());
        Animation an2 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg2 = findViewById(R.id.bg_name2);
        TextView t2 = findViewById(R.id.name2);
        t2.setText(p.getName());
        t2.setAnimation(an2);
        bg2.setAnimation(an2);
        img_paladin.setAnimation(an2);
        an2.setDuration(1000L);
        an2.start();

        ImageView img_bard = findViewById(R.id.bard);
        img_bard.setImageResource(ba.getImg());
        Animation an3 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg3 = findViewById(R.id.bg_name3);
        TextView t3 = findViewById(R.id.name3);
        t3.setText(ba.getName());
        t3.setAnimation(an3);
        bg3.setAnimation(an3);
        img_bard.setAnimation(an3);
        an3.setDuration(1000L);
        an3.start();

        ImageView img_druid = findViewById(R.id.druid);
        img_druid.setImageResource(d.getImg());
        Animation an4 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg4 = findViewById(R.id.bg_name4);
        TextView t4 = findViewById(R.id.name4);
        t4.setText(d.getName());
        t4.setAnimation(an4);
        bg4.setAnimation(an4);
        img_druid.setAnimation(an4);
        an4.setDuration(2000L);
        an4.start();

        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setImageResource(c.getImg());
        Animation an5 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg5 = findViewById(R.id.bg_name5);
        TextView t5 = findViewById(R.id.name5);
        t5.setText(c.getName());
        t5.setAnimation(an5);
        bg5.setAnimation(an5);
        img_cleric.setAnimation(an5);
        an5.setDuration(2000L);
        an5.start();

        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setImageResource(f.getImg());
        Animation an6 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg6 = findViewById(R.id.bg_name6);
        TextView t6 = findViewById(R.id.name6);
        t6.setText(f.getName());
        t6.setAnimation(an6);
        bg6.setAnimation(an6);
        img_fighter.setAnimation(an6);
        an6.setDuration(2000L);
        an6.start();

        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setImageResource(r.getImg());
        Animation an7 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg7 = findViewById(R.id.bg_name7);
        TextView t7 = findViewById(R.id.name7);
        t7.setText(r.getName());
        t7.setAnimation(an7);
        bg7.setAnimation(an7);
        img_rogue.setAnimation(an7);
        an7.setDuration(2500L);
        an7.start();

        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setImageResource(ra.getImg());
        Animation an8 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg8 = findViewById(R.id.bg_name8);
        TextView t8 = findViewById(R.id.name8);
        t8.setText(ra.getName());
        t8.setAnimation(an8);
        bg8.setAnimation(an8);
        img_ranger.setAnimation(an8);
        an8.setDuration(2500L);
        an8.start();

        ImageView img_monk = findViewById(R.id.monk);
        img_monk.setImageResource(m.getImg());
        Animation an9 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg9 = findViewById(R.id.bg_name9);
        TextView t9 = findViewById(R.id.name9);
        t9.setText(m.getName());
        t9.setAnimation(an9);
        bg9.setAnimation(an9);
        img_monk.setAnimation(an9);
        an9.setDuration(2500L);
        an9.start();

        ImageView img_warlock = findViewById(R.id.warlock);
        img_warlock.setImageResource(w.getImg());
        Animation an10 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg10 = findViewById(R.id.bg_name10);
        TextView t10 = findViewById(R.id.name10);
        t10.setText(w.getName());
        t10.setAnimation(an10);
        bg10.setAnimation(an10);
        img_warlock.setAnimation(an10);
        an10.setDuration(3000L);
        an10.start();

        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setImageResource(wi.getImg());
        Animation an11 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg11 = findViewById(R.id.bg_name11);
        TextView t11 = findViewById(R.id.name11);
        t11.setText(wi.getName());
        t11.setAnimation(an11);
        bg11.setAnimation(an11);
        img_wizard.setAnimation(an11);
        an11.setDuration(3000L);
        an11.start();

        ImageView img_sorcerer = findViewById(R.id.sorcerer);
        img_sorcerer.setImageResource(s.getImg());
        Animation an12 = AnimationUtils.loadAnimation(this, R.anim.btn_class_animate);
        ImageView bg12 = findViewById(R.id.bg_name12);
        TextView t12 = findViewById(R.id.name12);
        t12.setText(s.getName());
        t12.setAnimation(an12);
        bg12.setAnimation(an12);
        img_sorcerer.setAnimation(an12);
        an12.setDuration(3000L);
        an12.start();
    }

    public void select_barbaric(View view){
        ImageView img_paladin = findViewById(R.id.paladin);
        img_paladin.setAlpha(1f);
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(1f);
        ImageView img_druid = findViewById(R.id.druid);
        img_druid.setAlpha(1f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(1f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(1f);
        ImageView img_bard = findViewById(R.id.bard);
        img_bard.setAlpha(1f);
        ImageView img_monk = findViewById(R.id.monk);
        img_monk.setAlpha(1f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(1f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(1f);
        ImageView img_warlock = findViewById(R.id.warlock);
        img_warlock.setAlpha(1f);
        ImageView img_sorcerer = findViewById(R.id.sorcerer);
        img_sorcerer.setAlpha(1f);
        ImageView img_barbaric = findViewById(R.id.barbaric);
        img_barbaric.setAlpha(0.2f);
        c = 1;
    }
    public void select_paladin(View view){
        ImageView img_paladin = findViewById(R.id.paladin);
        img_paladin.setAlpha(0.2f);
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(1f);
        ImageView img_druid = findViewById(R.id.druid);
        img_druid.setAlpha(1f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(1f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(1f);
        ImageView img_bard = findViewById(R.id.bard);
        img_bard.setAlpha(1f);
        ImageView img_monk = findViewById(R.id.monk);
        img_monk.setAlpha(1f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(1f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(1f);
        ImageView img_warlock = findViewById(R.id.warlock);
        img_warlock.setAlpha(1f);
        ImageView img_sorcerer = findViewById(R.id.sorcerer);
        img_sorcerer.setAlpha(1f);
        ImageView img_barbaric = findViewById(R.id.barbaric);
        img_barbaric.setAlpha(1f);
        c = 7;
    }
    public void select_bard(View view){
        ImageView img_paladin = findViewById(R.id.paladin);
        img_paladin.setAlpha(1f);
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(1f);
        ImageView img_druid = findViewById(R.id.druid);
        img_druid.setAlpha(1f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(1f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(1f);
        ImageView img_bard = findViewById(R.id.bard);
        img_bard.setAlpha(0.2f);
        ImageView img_monk = findViewById(R.id.monk);
        img_monk.setAlpha(1f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(1f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(1f);
        ImageView img_warlock = findViewById(R.id.warlock);
        img_warlock.setAlpha(1f);
        ImageView img_sorcerer = findViewById(R.id.sorcerer);
        img_sorcerer.setAlpha(1f);
        ImageView img_barbaric = findViewById(R.id.barbaric);
        img_barbaric.setAlpha(1f);
        c = 2;
    }
    public void select_fighter(View view){
        ImageView img_paladin = findViewById(R.id.paladin);
        img_paladin.setAlpha(1f);
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(1f);
        ImageView img_druid = findViewById(R.id.druid);
        img_druid.setAlpha(1f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(1f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(1f);
        ImageView img_bard = findViewById(R.id.bard);
        img_bard.setAlpha(1f);
        ImageView img_monk = findViewById(R.id.monk);
        img_monk.setAlpha(1f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(0.2f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(1f);
        ImageView img_warlock = findViewById(R.id.warlock);
        img_warlock.setAlpha(1f);
        ImageView img_sorcerer = findViewById(R.id.sorcerer);
        img_sorcerer.setAlpha(1f);
        ImageView img_barbaric = findViewById(R.id.barbaric);
        img_barbaric.setAlpha(1f);
        c = 5;
    }
    public void select_cleric(View view){
        ImageView img_paladin = findViewById(R.id.paladin);
        img_paladin.setAlpha(1f);
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(0.2f);
        ImageView img_druid = findViewById(R.id.druid);
        img_druid.setAlpha(1f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(1f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(1f);
        ImageView img_bard = findViewById(R.id.bard);
        img_bard.setAlpha(1f);
        ImageView img_monk = findViewById(R.id.monk);
        img_monk.setAlpha(1f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(1f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(1f);
        ImageView img_warlock = findViewById(R.id.warlock);
        img_warlock.setAlpha(1f);
        ImageView img_sorcerer = findViewById(R.id.sorcerer);
        img_sorcerer.setAlpha(1f);
        ImageView img_barbaric = findViewById(R.id.barbaric);
        img_barbaric.setAlpha(1f);
        c = 3;
    }
    public void select_druid(View view){
        ImageView img_paladin = findViewById(R.id.paladin);
        img_paladin.setAlpha(1f);
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(1f);
        ImageView img_druid = findViewById(R.id.druid);
        img_druid.setAlpha(0.2f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(1f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(1f);
        ImageView img_bard = findViewById(R.id.bard);
        img_bard.setAlpha(1f);
        ImageView img_monk = findViewById(R.id.monk);
        img_monk.setAlpha(1f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(1f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(1f);
        ImageView img_warlock = findViewById(R.id.warlock);
        img_warlock.setAlpha(1f);
        ImageView img_sorcerer = findViewById(R.id.sorcerer);
        img_sorcerer.setAlpha(1f);
        ImageView img_barbaric = findViewById(R.id.barbaric);
        img_barbaric.setAlpha(1f);
        c = 4;
    }
    public void select_rogue(View view){
        ImageView img_paladin = findViewById(R.id.paladin);
        img_paladin.setAlpha(1f);
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(1f);
        ImageView img_druid = findViewById(R.id.druid);
        img_druid.setAlpha(1f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(0.2f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(1f);
        ImageView img_bard = findViewById(R.id.bard);
        img_bard.setAlpha(1f);
        ImageView img_monk = findViewById(R.id.monk);
        img_monk.setAlpha(1f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(1f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(1f);
        ImageView img_warlock = findViewById(R.id.warlock);
        img_warlock.setAlpha(1f);
        ImageView img_sorcerer = findViewById(R.id.sorcerer);
        img_sorcerer.setAlpha(1f);
        ImageView img_barbaric = findViewById(R.id.barbaric);
        img_barbaric.setAlpha(1f);
        c = 9;
    }
    public void select_ranger(View view){
        ImageView img_paladin = findViewById(R.id.paladin);
        img_paladin.setAlpha(1f);
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(1f);
        ImageView img_druid = findViewById(R.id.druid);
        img_druid.setAlpha(1f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(1f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(0.2f);
        ImageView img_bard = findViewById(R.id.bard);
        img_bard.setAlpha(1f);
        ImageView img_monk = findViewById(R.id.monk);
        img_monk.setAlpha(1f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(1f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(1f);
        ImageView img_warlock = findViewById(R.id.warlock);
        img_warlock.setAlpha(1f);
        ImageView img_sorcerer = findViewById(R.id.sorcerer);
        img_sorcerer.setAlpha(1f);
        ImageView img_barbaric = findViewById(R.id.barbaric);
        img_barbaric.setAlpha(1f);
        c = 8;
    }
    public void select_monk(View view){
        ImageView img_paladin = findViewById(R.id.paladin);
        img_paladin.setAlpha(1f);
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(1f);
        ImageView img_druid = findViewById(R.id.druid);
        img_druid.setAlpha(1f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(1f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(1f);
        ImageView img_bard = findViewById(R.id.bard);
        img_bard.setAlpha(1f);
        ImageView img_monk = findViewById(R.id.monk);
        img_monk.setAlpha(0.2f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(1f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(1f);
        ImageView img_warlock = findViewById(R.id.warlock);
        img_warlock.setAlpha(1f);
        ImageView img_sorcerer = findViewById(R.id.sorcerer);
        img_sorcerer.setAlpha(1f);
        ImageView img_barbaric = findViewById(R.id.barbaric);
        img_barbaric.setAlpha(1f);
        c = 6;
    }
    public void select_warlock(View view){
        ImageView img_paladin = findViewById(R.id.paladin);
        img_paladin.setAlpha(1f);
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(1f);
        ImageView img_druid = findViewById(R.id.druid);
        img_druid.setAlpha(1f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(1f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(1f);
        ImageView img_bard = findViewById(R.id.bard);
        img_bard.setAlpha(1f);
        ImageView img_monk = findViewById(R.id.monk);
        img_monk.setAlpha(1f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(1f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(1f);
        ImageView img_warlock = findViewById(R.id.warlock);
        img_warlock.setAlpha(0.2f);
        ImageView img_sorcerer = findViewById(R.id.sorcerer);
        img_sorcerer.setAlpha(1f);
        ImageView img_barbaric = findViewById(R.id.barbaric);
        img_barbaric.setAlpha(1f);
        c = 11;
    }
    public void select_wizard(View view){
        ImageView img_paladin = findViewById(R.id.paladin);
        img_paladin.setAlpha(1f);
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(1f);
        ImageView img_druid = findViewById(R.id.druid);
        img_druid.setAlpha(1f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(1f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(1f);
        ImageView img_bard = findViewById(R.id.bard);
        img_bard.setAlpha(1f);
        ImageView img_monk = findViewById(R.id.monk);
        img_monk.setAlpha(1f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(1f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(0.2f);
        ImageView img_warlock = findViewById(R.id.warlock);
        img_warlock.setAlpha(1f);
        ImageView img_sorcerer = findViewById(R.id.sorcerer);
        img_sorcerer.setAlpha(1f);
        ImageView img_barbaric = findViewById(R.id.barbaric);
        img_barbaric.setAlpha(1f);
        c = 12;
    }
    public void select_sorcerer(View view){
        ImageView img_paladin = findViewById(R.id.paladin);
        img_paladin.setAlpha(1f);
        ImageView img_cleric = findViewById(R.id.cleric);
        img_cleric.setAlpha(1f);
        ImageView img_druid = findViewById(R.id.druid);
        img_druid.setAlpha(1f);
        ImageView img_rogue = findViewById(R.id.rogue);
        img_rogue.setAlpha(1f);
        ImageView img_ranger = findViewById(R.id.ranger);
        img_ranger.setAlpha(1f);
        ImageView img_bard = findViewById(R.id.bard);
        img_bard.setAlpha(1f);
        ImageView img_monk = findViewById(R.id.monk);
        img_monk.setAlpha(1f);
        ImageView img_fighter = findViewById(R.id.fighter);
        img_fighter.setAlpha(1f);
        ImageView img_wizard = findViewById(R.id.wizard);
        img_wizard.setAlpha(1f);
        ImageView img_warlock = findViewById(R.id.warlock);
        img_warlock.setAlpha(1f);
        ImageView img_sorcerer = findViewById(R.id.sorcerer);
        img_sorcerer.setAlpha(0.2f);
        ImageView img_barbaric = findViewById(R.id.barbaric);
        img_barbaric.setAlpha(1f);
        c = 10;
    }

    public void select(View view){
        ImageView img_paladin = findViewById(R.id.paladin);
        ImageView img_cleric = findViewById(R.id.cleric);
        ImageView img_druid = findViewById(R.id.druid);
        ImageView img_rogue = findViewById(R.id.rogue);
        ImageView img_ranger = findViewById(R.id.ranger);
        ImageView img_bard = findViewById(R.id.bard);
        ImageView img_monk = findViewById(R.id.monk);
        ImageView img_fighter = findViewById(R.id.fighter);
        ImageView img_wizard = findViewById(R.id.wizard);
        ImageView img_warlock = findViewById(R.id.warlock);
        ImageView img_sorcerer = findViewById(R.id.sorcerer);
        ImageView img_barbaric = findViewById(R.id.barbaric);
        if(img_barbaric.getAlpha() != 1f || img_cleric.getAlpha() != 1f || img_paladin.getAlpha() != 1f || img_druid.getAlpha() != 1f || img_rogue.getAlpha() != 1f || img_ranger.getAlpha() != 1f || img_bard.getAlpha() != 1f || img_monk.getAlpha() != 1f || img_fighter.getAlpha() != 1f || img_wizard.getAlpha() != 1f || img_warlock.getAlpha() != 1f || img_sorcerer.getAlpha() != 1f){
            Intent intent = new Intent(Classes.this, Token.class);
            String r2 = getIntent().getStringExtra("r");
            String c2 = Integer.toString(c);
            intent.putExtra("r", r2);
            intent.putExtra("c", c2);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_down);
        }
    }

}