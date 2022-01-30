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

    @Test
    public void testThataGuitarCanBeGottenBySerialNumber(){
        inventory.addGuitar("1", 2.30, "rick", "v1230", "electric", "lotasWood", "otunbaWood");
        inventory.addGuitar("2", 2.40, "pet", "v1231", "acoustic", "debsWood", "estasWood");
        inventory.addGuitar("3", 2.50, "mich", "v1232", "electric", "petWood", "sobaWood");

        Guitar guitar = inventory.getGuitar("1");
        assertEquals("1", guitar.getSerialNumber());
    }

    @Test
    public void testThatUserCanSearchforAGuitar(){
        inventory.addGuitar("1", 2.30, "rick", "v1230", "electric", "lotasWood", "otunbaWood");
        inventory.addGuitar("2", 2.40, "pet", "v1231", "acoustic", "debsWood", "estasWood");
        inventory.addGuitar("3", 2.50, "mich", "v1232", "electric", "petWood", "sobaWood");

        Guitar searchGuitar = new Guitar("2", 2.40, "pet", "v1231", "acoustic", "debsWood", "estasWood");
        Guitar guitar = inventory.search(searchGuitar);
        assertEquals("2", guitar.getSerialNumber());
    }
}