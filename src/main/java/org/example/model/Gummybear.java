package org.example.model;

public class Gummybear extends Product{
    private GummybearType gummybearType;
    public Gummybear(int id, double price, String productName, GummybearType gummybearType) {
        super(id, price, productName);
        this.gummybearType = gummybearType;
    }
    @Override
    public String examine(){
        return "This is a " + gummybearType + " gummybear. Price: sek" + getPrice();
    }
    @Override
    public String use()
    {
        return "Enjoy your " + gummybearType + " gummybear!";
    }







}
