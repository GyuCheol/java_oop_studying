package academy.pocu.comp2500.assignment2;

public class Product {
    private int productId;
    private int width;
    private int height;
    protected int price;
    protected int color;

    protected Product(int productId, int width, int height, int price, int color) {
        this.productId = productId;
        this.width = width;
        this.height = height;
        this.price = price;
        this.color = color;
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

    public int getColor() {
        return color;
    }
}
