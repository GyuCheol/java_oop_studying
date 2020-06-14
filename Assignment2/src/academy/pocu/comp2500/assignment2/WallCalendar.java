package academy.pocu.comp2500.assignment2;

public class WallCalendar extends Calendar {

    public WallCalendar(int productId, ShippingMethod shippingMethod) {
        super(productId, 40, 40, 1000, 0xFFFFFF, shippingMethod);
    }
}
