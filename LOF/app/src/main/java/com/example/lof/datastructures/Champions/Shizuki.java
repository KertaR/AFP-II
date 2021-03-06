package com.example.lof.datastructures.Champions;

import com.example.lof.datastructures.Character;
import com.example.lof.datastructures.Skill;
import com.example.lof.datastructures.Skin;

public class Shizuki extends Character implements Skin{
    public Shizuki() {
        super("Shizuki", "ms", 470, 35, 320, 15, 3, 40, 1050);
    }

    @Override
    public void PrimarySkill(Character enemy) {
        double SMana = this.getMana();
        if(SMana >= 50){
            SMana -= 50;
            this.setMana(SMana);
            double EHealth = enemy.getHealthpoints();
            double EDefence = enemy.getDefence();
            EHealth -= (80/EDefence);
            enemy.setHealthpoints(EHealth);
        }
    }

    @Override
    public void SecondarySkill(Character enemy) {
        double SMana = this.getMana();
        if(SMana >= 80){
            if((SMana + 35) <= 320){
                SMana += 35;
            }
            else{
                SMana = 320;
            }
            this.setMana(SMana);
            double SManaregen = this.getManaregen();
            SManaregen += 5;
            this.setManaregen(SManaregen);
        }
    }

    @Override
    public void TertiarySkill(Character enemy) {
        double SMana = this.getMana();
        if(SMana >= 170){
            SMana -= 170;
            this.setMana(SMana);
            double EHealth = enemy.getHealthpoints();
            double EDefence = enemy.getDefence();
            EHealth -= (155/EDefence);
            enemy.setHealthpoints(EHealth);
        }
    }

    @Override
    public void QuaternarySkill(Character enemy) {
        double SMana = this.getMana();
        if(SMana >= 65){
            SMana -= 65;
            this.setMana(SMana);
            double SDefence = this.getDefence();
            SDefence += 1.8;
            this.setDefence(SDefence);
        }
    }

    @Override
    public void EndRound() {
        double SMana = this.getMana();
        if((SMana + this.getManaregen()) <= 320){
            SMana += this.getManaregen();
        }
        else{
            SMana = 320;
        }
        this.setMana(SMana);
    }

    @Override
    public void Bot(Character own, Character enemy) {
        double EHealth = enemy.getHealthpoints();
        double SHealth = this.getHealthpoints();
        double SMana = this.getMana();
        if(SHealth > 140 && SMana >= 170){
            TertiarySkill(enemy);
        }
        else if(EHealth < 75 && SMana >= 50){
            PrimarySkill(enemy);
        }
        else if(SHealth < 100 && SMana <= 65){
            QuaternarySkill(enemy);
        }
        else if(SHealth > 400){
            SecondarySkill(enemy);
        }
        else{
            Attack(own, enemy);
        }
    }

    @Override
    public void SetPortraitPath(String portraitpath) {
        String portrait = portraitpath;
        this.setPortraitpath(portrait);
    }
}
