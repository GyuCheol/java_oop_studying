package academy.pocu.comp2500.assignment2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> products = new ArrayList<>();

    public int getTotalPrice() {
        int total = 0;

        for (Product item : products) {
            total += item.getPrice();

        }

        return total;
    }

    public ArrayList<Product> getCartItems() {
        return this.products;
    }

    public void addCartItem(Product product) {

        if (products.contains(product) == false) {
            products.add(product);
        }
    }

    public void removeCartItem(Product product) {

        if (products.contains(product)) {
            products.remove(product);
        }
    }



}
