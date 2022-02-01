package com.semicolon.africa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CheckOutSystemTest {
    CheckOutSystem checkOutSystem;
    @BeforeEach
    public void setUp(){
        checkOutSystem = new CheckOutSystem();
    }
    @Test
    public void createClass(){
        assertNotNull(checkOutSystem);
    }

    @Test
    public void testThatProductnameCanBeAdded(){
        checkOutSystem.setProductName("Rice");
        assertEquals("Rice", checkOutSystem.getProductName());
    }
}
