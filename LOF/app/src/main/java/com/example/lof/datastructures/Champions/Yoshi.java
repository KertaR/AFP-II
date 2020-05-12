package com.example.lof.datastructures.Champions;

import com.example.lof.datastructures.Character;
import com.example.lof.datastructures.Skill;
import com.example.lof.datastructures.Skin;

public class Yoshi extends Character implements Skin{
    public Yoshi() {
        super("Yoshi", "ms", 680, 55, 225, 50, 1.8, 50, 1150);
    }

    @Override
    public void PrimarySkill(Character enemy) {
        double SMana = this.getMana();
        if(SMana >= 105){
            SMana -= 105;
            this.setMana(SMana);
            double SAttackDamage = this.getAttackdamage();
            SAttackDamage += 20;
            this.setAttackdamage(SAttackDamage);
        }
    }

    @Override
    public void SecondarySkill(Character enemy) {
        double SMana = this.getMana();
        if(SMana >= 130) {
            SMana -= 130;
            this.setMana(SMana);
            double SDefence = this.getDefence();
            SDefence += 1.5;
            this.setDefence(SDefence);
        }
    }

    @Override
    public void TertiarySkill(Character enemy) {
        double SMana = this.getMana();
        if(SMana >= 70){
            SMana -= 70;
            this.setMana(SMana);
            double EHealth = enemy.getHealthpoints();
            EHealth -= 115;
            enemy.setHealthpoints(EHealth);
        }
    }

    @Override
    public void QuaternarySkill(Character enemy) {
        double SMana = this.getMana();
        if(SMana >= 40){
            SMana -= 40;
            this.setMana(SMana);
            double SHealth = this.getHealthpoints();
            SHealth += 90;
            this.setHealthpoints(SHealth);
        }
    }

    @Override
    public void EndRound() {
        double SMana = this.getMana();
        SMana += this.getManaregen();
        this.setMana(SMana);
    }

    @Override
    public void Bot(Character own, Character enemy) {
        double EHealth = enemy.getHealthpoints();
        double SHealth = this.getHealthpoints();
        double SMana = this.getMana();
        if(SHealth > 105 && SMana >= 70){
            TertiarySkill(enemy);
        }
        else if( SHealth <= 100 && SMana >= 40){
            QuaternarySkill(enemy);
        }
        else if( EHealth <= 150 && SMana >= 130){
            SecondarySkill(enemy);
        }
        else if( EHealth >= 400 && SMana >= 105){
            PrimarySkill(enemy);
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
