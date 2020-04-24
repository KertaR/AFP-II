package com.example.lof.datastructures.Champions;

import com.example.lof.datastructures.Character;
import com.example.lof.datastructures.Skill;

public class Shizuki extends Character implements Skill{
    public Shizuki(Skill[] skills, String name, String portraitpath, double healthpoints, double attackdamage, double mana, double manaregen, double defence, double criticalhit, int cost) {
        super(skills, name, portraitpath, healthpoints, attackdamage, mana, manaregen, defence, criticalhit, cost);
    }

    @Override
    public void PrimarySkill(Character sajat, Character ellenfel) {

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
