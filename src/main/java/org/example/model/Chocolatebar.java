package org.example.model;

public class Chocolatebar extends Product{


    private ChocolatebarType chocolatebarType;
    private String productName;

    public Chocolatebar(int id, double price,String productName,ChocolatebarType chocolatebarType) {
        super(id, (price+chocolatebarType.getPrice()),productName);
        this.productName=productName;
        this.chocolatebarType = chocolatebarType;
    }
    @Override
    public String examine(){

        return "This is a " + chocolatebarType + " chocolate bar. Price: sek" + getPrice();
    }
    @Override
    public String use()
    {
        return "Enjoy your "+productName +" "+ chocolatebarType + " chocolate bar!";
    }



}
