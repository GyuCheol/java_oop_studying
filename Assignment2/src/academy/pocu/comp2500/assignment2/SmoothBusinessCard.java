package academy.pocu.comp2500.assignment2;

public class SmoothBusinessCard extends BusinessCard {

    protected SmoothBusinessCard(int productId, int price, Orientation orientation, CardSides cardSides, CardColor cardColor) {
        super(productId, price, cardColor.getRgb(), orientation, cardSides, PaperType.SMOOTH);
    }

}
