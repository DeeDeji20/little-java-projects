package com.semicolon.guitarStore;

public class Guitars {
    private String serialNumber;
    private double price;
    private String builder;
    private String model;
    private String backwood;
    private String topwood;

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public String getBackwood() {
        return backwood;
    }

    public String getTopwood() {
        return topwood;
    }
}
