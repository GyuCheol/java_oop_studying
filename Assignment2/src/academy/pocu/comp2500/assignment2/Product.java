package academy.pocu.comp2500.assignment2;

public class Product {
    private int productId;
    private int width;
    private int height;
    protected int price;
    protected int rgb;

    protected Product(int productId, int width, int height, int price, int rgb) {
        this.productId = productId;
        this.width = width;
        this.height = height;
        this.price = price;
        this.rgb = rgb;
    }

    public int getHeight() {
        return height;
    }

    public int getProductId() {
        return productId;
    }

    public int getWidth() {
        return width;
    }

    public int getPrice() {
        return price;
    }

    public int getRgb() {
        return rgb;
    }
}
