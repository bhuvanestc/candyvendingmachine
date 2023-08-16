package org.example.model;

public enum ChocolatebarType {
    WITHOUT_ALMONDS(0),
    WITH_ALMONDS(5),
    WITH_MARSHMALLOW(10);

    private double price;
    ChocolatebarType(double price)
    {
        this.price =price;
    }
    public double getPrice()
    {
        return price;
    }



}
