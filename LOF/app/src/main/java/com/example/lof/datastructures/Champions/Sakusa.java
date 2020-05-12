package com.example.lof.datastructures.Champions;

import com.example.lof.datastructures.Character;
import com.example.lof.datastructures.Skill;
import com.example.lof.datastructures.Skin;

import java.util.Random;

public class Sakusa extends Character implements Skin {
    public Sakusa() {
        super("Sakusa", "ms", 380, 75, 280, 35, 1.25, 25, 1200);
    }

    private boolean skillUsed = false;

    @Override
    public void PrimarySkill(Character enemy) {
        double SMana = this.getMana();
        if(SMana >= 55){
            SMana -= 55;
            this.setMana(SMana);
            double EHealth = enemy.getHealthpoints();
            double EDefence = enemy.getDefence();
            Random rnd = new Random();
            for (int i = 0; i < 4; i++){
                int EAttackDamage = rnd.nextInt(5);
                if(EAttackDamage == 0){
                    EHealth -= (45/EDefence);
                    enemy.setHealthpoints(EHealth);
                }
            }
        }
    }

    @Override
    public void SecondarySkill(Character enemy) {
        double SDefence = this.getDefence();
        SDefence += 4;
        this.setDefence(SDefence);
        skillUsed = true;
    }

    @Override
    public void TertiarySkill(Character enemy) {
        double SHealth = this.getHealthpoints();
        if(SHealth >= 40) {
            SHealth -= 40;
            this.setHealthpoints(SHealth);
            double SMana = this.getMana();
            if((SMana + 80) <= 280){
                SMana += 80;
            }
            else{
                SMana = 280;
            }
            this.setMana(SMana);
        }
    }

    @Override
    public void QuaternarySkill(Character enemy) {
        double SMana = this.getMana();
        if(SMana >= 160){
            SMana -= 160;
            this.setMana(SMana);
            double SHealth = this.getHealthpoints();
            if((SHealth + 40) <= 380){
                SHealth += 40;
            }
            else{
                SHealth = 380;
            }
            this.setHealthpoints(SHealth);
            double SAttackDamage = this.getAttackdamage();
            SAttackDamage += 25;
            this.setAttackdamage(SAttackDamage);
            double SDefence = this.getDefence();
            SDefence += 1.2;
            this.setDefence(SDefence);
        }
    }

    @Override
    public void EndRound() {
        if(skillUsed == true){
            double SDefence = this.getDefence();
            SDefence -= 4;
            this.setDefence(SDefence);
            skillUsed = false;
        }
        double SMana = this.getMana();
        SMana += this.getManaregen();
        this.setMana(SMana);
    }

    @Override
    public void Bot(Character own, Character enemy) {
        double EHealth = enemy.getHealthpoints();
        double SHealth = this.getHealthpoints();
        double SMana = this.getMana();
        if(SHealth > 200 && SMana >= 55){
            PrimarySkill(enemy);
        }
        else if(SHealth >= 280 && SMana <= 250){
            TertiarySkill(enemy);
        }
        else if(SHealth <= 100){
            SecondarySkill(enemy);
        }
        else if( SMana >= 160){
            QuaternarySkill(enemy);
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
