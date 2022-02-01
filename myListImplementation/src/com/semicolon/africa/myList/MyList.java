package com.semicolon.africa.myList;

import java.util.Arrays;

public class MyList {
    private int capacity ;
    private int size;
    private String[] items;

    public MyList(int capacity) {
        this.capacity = capacity;
        items = new String[capacity];
    }

    public void add(String item) {
//        if (capacity <= size) capacity= capacity+1 * 2;

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null){
                items[i] = item;
                size++;
                break;
            }
            System.out.println(items.length);
        }
        if (capacity <= size){
            String[] fomerElements = items;
//                System.out.println(Arrays.toString(fomerElements));
            items = new String[2 * capacity];
//                System.out.println(items.length);
            items = fomerElements;
//                System.out.println(Arrays.toString(items));
//                items[i] = item;
//            i++;
        }
    }

    public String[] viewItem() {
        return items;
    }

    public int capacity() {
        return capacity;
    }


    public int size() {
        return size;
    }
}
