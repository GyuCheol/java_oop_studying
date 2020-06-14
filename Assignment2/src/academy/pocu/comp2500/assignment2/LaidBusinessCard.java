package academy.pocu.comp2500.assignment2;

public class LaidBusinessCard extends BusinessCard {

    protected LaidBusinessCard(int productId, int price, Orientation orientation, CardSides cardSides, CardColor cardColor, ShippingMethod shippingMethod) {
        super(productId, price, cardColor.getColor(), orientation, cardSides, PaperType.LAID, shippingMethod);
    }

}
