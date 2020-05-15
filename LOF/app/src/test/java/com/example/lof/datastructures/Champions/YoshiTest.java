package com.example.lof.datastructures.Champions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class YoshiTest {
    Yoshi y = new Yoshi();
    Sakusa s = new Sakusa();

    double mana = 225;
    double yHealth = 680;
    double sHealth = 380;

    @Test
    public void tertiarySkill() {
        if(mana >= 70){
            mana -= 70;
            sHealth -= 115;
        }

        y.TertiarySkill(s);
        assert(mana == y.getMana() && sHealth == s.getHealthpoints());
    }

    @Test
    public void quaternarySill(){
        if(mana >= 40){
            mana -= 40;
            if((yHealth + 90) <= 680){
                yHealth += 90;
            }else{
                yHealth = 680;
            }
        }
        y.QuaternarySkill(s);
        assert(mana == y.getMana() && yHealth == y.getHealthpoints());
    }
}