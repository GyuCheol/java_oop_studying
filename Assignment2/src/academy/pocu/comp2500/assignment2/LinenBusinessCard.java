package academy.pocu.comp2500.assignment2;

public class LinenBusinessCard extends BusinessCard {

    protected LinenBusinessCard(int productId, int price, Orientation orientation, CardSides cardSides, CardColor cardColor, ShippingMethod shippingMethod) {
        super(productId, price, cardColor.getColor(), orientation, cardSides, PaperType.LINEN, shippingMethod);
    }

}
