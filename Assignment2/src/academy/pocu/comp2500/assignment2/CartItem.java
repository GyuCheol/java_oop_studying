package academy.pocu.comp2500.assignment2;

public class CartItem {

    private int id;
    private Product product;
    private ShippingMethod shippingMethod;

    public CartItem(int id, Product product, ShippingMethod shippingMethod) {
        this.id = id;
        this.product = product;
        this.shippingMethod = shippingMethod;
    }

    public Product getProduct() {
        return this.product;
    }

    public ShippingMethod getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(ShippingMethod shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public int getId() {
        return id;
    }
}
