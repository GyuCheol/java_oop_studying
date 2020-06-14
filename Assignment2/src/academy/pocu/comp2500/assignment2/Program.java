package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.registry.Registry;


public class Program {

    public static void main(String[] args) {
        Registry registry = new Registry();

        App app = new App(registry);
        registry.validate();


        // Task #1
        {
            RedStamp redStamp = new RedStamp(1, "hello", 4, 3, 1000);

            assert redStamp.getColor() == 0xFF0000;
            assert redStamp.getPrice() == 1000;
        }

        // Task #2
        {
            Cart cart = new Cart();
            RedStamp redStamp = new RedStamp(1, "hello", 4, 3, 1000);
            CartItem cartItem = new CartItem(1, redStamp, ShippingMethod.SHIP);

            cart.addCardItem(cartItem);

            cartItem.setShippingMethod(ShippingMethod.PICKUP);

            assert cartItem.getShippingMethod() == ShippingMethod.PICKUP;
        }

        // Task #3
        {
            WallCalendar wallCalendar = new WallCalendar(1);

            assert wallCalendar.getPrice() == 1000;
            assert wallCalendar.getWidth() == 40 && wallCalendar.getHeight() == 40;
            assert wallCalendar.getColor() == 0xFFFFFF;
        }





    }

}
