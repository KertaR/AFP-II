package com.example.lof.datastructures;

public class Character {
    public Character(Skill[] skills, String name, String portraitpath, double healthpoints, double mana, double defence, double criticalhit, int cost) {
        this.skills = skills;
        this.name = name;
        this.portraitpath = portraitpath;
        this.healthpoints = healthpoints;
        this.mana = mana;
        this.defence = defence;
        this.criticalhit = criticalhit;
        this.cost = cost;
    }

    private Skill[] skills = new Skill[4];
    private String name;
    private String portraitpath;
    private double healthpoints;
    private double mana;
    private double defence;
    private double criticalhit;
    private int cost;

    public Skill[] getSkills() {
        return skills;
    }

    public void setSkills(Skill[] skills) {
        this.skills = skills;
    }

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

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
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

}
