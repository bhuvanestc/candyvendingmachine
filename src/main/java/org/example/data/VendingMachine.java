package org.example.data;
import org.example.model.Product;

public class VendingMachine implements IVendingMachine {

    private Product[] products;
    private int depositPool;
    public VendingMachine(Product[] products)
    {
        this.products = products;
        this.depositPool = 0;
    }


    @Override
    public void addCurrency(int amount) {

        if (isValidDenomination(amount)) {
            depositPool += amount;
        } else {
            System.out.println("Invalid denomination. Only accepted denominations are: 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000");
        }
    }
    private boolean isValidDenomination(int amount) {
        int[] validDenominations = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000 };
        for (int denomination : validDenominations) {
            if (denomination == amount) {
                return true;
            }
        }
        return false;
    }
    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                if (depositPool >= product.getPrice())
                {
                    depositPool -= product.getPrice();
                    return product;
                }
                else
                {
                    System.out.println("Insufficient balance to purchase the product.");
                    return null;
                }
            }
        }
        System.out.println("Product not found.");
        return null;
    }

    @Override
    public int endSession() {
        int currentDeposit = depositPool;
        depositPool = 0;
        return currentDeposit;
    }

    @Override
    public String getDescription(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return "Product ID: " + product.getId() +
                        "\nProduct Name: " + product.getProductName() +
                        "\nPrice: $" + product.getPrice();
            }
        }
        return "Product not found.";
    }

    @Override
    public String getProducts() {
        StringBuilder productList = new StringBuilder();
        for (Product product : products) {
            if (product != null) {
                productList.append("Product ID: ").append(product.getId())
                        .append(", Name: ").append(product.getProductName())
                        .append(", Price: $").append(product.getPrice())
                        .append("\n");
            }
        }
        return productList.toString();
    }
}
