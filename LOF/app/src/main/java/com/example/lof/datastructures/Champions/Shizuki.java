package com.example.lof.datastructures.Champions;

import com.example.lof.datastructures.Character;
import com.example.lof.datastructures.Skill;

public class Shizuki extends Character implements Skill{
    public Shizuki(Skill[] skills, String name, String portraitpath, double healthpoints, double attackdamage, double mana, double manaregen, double defence, double criticalhit, int cost) {
        super(skills, name, portraitpath, healthpoints, attackdamage, mana, manaregen, defence, criticalhit, cost);
    }

    @Override
    public void PrimarySkill(Character own, Character enemy) {

    }

    @Override
    public void SecondarySkill(Character own, Character enemy) {

    }

    @Override
    public void TertiarySkill(Character own, Character enemy) {

    }

    @Override
    public void QuaternarySkill(Character own, Character enemy) {

    }
}
