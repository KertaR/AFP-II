package com.example.lof.datastructures.Champions;

import com.example.lof.datastructures.Character;
import com.example.lof.datastructures.Skill;

public class Yoshi extends Character implements Skill{
    public Yoshi(Skill[] skills, String name, String portraitpath, double healthpoints, double attackdamage, double mana, double manaregen, double defence, double criticalhit, int cost) {
        super(skills, name, portraitpath, healthpoints, attackdamage, mana, manaregen, defence, criticalhit, cost);
    }

    @Override
    public void PrimarySkill(Character own, Character enemy) {
        double SMana = own.getMana();
        if(SMana >= 105){
            SMana -= 105;
            own.setMana(SMana);
            double SAttackDamage = own.getAttackdamage();
            SAttackDamage += 20;
            own.setAttackdamage(SAttackDamage);
        }
    }

    @Override
    public void SecondarySkill(Character own, Character enemy) {
        double SMana = own.getMana();
        if(SMana >= 130) {
            SMana -= 130;
            own.setMana(SMana);
            double SDefence = own.getDefence();
            SDefence += 40;
            own.setDefence(SDefence);
        }
    }

    @Override
    public void TertiarySkill(Character own, Character enemy) {
        double SMana = own.getMana();
        if(SMana >= 70){
            SMana -= 70;
            own.setMana(SMana);
            double EHealth = enemy.getHealthpoints();
            if(EHealth > 115){
                EHealth -= 115;
                enemy.setHealthpoints(EHealth);
            }
            else{
                // az ellenfél meghal
            }
        }
    }

    @Override
    public void QuaternarySkill(Character own, Character enemy) {
        double SMana = own.getMana();
        if(SMana >= 40){
            SMana -= 40;
            own.setMana(SMana);
            double SHealth = own.getHealthpoints();
            SHealth += 90;
            own.setHealthpoints(SHealth);
        }
    }
}
