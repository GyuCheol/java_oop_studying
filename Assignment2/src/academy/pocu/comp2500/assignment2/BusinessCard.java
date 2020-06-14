package academy.pocu.comp2500.assignment2;

public class BusinessCard extends HQProduct {

    private CardSides cardSides;
    private PaperType paperType;

    public BusinessCard(int productId, int price, int color, Orientation orientation, CardSides cardSides, PaperType paperType, ShippingMethod shippingMethod) {
        super(productId, 9, 5, price, color, orientation, shippingMethod);

        this.cardSides = cardSides;
        this.paperType = paperType;
    }

    public CardSides getSides() {
        return this.cardSides;
    }

    public PaperType getPaperType() {
        return this.paperType;
    }


}
