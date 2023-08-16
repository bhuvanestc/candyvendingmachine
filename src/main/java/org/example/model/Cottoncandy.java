package org.example.model;

public class Cottoncandy extends Product{
    private CottoncandyType cottoncandyType;
    public Cottoncandy(int id, double price, String productName, CottoncandyType cottoncandyType) {
        super(id, price, productName);
        this.cottoncandyType = cottoncandyType;
    }


    @Override
    public String examine(){
        return "This is a " + cottoncandyType + " cottoncandy. Price: sek" + getPrice();
    }
    @Override
    public String use()
    {
        return "Enjoy your " + cottoncandyType + " cottoncandy!";
    }

}
