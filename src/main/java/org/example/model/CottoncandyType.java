package org.example.model;

public enum CottoncandyType {
    WITH_SPRINKLE(5),
    WITHOUT_SPRINKLE(0);

    private double price;
    CottoncandyType(double price)
    {
        this.price=price;
    }
    public double getPrice()
    {
        return price;
    }

}
