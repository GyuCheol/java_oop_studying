package academy.pocu.comp2500.assignment2;

public class BlueStamp extends Stamp {

    public BlueStamp(int productId, String text, int width, int height, int price, ShippingMethod shippingMethod) {
        super(productId, text, width, height, price, StampColor.BLUE, shippingMethod);
    }
}
