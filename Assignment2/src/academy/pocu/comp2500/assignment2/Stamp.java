package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {

    private String text;

    public Stamp(int productId, String text, int width, int height, int price, StampColor stampColor, ShippingMethod shippingMethod) {
        super(productId, width, height, price, stampColor.getColor(), shippingMethod);

        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
