package com.example.lof.datastructures.Champions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class YoshiTest {
    Yoshi y = new Yoshi();
    Yoshi y2 = new Yoshi();
    Sakusa s = new Sakusa();
    Sakusa s2 = new Sakusa();

    double mana = 225;
    double eHealth = 380;

    @Test
    public void tertiarySkill() {
        if(mana >= 70){
            mana -= 70;
            y2.setMana(mana);
            eHealth -= 115;
            s2.setHealthpoints(eHealth);
        }

        y.TertiarySkill(s);
        assert(mana == y.getMana() && eHealth == s.getHealthpoints());
    }
}