package org.example.model;

public class Chocolatebar extends Product{


    private ChocolatebarType chocolatebarType;
    public Chocolatebar(int id, double price, String productName, ChocolatebarType chocolatebarType) {
        super(id, price, productName);
        this.chocolatebarType = chocolatebarType;
    }
    @Override
    public String examine(){
        return "This is a " + chocolatebarType + " chocolate bar. Price: sek" + getPrice();
    }
    @Override
    public String use()
    {
        return "Enjoy your " + chocolatebarType + " chocolate bar!";
    }



}
