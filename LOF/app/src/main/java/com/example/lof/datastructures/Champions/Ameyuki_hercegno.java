package com.example.lof.datastructures.Champions;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.View;

import com.example.lof.R;
import com.example.lof.datastructures.Character;
import com.example.lof.datastructures.Skill;
import com.example.lof.datastructures.Skin;

import java.util.Random;

public class Ameyuki_hercegno extends Character implements Skin {
    public Ameyuki_hercegno() {
        super("Ameyuki hercegnő", "ms", 520, 40, 240, 45, 1.5, 30, 800);
    }
    @Override
    public void PrimarySkill(Character enemy) {
        double SMana = this.getMana();
        if(SMana >= 120){
            SMana -= 120;
            this.setMana(SMana);
            double EHealth = enemy.getHealthpoints();
            double EDefence = enemy.getDefence();
            if(EHealth > (75/EDefence)){
                EHealth -= (75/EDefence);
                enemy.setHealthpoints(EHealth);
            }
            else{
                // az ellenfél meghal
            }
        }
    }

    @Override
    public void SecondarySkill(Character enemy) {
        double SMana = this.getMana();
        if(SMana >= 60){
            SMana -= 60;
            this.setMana(SMana);
            double SHealth = this.getHealthpoints();
            SHealth += 50;
            this.setHealthpoints(SHealth);
        }
    }

    @Override
    public void TertiarySkill(Character enemy) {
        double SMana = this.getMana();
        if(SMana >= 100){
            SMana += 20;
            this.setMana(SMana);
        }
    }

    @Override
    public void QuaternarySkill(Character enemy) {
        double SMana = this.getMana();
        if(SMana >= 180){
            SMana -= 180;
            this.setMana(SMana);
            double SAttackDamage = this.getAttackdamage();
            double EAttackDamage = enemy.getAttackdamage();
            double EDefence = enemy.getDefence();
            double OAttackDamage = (SAttackDamage + EAttackDamage + 100) / EDefence;
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
        if(SHealth > 150 && SMana >= 180){
            QuaternarySkill(enemy);
        }
        else if(EHealth < 100 && SMana >= 120){
            PrimarySkill(enemy);
        }
        else if(EHealth < 50 && SMana <= 120){
            Attack(own, enemy);
        }
        else if(SHealth < 100 && SMana <= 60){
            SecondarySkill(enemy);
        }
        else{
            Random rnd = new Random();
            int random = rnd.nextInt(10);
            if(random <= 7){
                Attack(own, enemy);
            }
            else{
                if(SMana >= 100){
                    TertiarySkill(enemy);
                }
                else{
                    Attack(own, enemy);
                }
            }
        }
    }

    @Override
    public void SetPortraitPath(String portraitpath) {
        String portrait = portraitpath;
        this.setPortraitpath(portrait);
    }


}
