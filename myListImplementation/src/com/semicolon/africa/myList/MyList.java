package com.semicolon.africa.myList;

import java.util.Arrays;
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
            if (items[i] == element){
                items[i] = items[i+1];
                for (int k = i; k < items.length-1; k++) {
                    items[k] = items[k+1];
                }
                System.out.println(Arrays.toString(items));
                size--;
            }
        }
    }

    public String getElement(String element) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(element))return items[i];

        }
        return null;
    }

    public String getElement(int index) {
        for (int i = 0; i < items.length; i++) {
            if (i == index) return items[i];
        }
        return null;
    }

    public void add(int index, String item) {
        for (int i = 0; i < items.length; i++) {
            if (i == index){
                String temp = items[i];
                String temp2 = items[i + 1];
                for (int j = i; j < items.length-1; j++) {
                    items[j] = item;
                    items[j+1] = temp;
                }
//                items[i] = item;
                size++;
            }
        }
    }
}



