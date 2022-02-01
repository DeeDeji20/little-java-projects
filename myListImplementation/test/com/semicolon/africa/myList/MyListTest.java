package com.semicolon.africa.myList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {
    MyList list ;
    @BeforeEach
    void setUp(){
        list = new MyList(2);
    }
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
        assertArrayEquals(new String[]{"sweet", "Beads", "eggs"}, items);
    }
    @Test
    public void testToGetCapaitycOfArray(){
        assertEquals(1, list.capacity());
    }

//    @Test
//    public void getSize(){
//        list.add("Rice");
//        int size = list.size();
//        assertEquals(1, size);
//    }
//    @Test
//    public void testThatMoreItemsCanBeAddedtoList(){
//        list.add("Rice");
//        list.add("Beans");
//
////        assertEquals(new String[]{"Rice", "Beans"}, list.viewItem());
//        assertEquals(2, list.size());
////        assertEquals(2, list.capacity());
//    }
}
