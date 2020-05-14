package com.example.lof.controllers;

import com.example.lof.datastructures.Champions.Sakusa;
import com.example.lof.datastructures.Champions.Yoshi;

import org.junit.Test;

import static org.junit.Assert.*;

public class CsataTest {
    boolean logikai = false;
    @Test
    public void isTevagy() {
        Csata cs = new Csata();
        cs.setTevagy(logikai);
        assertEquals(logikai,cs.isTevagy());
    }

    @Test
    public void korCsata() {
        Sakusa s = new Sakusa();
        Yoshi y = new Yoshi();
        if(logikai == false){
            y.Bot(s,y);
            logikai = true;
        }
        Csata cs = new Csata();
        cs.KorCsata(s,y);
        assertEquals(logikai,cs.isTevagy());
    }
}