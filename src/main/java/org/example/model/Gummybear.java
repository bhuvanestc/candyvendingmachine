package org.example.model;

public class Gummybear extends Product{
    private String gummybear;
    public Gummybear(String productName, double price, String gummybear) {
        super(productName, price);
        this.gummybear = gummybear;

    }
    public String getGummybear() {
        return gummybear;
    }

    public void setGummybear(String gummybear) {
        this.gummybear = gummybear;
    }


}
