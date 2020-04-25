package com.example.lof.datastructures.Champions;

import com.example.lof.datastructures.Character;
import com.example.lof.datastructures.Skill;
import com.example.lof.datastructures.Skin;

public class Shizuki extends Character implements Skill, Skin{
    public Shizuki() {
        super("Shizuki", "ms", 470, 25, 320, 15, 105, 40, 1050);
    }

    @Override
    public void PrimarySkill(Character own, Character enemy) {
        double SMana = own.getMana();
        if(SMana >= 50){
            SMana -= 50;
            own.setMana(SMana);
            double EHealth = enemy.getHealthpoints();
            if(EHealth > 80){
                EHealth -= 80;
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
        if(SMana >= 80){
            SMana += 35;
            own.setMana(SMana);
            double SManaregen = own.getManaregen();
            SManaregen += 5;
            own.setManaregen(SManaregen);
        }
    }

    @Override
    public void TertiarySkill(Character own, Character enemy) {
        double SMana = own.getMana();
        if(SMana >= 170){
            SMana -= 170;
            own.setMana(SMana);
            double EHealth = enemy.getHealthpoints();
            if(EHealth > 155){
                EHealth -= 155;
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
        if(SMana >= 65){
            SMana -= 65;
            own.setMana(SMana);
            double SDefence = own.getDefence();
            SDefence += 35;
            own.setDefence(SDefence);
        }
    }

    @Override
    public void SetPortraitPath(String portraitpath) {
        String portrait = portraitpath;
        this.setPortraitpath(portrait);
    }
}
