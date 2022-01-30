package com.semicolon.guitarStore;

import java.util.ArrayList;

public class Inventory {
    ArrayList <Guitar> guitars = new ArrayList<>();


    public void addGuitar(String serialNo, double price, String builder, String model, String type, String backwood, String topwood) {
        Guitar guitar = new Guitar(serialNo, price, builder, model, type, backwood, topwood);
        guitars.add(guitar);
    }

    public ArrayList<Guitar> getGuitars() {
        return guitars;
    }

    public Guitar getGuitar(String serialNo) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNo)) return guitar;
        }
        return null;
    }
}
