package org.example.model;

public enum GummybearType {
    WITH_OUT_SUGARCOAT(0),
    WITH_SUGARCOAT(5);
    private double price;
    GummybearType(double price){
        this.price=price;
    }
    public double getPrice()
    {
        return price;
    }

}
