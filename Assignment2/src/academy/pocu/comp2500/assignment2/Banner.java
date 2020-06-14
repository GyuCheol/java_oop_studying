package academy.pocu.comp2500.assignment2;

public class Banner extends HQProduct {

    protected Banner(int productId, int width, int height, int price, int rgb, Orientation orientation) {
        super(productId, width, height, price, rgb, orientation);
    }

    public static Banner createBanner(int productId, int width, int height, int price, int rgb, Orientation orientation) {
        return new Banner(productId, width, height, price, rgb, orientation);
    }

}
