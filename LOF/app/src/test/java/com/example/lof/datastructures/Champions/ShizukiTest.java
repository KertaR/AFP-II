package com.example.lof.datastructures.Champions;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShizukiTest {

    @Test
    public void endRound() {
        Shizuki s = new Shizuki();
        double mana = 320;

        if((mana + 15) <= 320){
            mana += 15;
        }
        else{
            mana = 320;
        }
        s.EndRound();
        assert(mana == s.getMana());
    }
}