package academy.pocu.comp2500.assignment2;

public class Banner extends HQProduct {

    protected Banner(int productId, int width, int height, int price, int bannerColor, Orientation orientation, ShippingMethod shippingMethod) {
        super(productId, width, height, price, bannerColor, orientation, shippingMethod);
    }

    public static Banner createBanner(int productId, int width, int height, int price, int bannerColor, Orientation orientation, ShippingMethod shippingMethod) {
        return new Banner(productId, width, height, price, bannerColor, orientation, shippingMethod);
    }

}
