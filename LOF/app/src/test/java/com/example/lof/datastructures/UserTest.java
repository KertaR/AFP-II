package com.example.lof.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void getPassword() {
        User u = new User();
        u.setPassword("sdsdfg");
        assertEquals("sdsdfg",u.getPassword());
    }
}