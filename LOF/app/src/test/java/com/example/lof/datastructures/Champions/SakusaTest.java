package com.example.lof.datastructures.Champions;

import org.junit.Test;

import static org.junit.Assert.*;

public class SakusaTest {

    @Test
    public void setPortraitPath() {
        Sakusa s = new Sakusa();
        s.setPortraitpath("ms");
        assertEquals("ms",s.getPortraitpath());
    }
}