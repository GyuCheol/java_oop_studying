package academy.pocu.comp2500.assignment2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cart {

    private ArrayList<CartItem> cartItems = new ArrayList<>();

    public int getTotalPrice() {
        int total = 0;

        for (CartItem item : cartItems) {
            total += item.getProduct().getPrice();

        }

        return total;
    }

    public ArrayList<CartItem> getCartItems() {
        return this.cartItems;
    }

    public void addCardItem(CartItem cartItem) {

        if (cartItems.contains(cartItem) == false) {
            cartItems.add(cartItem);
        }
    }

    public void removeCardItem(CartItem cartItem) {

        if (cartItems.contains(cartItem)) {
            cartItems.remove(cartItem);
        }
    }



}
