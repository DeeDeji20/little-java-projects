package com.semicolon.africa.myList;

public class MyList {
    private int capacity;
    private int size;
    private String[] items = new String[capacity];

    public void add(String item) {
        if (capacity <= size) capacity= capacity+1 * 2;
        for (int i = 0; i < items.length; i++) {
//            System.out.println(items.length);
            items[i] = item;
            size++;
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
