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
            cart.addCardItem(cartItem);
            cart.addCardItem(cartItem);
            cart.addCardItem(cartItem);

            cartItem.setShippingMethod(ShippingMethod.PICKUP);

            assert cart.getTotalPrice() == 1000;
            assert cartItem.getShippingMethod() == ShippingMethod.PICKUP;
            assert cart.getCartItems().size() == 1;

            cart.removeCardItem(cartItem);
            assert cart.getCartItems().size() == 0;
            assert cart.getTotalPrice() == 0;

            Banner banner = Banner.createBanner(2, 10, 10, 10, 0xFF0000, Orientation.PORTRAIT);

            CartItem cartItem2 = new CartItem(2, banner, ShippingMethod.SHIP);

            cart.addCardItem(cartItem2);

            assert cart.getTotalPrice() == 10;
            assert banner.getPrice() == 10;

            ImageElement imageElement = new ImageElement(1, "asd", 5, 5);
            banner.addImageElement(imageElement);

            assert cart.getTotalPrice() == 15;
            assert banner.getPrice() == 15;

            banner.addImageElement(imageElement);
            banner.addImageElement(imageElement);

            assert cart.getTotalPrice() == 15;
            assert banner.getPrice() == 15;

            banner.removeImageElement(imageElement);
            banner.removeImageElement(imageElement);

            assert cart.getTotalPrice() == 10;
            assert banner.getPrice() == 10;

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
