package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Cart {

    private ArrayList<CartItem> cartItems = new ArrayList<>();

    public int getTotalPrice() {
        int total = 0;

        for (CartItem item : cartItems) {
            total += item.getProduct().getPrice();

        }

        return 0;
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
