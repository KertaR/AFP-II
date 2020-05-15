package com.example.lof.datastructures.Champions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Ameyuki_hercegnoTest {
    Ameyuki_hercegno ah = new Ameyuki_hercegno();
    Yoshi y = new Yoshi();

    double mana;
    double sAttackDamage;
    double eAttackDamage;
    double eDefence;
    double eHealth;
    double oAttackDamage;

    @Before
    public void set(){
        mana = ah.getMana();
        sAttackDamage = ah.getAttackdamage();
        eAttackDamage = y.getAttackdamage();
        eDefence = y.getDefence();
        eHealth = y.getHealthpoints();
    }

    @Test
    public void quaternarySkill() {
        if(mana >= 180){
            mana -= 180;
            ah.setMana(mana);
            oAttackDamage = (sAttackDamage + eAttackDamage + 100)/eDefence;
            eHealth -= oAttackDamage;
            y.setHealthpoints(eHealth);
        }

        ah.QuaternarySkill(y);
        assert(mana == ah.getMana() && eHealth == y.getHealthpoints());
    }
}