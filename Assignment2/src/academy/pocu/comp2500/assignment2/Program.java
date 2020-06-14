package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.registry.Registry;


public class Program {

    public static void main(String[] args) {
        Registry registry = new Registry();

        App app = new App(registry);
        registry.validate();


        // Task #1
        {
            Stamp redStamp = new Stamp(1, "Red", "hello", 4, 3, 1000, StampColor.RED, ShippingMethod.SHIP);

            assert redStamp.getColor() == 0xFF0000;
            assert redStamp.getPrice() == 1000;
        }

        // Task #2
        {
            Cart cart = new Cart();
            Stamp redStamp = new Stamp(1, "RED","hello", 4, 3, 1000, StampColor.RED, ShippingMethod.SHIP);
            cart.addCartItem(redStamp);
            cart.addCartItem(redStamp);
            cart.addCartItem(redStamp);
            cart.addCartItem(redStamp);

            redStamp.setShippingMethod(ShippingMethod.PICKUP);

            assert cart.getTotalPrice() == 1000;
            assert redStamp.getShippingMethod() == ShippingMethod.PICKUP;
            assert cart.getCartItems().size() == 1;

            cart.removeCartItem(redStamp);
            assert cart.getCartItems().size() == 0;
            assert cart.getTotalPrice() == 0;

            Banner banner = new Banner(2, "Banner",10, 10, 10, 0xFF0000, Orientation.PORTRAIT, ShippingMethod.SHIP);

            cart.addCartItem(banner);

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
            Calendar wallCalendar = new Calendar(1, "Wall", 40, 40, 1000, 0xFFFFFF, ShippingMethod.SHIP);

            assert wallCalendar.getPrice() == 1000;
            assert wallCalendar.getWidth() == 40 && wallCalendar.getHeight() == 40;
            assert wallCalendar.getColor() == 0xFFFFFF;
        }





    }

}
