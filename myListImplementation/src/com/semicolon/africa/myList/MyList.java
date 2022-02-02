package com.semicolon.africa.myList;

import java.util.Objects;

public class MyList {
    private int capacity;
    private int size;
    private String[] items;
    private String[] newArray;

    public MyList(int capacity) {
        this.capacity = capacity;
        items = new String[capacity];
    }

    public void add(String item) {
        for (int i = 0; i < items.length; i++) {
            checkCapacityOfArrayToIncreaseLenght();
            if (items[i] == null){
                items[i] = item;
                size++;
                break;
            }
        }
    }

    private void checkCapacityOfArrayToIncreaseLenght() {
        if (capacity <= size){
            String[] arr = items;
            capacity *=2;
            newArray = new String[capacity];
            System.arraycopy(arr, 0, newArray, 0, arr.length);
            items = newArray;
//                System.out.println(Arrays.toString(items));
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

    public void remove(String element) {
        for (int i = 0; i < items.length; i++) {
            int j=0;
            if (items[i] == element || i > j && i != items.length-1){
//                System.out.println("hola "+items[i]);
//                j=i;
//                System.out.println(items[i]);
//               items[i] = null;
                String temp = items[i+1];
                items[i] = temp;


                size--;
            }
//            if ( i > j && i != items.length-1){
//                j=i;
//                String temp = items[i+1];
//                System.out.println(temp);
//                System.out.println("hi "+items[i]);
//
//                items[i] = temp;
//                System.out.println("hi "+items[i]);
//
////                System.out.println(items[i]);
//                System.out.println();
//                System.out.println();
//            }

        }
    }
}


