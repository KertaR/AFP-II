package com.example.lof.datastructures.Champions;

import com.example.lof.datastructures.Character;
import com.example.lof.datastructures.Skill;

public class Ameyuki_hercegno extends Character implements Skill {
    public Ameyuki_hercegno(Skill[] skills, String name, String portraitpath, double healthpoints, double attackdamage, double mana, double manaregen, double defence, double criticalhit, int cost) {
        super(skills, name, portraitpath, healthpoints, attackdamage, mana, manaregen, defence, criticalhit, cost);
    }

    @Override
    public void PrimarySkill(Character sajat, Character ellenfel) {
        double SMana = sajat.getMana();
        if(SMana >= 120){
            SMana -= 120;
            sajat.setMana(SMana);
            double EEletero = ellenfel.getHealthpoints();
            if(EEletero >= 75){
                EEletero -= 75;
                ellenfel.setHealthpoints(EEletero);
            }
        }
    }

    @Override
    public void SecondarySkill(Character sajat, Character ellenfel) {
        double SMana = sajat.getMana();
        if(SMana >= 60){
            SMana -= 60;
            sajat.setMana(SMana);
            double SEletero = sajat.getHealthpoints();
            SEletero += 50;
            sajat.setHealthpoints(SEletero);
        }
    }

    @Override
    public void TertiarySkill(Character sajat, Character ellenfel) {
        double SMana = sajat.getMana();
        if(SMana >= 100){
            SMana += 20;
            sajat.setMana(SMana);
        }
    }

    @Override
    public void QuaternarySkill(Character sajat, Character ellenfel) {
        double SMana = sajat.getMana();
        if(SMana >= 180){
            SMana -= 180;
            sajat.setMana(SMana);
            // visszaveri a sebzést
        }
    }
}
