package academy.pocu.comp2500.assignment2;

public class Product {
    private int productId;
    private int width;
    private int height;
    private ShippingMethod shippingMethod;
    protected int price;
    protected int color;

    protected Product(int productId, int width, int height, int price, int color, ShippingMethod shippingMethod) {
        this.productId = productId;
        this.width = width;
        this.height = height;
        this.price = price;
        this.color = color;
        this.shippingMethod = shippingMethod;
    }

    public int getHeight() {
        return this.height;
    }

    public int getProductId() {
        return this.productId;
    }

    public int getWidth() {
        return this.width;
    }

    public int getPrice() {
        return this.price;
    }

    public int getColor() {
        return this.color;
    }

    public ShippingMethod getShippingMethod() {
        return this.shippingMethod;
    }

    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
}
