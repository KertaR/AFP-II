package com.example.lof.datastructures;

import java.util.Random;

public class Character {
    public Character(String name, String portraitpath, double healthpoints, double attackdamage, double mana, double manaregen, double defence, double criticalhit, int cost) {
        this.name = name;
        this.portraitpath = portraitpath;
        this.healthpoints = healthpoints;
        this.attackdamage = attackdamage;
        this.mana = mana;
        this.manaregen = manaregen;
        this.defence = defence;
        this.criticalhit = criticalhit;
        this.cost = cost;
    }

    private String name;
    private String portraitpath;
    private double healthpoints;
    private double attackdamage;
    private double mana;
    private double manaregen;
    private double defence;
    private double criticalhit;
    private int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPortraitpath() {
        return portraitpath;
    }

    public void setPortraitpath(String portraitpath) {
        this.portraitpath = portraitpath;
    }

    public double getHealthpoints() {
        return healthpoints;
    }

    public void setHealthpoints(double healthpoints) {
        this.healthpoints = healthpoints;
    }

    public double getAttackdamage() {
        return attackdamage;
    }

    public void setAttackdamage(double attackdamage) {
        this.attackdamage = attackdamage;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public double getManaregen() {
        return manaregen;
    }

    public void setManaregen(double manaregen) {
        this.manaregen = manaregen;
    }

    public double getDefence() {
        return defence;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public double getCriticalhit() {
        return criticalhit;
    }

    public void setCriticalhit(double criticalhit) {
        this.criticalhit = criticalhit;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void Attack(Character own, Character enemy) {
        double SAttackDamage = own.getAttackdamage();
        Random rnd = new Random();
        int random = rnd.nextInt(4);
        if(random == 0){
            double SCriticalhit = own.getCriticalhit();
            SAttackDamage *= ((SCriticalhit/100)+1);
        }
        double EHealth = enemy.getHealthpoints();
        double EDefence = enemy.getDefence();
        SAttackDamage /= EDefence;
        if(EHealth > SAttackDamage){
            EHealth -= SAttackDamage;
            enemy.setHealthpoints(EHealth);
        }
        else{
            // az ellenfél meghal
        }
    }

}
