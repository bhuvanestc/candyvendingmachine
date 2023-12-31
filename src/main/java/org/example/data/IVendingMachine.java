package org.example.data;
import org.example.model.Product;
public interface IVendingMachine {
    int MAX_ITEM=10;
    void addCurrency(int amount);
    int getBalance();
    Product request(int id);
    int endSession();
    String getDescription(int id);
    String getProducts();

}
