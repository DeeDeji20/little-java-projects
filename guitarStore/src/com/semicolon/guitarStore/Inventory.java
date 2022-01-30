package com.semicolon.guitarStore;

import java.util.ArrayList;

public class Inventory {
    ArrayList <Guitars> guitars = new ArrayList<>();


    public void addGuitar(String serialNo, double price, String builder, String model, String type, String backwood, String topwood) {
        Guitars guitar = new Guitars(serialNo, price, builder, model, type, backwood, topwood);
        guitars.add(guitar);
    }

    public ArrayList<Guitars> getGuitars() {
        return guitars;
    }
}
