package com.example.lof.datastructures.Champions;

import com.example.lof.datastructures.Character;
import com.example.lof.datastructures.Skill;

import java.util.Random;

public class Sakusa extends Character implements Skill{
    public Sakusa(Skill[] skills, String name, String portraitpath, double healthpoints, double attackdamage, double mana, double manaregen, double defence, double criticalhit, int cost) {
        super(skills, name, portraitpath, healthpoints, attackdamage, mana, manaregen, defence, criticalhit, cost);
    }

    @Override
    public void PrimarySkill(Character sajat, Character ellenfel) {
        double SMana = sajat.getMana();
        if(SMana >= 55){
            SMana -= 55;
            sajat.setMana(SMana);
            double EEletero = ellenfel.getHealthpoints();
            Random rnd = new Random();
            for (int i = 0; i < 4; i++){
                int ESebzes = rnd.nextInt(5);
                if(ESebzes == 0){
                    if(EEletero >= 45){
                        EEletero -= 45;
                    }
                    else{
                        // az ellenfél meghal
                    }
                }
            }
        }
    }

    @Override
    public void SecondarySkill(Character sajat, Character ellenfel) {

    }

    @Override
    public void TertiarySkill(Character sajat, Character ellenfel) {

    }

    @Override
    public void QuaternarySkill(Character sajat, Character ellenfel) {

    }
}
