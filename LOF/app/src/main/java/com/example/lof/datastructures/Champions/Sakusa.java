package com.example.lof.datastructures.Champions;

import com.example.lof.datastructures.Character;
import com.example.lof.datastructures.Skill;

public class Sakusa extends Character implements Skill{
    public Sakusa(Skill[] skills, String name, String portraitpath, double healthpoints, double attackdamage, double mana, double manaregen, double defence, double criticalhit, int cost) {
        super(skills, name, portraitpath, healthpoints, attackdamage, mana, manaregen, defence, criticalhit, cost);
    }

    @Override
    public void PrimarySkill() {

    }

    @Override
    public void SecondarySkill() {

    }

    @Override
    public void TertiarySkill() {

    }

    @Override
    public void QuaternarySkill() {

    }
}
