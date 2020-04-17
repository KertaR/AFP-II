package com.example.lof.datastructures;

public class Skin extends Character {

    public Skin(Skill[] skills, String name, String portraitpath, double healthpoints, double mana, double defence, double criticalhit, int cost) {
        super(skills, name, portraitpath, healthpoints, mana, defence, criticalhit, cost);
    }

    @Override
    public Skill[] getSkills() {
        return super.getSkills();
    }

    @Override
    public void setSkills(Skill[] skills) {
        super.setSkills(skills);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getPortraitpath() {
        return super.getPortraitpath();
    }

    @Override
    public void setPortraitpath(String portraitpath) {
        super.setPortraitpath(portraitpath);
    }

    @Override
    public double getHealthpoints() {
        return super.getHealthpoints();
    }

    @Override
    public void setHealthpoints(double healthpoints) {
        super.setHealthpoints(healthpoints);
    }

    @Override
    public double getMana() {
        return super.getMana();
    }

    @Override
    public void setMana(double mana) {
        super.setMana(mana);
    }

    @Override
    public double getDefence() {
        return super.getDefence();
    }

    @Override
    public void setDefence(double defence) {
        super.setDefence(defence);
    }

    @Override
    public double getCriticalhit() {
        return super.getCriticalhit();
    }

    @Override
    public void setCriticalhit(double criticalhit) {
        super.setCriticalhit(criticalhit);
    }

    @Override
    public int getCost() {
        return super.getCost();
    }

    @Override
    public void setCost(int cost) {
        super.setCost(cost);
    }
}
