package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class NoHeavyMeal extends SetMenu {

    public NoHeavyMeal() {
        super(15, 1, 2, 0);
    }

    public void setAppetizers(Appetizer appetizer1, Appetizer appetizer2) {
        super.setAppetizerParams(appetizer1, appetizer2);
    }

    public void setDessert(Dessert dessert) {
        super.setDessertParams(dessert);
    }

}
