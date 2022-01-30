package com.semicolon.guitarStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {
    Inventory inventory;
    @BeforeEach
    public void setUp(){
        inventory = new Inventory();
    }
    @Test
    public void testThatClassIsCreated(){
        assertNotNull(inventory);
    }
    @Test
    public void testThatGuitarCanBeAddedToInventory(){
        inventory.addGuitar("123", 2.30, "rick", "v1230", "electric", "lotasWood", "otunbaWood");
        assertEquals(1, inventory.getGuitars().size());
    }
}