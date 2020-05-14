package com.example.lof.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTest {

    @Test
    public void getName() {
        User u = new User();
        u.setPassword("sdsdfg");
        assertEquals("sdsdfg",u.getPassword());
    }
}