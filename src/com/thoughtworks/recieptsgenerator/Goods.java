package com.thoughtworks.recieptsgenerator;

public class Goods {
    private String nameOfItem;
    private double pricePerUnit;

    public Goods(String nameOfItem, double pricePerUnit) {
        this.nameOfItem = nameOfItem;
        this.pricePerUnit = pricePerUnit;
    }

    public double salesTax() {
        if (nameOfItem.equals("book")) {
            return 0.0;
        }
        else
            return pricePerUnit * 10 / 100.0;
    }
}
