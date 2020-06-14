package academy.pocu.comp2500.assignment2;

public class BusinessCard extends HQProduct {

    private CardSides cardSides;
    private PaperType paperType;

    protected BusinessCard(int productId, int price, int rgb, Orientation orientation, CardSides cardSides, PaperType paperType) {
        super(productId, 9, 5, price, rgb, orientation);

        this.cardSides = cardSides;
        this.paperType = paperType;
    }

    public CardSides getSides() {
        return this.cardSides;
    }

    public PaperType getPaperType() {
        return this.paperType;
    }

    public static BusinessCard createBusinessCard(int productId, int price, CardColor cardColor, Orientation orientation, CardSides cardSides, PaperType paperType) {
        return new BusinessCard(productId, price, cardColor.getRgb(), orientation, cardSides, paperType);
    }

}
