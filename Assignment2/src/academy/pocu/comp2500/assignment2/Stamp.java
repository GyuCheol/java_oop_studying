package academy.pocu.comp2500.assignment2;

public class Stamp extends Product {

    private String text;

    protected Stamp(int productId, String text, int width, int height, int price, StampColor stampColor) {
        super(productId, width, height, price, stampColor.getRgb());

        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
