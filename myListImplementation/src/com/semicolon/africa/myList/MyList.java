package com.semicolon.africa.myList;

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
