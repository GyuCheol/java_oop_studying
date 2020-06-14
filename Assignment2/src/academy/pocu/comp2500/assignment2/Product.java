package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class Product {
    private int productId;
    private int width;
    private int height;
    private ShippingMethod shippingMethod;
    private Orientation orientation;
    private ArrayList<ImageElement> imageElements = new ArrayList<>();
    private ArrayList<TextElement> textElements = new ArrayList<>();

    protected int price = 0;
    protected int color;

    protected Product(int productId, int width, int height, int color, ShippingMethod shippingMethod) {
        this(productId, width, height, color, null, shippingMethod);
    }

    protected Product(int productId, int width, int height, int color, Orientation orientation, ShippingMethod shippingMethod) {
        this.productId = productId;
        this.width = width;
        this.height = height;
        this.color = color;
        this.orientation = orientation;
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

    public void setPrice(int price) {
        this.price = price;
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


    public Orientation getOrientation() {
        return this.orientation;
    }

    public void addImageElement(ImageElement imageElement) {
        if (this.imageElements.contains(imageElement) == false) {
            this.imageElements.add(imageElement);
            this.price += 5;
        }
    }

    public void addTextElement(TextElement textElement) {
        if (this.textElements.contains(textElement) == false) {
            this.textElements.add(textElement);
            this.price += 5;
        }
    }

    public void removeImageElement(ImageElement imageElement) {
        if (this.imageElements.contains(imageElement)) {
            this.imageElements.remove(imageElement);
            this.price -= 5;
        }
    }

    public void removeTextElement(TextElement textElement) {
        if (this.textElements.contains(textElement)) {
            this.textElements.remove(textElement);
            this.price -= 5;
        }
    }
}
