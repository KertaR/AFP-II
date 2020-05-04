package com.example.lof.controllers;

import com.example.lof.datastructures.Character;

import java.util.Random;

public class Csata {
    public boolean isTevagy() {
        return tevagy;
    }

    public void setTevagy(boolean tevagy) {
        this.tevagy = tevagy;
    }

    private boolean tevagy;

    private boolean Sorsol(){
        boolean tevagy = false;
        Random rnd = new Random();
        int random = rnd.nextInt(1);
        if (random == 0)  tevagy = !tevagy;
        return tevagy;
    }
    public void KorCsata(Character enemy, Character player){

    }
}
