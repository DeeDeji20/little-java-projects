package com.semicolon.africa.myList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {
    MyList list ;
    @BeforeEach
    void setUp(){
        list = new MyList(2);}
    @Test
    public void createlistClass(){
        assertNotNull(list);
    }

    @Test
    public void testThatItemsCanBeAddedtoList(){
        list.add("Rice");
        String[] items = list.viewItem();
        assertArrayEquals(new String[]{"Rice", null}, items);
    }

    @Test
    public void testthatMoreItemsCanBeAdded(){
        list.add("sweet");
        list.add("Beads");
        list.add("eggs");
        String[] items = list.viewItem();
        assertArrayEquals(new String[]{"sweet", "Beads", "eggs", null}, items);
    }

    @Test
    public void testthatEvenMoreItemsCanBeAdded(){
        list.add("sweet");
        list.add("Beads");
        list.add("eggs");
        list.add("veg");
        list.add("oil");
        list.add("yam");
        list.add("spag");
        String[] items = list.viewItem();
        assertArrayEquals(new String[]{"sweet", "Beads", "eggs", "veg", "oil", "yam", "spag", null}, items);
    }
    @Test
    public void testToGetCapaitycOfArray(){
        assertEquals(2, list.capacity());
    }

    @Test
    public void getSize(){
        list.add("Rice");
        int size = list.size();
        assertEquals(1, size);
    }
    @Test
    public void testThatMoreItemsCanBeAddedtoList(){
        list.add("Rice");
        list.add("Beans");
        assertEquals(2, list.size());
    }

    @Test
    public void testThatAnElementcanbeRemovedFromTheList(){
        list.add("sweet");
        list.add("Beads");
        list.add("eggs");
        list.add("veg");
        list.add("oil");
        list.add("yam");
        list.add("spag");

        list.remove("Beads");
        String[] items = list.viewItem();
        System.out.println(Arrays.toString(items));
        assertArrayEquals(new String[]{"sweet", "eggs", "veg", "oil", "yam","spag", null, null}, items);

    }
    @Test
    public void testThatAnElementcanbeRemovedFromTheList2(){
        list.add("sweet");
        list.add("Beads");
        list.add("eggs");
        list.add("veg");
        list.add("oil");
        list.add("yam");
        list.add("spag");

        list.remove("eggs");
        String[] items = list.viewItem();
        System.out.println(Arrays.toString(items));
        assertArrayEquals(new String[]{"sweet", "Beads", "veg", "oil", "yam","spag", null, null}, items);
    }

    @Test
    public void testThatElementsCanBeGottenByElementName(){
        list.add("sweet");
        list.add("Beads");
        list.add("eggs");
        list.add("veg");
        list.add("oil");
        list.add("yam");
        list.add("spag");

        String ele = list.getElement("eggs");
        assertEquals("eggs", ele);
    }
    @Test
    public void testThatElementsCanBeGottenByIndex(){
        list.add("sweet");
        list.add("Beads");
        list.add("eggs");
        list.add("veg");
        list.add("oil");
        list.add("yam");
        list.add("spag");
        String ele = list.getElement(1);
        assertEquals("Beads", ele);
    }

    @Test
    public void testThatElementsCanBeAddedAtPosition(){
        list.add("sweet");
        list.add("Beads");
        list.add("eggs");
        list.add("veg");
        list.add("sweet");
        list.add(2, "utensils");
        String[] items = list.viewItem();
        assertArrayEquals(new String[]{"sweet", "Beads","utensils", "eggs", "veg"}, items);
    }
}
