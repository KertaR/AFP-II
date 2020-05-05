package com.example.lof.controllers;

import com.example.lof.datastructures.Character;

import java.util.Random;

public class Csata {
    public static boolean isTevagy() {
        return tevagy;
    }

    public static void setTevagy(boolean tevagy2) {
        tevagy = tevagy2;
    }

    private static boolean tevagy;

    public static boolean Sorsol(){
        boolean tevagy = false;
        Random rnd = new Random();
        int random = rnd.nextInt(1);
        if (random == 0)  tevagy = !tevagy;
        return tevagy;
    }
    public static void KorCsata(Character player, Character enemy){
        if(!tevagy){
            enemy.Bot(player,enemy);
            tevagy = true;
        }
    }
}
