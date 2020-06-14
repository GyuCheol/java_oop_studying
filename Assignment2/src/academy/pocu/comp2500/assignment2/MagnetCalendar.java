package academy.pocu.comp2500.assignment2;

public class MagnetCalendar extends Calendar {

    protected MagnetCalendar(int productId, ShippingMethod shippingMethod) {
        super(productId, 10, 20, 1500, 0xFFFFFF, shippingMethod);
    }
}
