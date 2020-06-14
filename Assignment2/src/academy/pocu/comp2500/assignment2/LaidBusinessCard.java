package academy.pocu.comp2500.assignment2;

public class LaidBusinessCard extends BusinessCard {

    protected LaidBusinessCard(int productId, int price, Orientation orientation, CardSides cardSides, CardColor cardColor) {
        super(productId, price, cardColor.getRgb(), orientation, cardSides, PaperType.LAID);
    }

}
