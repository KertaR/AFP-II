package com.example.lof.datastructures.Champions;

import com.example.lof.datastructures.Character;
import com.example.lof.datastructures.Skill;
import com.example.lof.datastructures.Skin;

public class Ameyuki_hercegno extends Character implements Skill, Skin {
    public Ameyuki_hercegno() {
        super("Ameyuki hercegnő", "ms", 520, 40, 240, 45, 80, 30, 800);
    }

    @Override
    public void PrimarySkill(Character own, Character enemy) {
        double SMana = own.getMana();
        if(SMana >= 120){
            SMana -= 120;
            own.setMana(SMana);
            double EHealth = enemy.getHealthpoints();
            if(EHealth > 75){
                EHealth -= 75;
                enemy.setHealthpoints(EHealth);
            }
            else{
                // az ellenfél meghal
            }
        }
    }

    @Override
    public void SecondarySkill(Character own, Character enemy) {
        double SMana = own.getMana();
        if(SMana >= 60){
            SMana -= 60;
            own.setMana(SMana);
            double SHealth = own.getHealthpoints();
            SHealth += 50;
            own.setHealthpoints(SHealth);
        }
    }

    @Override
    public void TertiarySkill(Character own, Character enemy) {
        double SMana = own.getMana();
        if(SMana >= 100){
            SMana += 20;
            own.setMana(SMana);
        }
    }

    @Override
    public void QuaternarySkill(Character own, Character enemy) {
        double SMana = own.getMana();
        if(SMana >= 180){
            SMana -= 180;
            own.setMana(SMana);
            double SAttackDamage = own.getAttackdamage();
            double EAttackDamage = enemy.getAttackdamage();
            double OAttackDamage = SAttackDamage + EAttackDamage;
            double EHealth = enemy.getHealthpoints();
            if(EHealth > OAttackDamage){
                EHealth -= OAttackDamage;
                enemy.setHealthpoints(EHealth);
            }
            else{
                // az ellenfél meghal
            }

        }
    }

    @Override
    public void SetPortraitPath(String portraitpath) {
        String portrait = portraitpath;
        this.setPortraitpath(portrait);
    }
}
