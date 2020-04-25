package com.example.lof.datastructures.Champions;

import com.example.lof.datastructures.Character;
import com.example.lof.datastructures.Skill;
import com.example.lof.datastructures.Skin;

import java.util.Random;

public class Sakusa extends Character implements Skill, Skin {
    public Sakusa() {
        super("Sakusa", "ms", 380, 75, 280, 35, 65, 25, 1200);
    }

    @Override
    public void PrimarySkill(Character own, Character enemy) {
        double SMana = own.getMana();
        if(SMana >= 55){
            SMana -= 55;
            own.setMana(SMana);
            double EHealth = enemy.getHealthpoints();
            Random rnd = new Random();
            for (int i = 0; i < 4; i++){
                int EAttackDamage = rnd.nextInt(5);
                if(EAttackDamage == 0){
                    if(EHealth > 45){
                        EHealth -= 45;
                    }
                    else{
                        // az ellenfél meghal
                    }
                }
            }
        }
    }

    @Override
    public void SecondarySkill(Character own, Character enemy) {
        double SHealth = own.getHealthpoints();
        SHealth += 50;
        own.setHealthpoints(SHealth);
    }

    @Override
    public void TertiarySkill(Character own, Character enemy) {
        double SHealth = own.getHealthpoints();
        if(SHealth >= 40) {
            SHealth -= 40;
            own.setHealthpoints(SHealth);
            double SMana = own.getMana();
            SMana += 80;
            own.setMana(SMana);
        }
    }

    @Override
    public void QuaternarySkill(Character own, Character enemy) {
        double SMana = own.getMana();
        if(SMana >= 160){
            SMana -= 140;
            own.setMana(SMana);
            double SHealth = own.getHealthpoints();
            SHealth += 40;
            own.setHealthpoints(SHealth);
            double SAttackDamage = own.getAttackdamage();
            SAttackDamage += 15;
            own.setAttackdamage(SAttackDamage);
            double SDefence = own.getDefence();
            SDefence += 20;
            own.setDefence(SDefence);
        }
    }

    @Override
    public void SetPortraitPath(String portraitpath) {
        String portrait = portraitpath;
        this.setPortraitpath(portrait);
    }
}
