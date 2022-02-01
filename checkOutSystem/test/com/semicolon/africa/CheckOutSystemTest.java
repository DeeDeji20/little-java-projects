package com.semicolon.africa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
    @Test
    public void testThatProductTotalPriceCanBecalculated(){
        checkOutSystem.setProductName("Rice");
        checkOutSystem.setPrice(200.0);
        checkOutSystem.setQuantity(5);

        assertEquals(1000, checkOutSystem.getTotal());
    }

    @Test
    public void testThatProductCanBeAddedToArrayList(){
        checkOutSystem.setProductName("Rice");
        checkOutSystem.setPrice(200.0);
        checkOutSystem.setQuantity(5);
        ArrayList<CheckOutSystem> list = new ArrayList<>();
//        list.add(CheckOutSystem);
    }

}
