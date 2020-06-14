package academy.pocu.comp2500.assignment2;

public class Product {
    private int productId;
    private int width;
    private int height;
    private String displayName;
    private ShippingMethod shippingMethod;
    protected int price;
    protected int color;

    protected Product(int productId, String displayName, int width, int height, int price, int color, ShippingMethod shippingMethod) {
        this.displayName = displayName;
        this.productId = productId;
        this.width = width;
        this.height = height;
        this.price = price;
        this.color = color;
        this.shippingMethod = shippingMethod;
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

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
}
