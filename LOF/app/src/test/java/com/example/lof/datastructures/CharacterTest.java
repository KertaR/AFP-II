package com.example.lof.datastructures;

import com.example.lof.datastructures.Champions.Yoshi;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {

    @Test
    public void getName() {
        Yoshi y = new Yoshi();
        assertEquals("Yoshi",y.getName());
    }
}