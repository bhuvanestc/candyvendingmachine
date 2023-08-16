package org.example.model;

public class Dairymilk extends Product{
    private String dairymilk;
    public Dairymilk(String productName, double price, String dairymilk) {
        super(productName, price);
        this.dairymilk = dairymilk;
    }
    public String getDairymilk() {
        return dairymilk;
    }

    public void setDairymilk(String dairymilk) {
        this.dairymilk = dairymilk;
    }



}
