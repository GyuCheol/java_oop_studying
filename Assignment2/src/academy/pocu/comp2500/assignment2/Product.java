package academy.pocu.comp2500.assignment2;

public class Product {
    private int productId;
    private int width;
    private int height;
    private int price;
    private int rgb;
    private Orientation orientation;

    public Product(int productId, int width, int height, int price, int rgb, Orientation orientation) {
        this.productId = productId;
        this.width = width;
        this.height = height;
        this.price = price;
        this.rgb = rgb;
        this.orientation = orientation;
    }

}
