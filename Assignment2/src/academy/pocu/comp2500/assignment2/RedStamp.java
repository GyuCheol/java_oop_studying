package academy.pocu.comp2500.assignment2;

public class RedStamp extends Stamp {

    protected RedStamp(int productId, String text, int width, int height, int price, ShippingMethod shippingMethod) {
        super(productId, text, width, height, price, StampColor.RED, shippingMethod);
    }
}
