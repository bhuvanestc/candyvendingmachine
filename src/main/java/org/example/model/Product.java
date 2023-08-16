package org.example.model;

public abstract class Product {
    private String id;
    private double price;
    private String productName;
    public Product (String productName, double price)
    {
        this.productName= productName;
        this.price=price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }






}
