package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class FreeSoulPizza extends Pizza {

    public FreeSoulPizza() {
        super(25, 2, 1, 2);
    }

    public boolean addTopping(Topping topping) {
        return addToppingAction(topping);
    }

    public boolean removeTopping(Topping topping) {
        return removeToppingAction(topping);
    }

}
