package academy.pocu.comp2500.assignment2;

public class GreenStamp extends Stamp {

    protected GreenStamp(int productId, String text, int width, int height, int price, ShippingMethod shippingMethod) {
        super(productId, text, width, height, price, StampColor.GREEN, shippingMethod);
    }
}
