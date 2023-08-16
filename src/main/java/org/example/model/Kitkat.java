package org.example.model;

public class Kitkat extends Product{
    private String kitkat;
    public Kitkat(String productName, double price, String kitkat) {
        super(productName, price);
        this.kitkat = kitkat;
    }

    public String getKitkat() {
        return kitkat;
    }

    public void setKitkat(String kitkat) {
        this.kitkat = kitkat;
    }



}
