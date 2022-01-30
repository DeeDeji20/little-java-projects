package com.semicolon.guitarStore;

public class Guitars {
    private String serialNumber;
    private double price;
    private String builder;
    private String model;
    private String type;
    private String backwood;
    private String topwood;

    public Guitars(String serialNumber, double price, String builder, String model, String type, String backwood, String topwood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backwood = backwood;
        this.topwood = topwood;
    }

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

    public String getType() {
        return type;
    }

    public String getBackwood() {
        return backwood;
    }

    public String getTopwood() {
        return topwood;
    }
}
