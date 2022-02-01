package com.semicolon.africa.myList;

public class MyList {
    private String[] items = new String[1];
    private int capacity;
    private int size;

    public void add(String item) {
        for (int i = 0; i < items.length; i++) {
            items[i] = item;
            size++;
        }
    }

    public String[] viewItem() {
        return items;
    }

    public int capacity() {
        return items.length;
    }

    public int size() {
        return size;
    }
}
