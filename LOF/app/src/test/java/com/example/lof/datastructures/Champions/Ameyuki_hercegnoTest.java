package com.example.lof.datastructures.Champions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ameyuki_hercegnoTest {
    Ameyuki_hercegno ah = new Ameyuki_hercegno();
    Yoshi y = new Yoshi();

    double mana = 240;
    double sAttackDamage = 40;
    double eAttackDamage = 55;
    double eDefence = 1.8;
    double eHealth = 680;
    double oAttackDamage;

    @Test
    public void quaternarySkill() {
        if(mana >= 180){
            mana -= 180;
            oAttackDamage = (sAttackDamage + eAttackDamage + 100)/eDefence;
            eHealth -= oAttackDamage;
        }

        ah.QuaternarySkill(y);
        assert(mana == ah.getMana() && eHealth == y.getHealthpoints());
    }

    @Test
    public void tertiarySkill(){
        if(mana >= 100){
            if((mana + 20) <= 240){
                mana += 20;
            }else{
                mana = 240;
            }
        }

        ah.TertiarySkill(y);
        assert(mana == ah.getMana());
    }
}