package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class MeatLoverPizza extends Pizza {

    public MeatLoverPizza() {
        super(21, 0, 0, 1);
        this.toppings.add(Topping.BACON);
        this.toppings.add(Topping.PEPERONI);
        this.toppings.add(Topping.HAM);
        this.toppings.add(Topping.SAUSAGES);
        this.toppings.add(Topping.CHEDDAR_CHEESE);
    }

    public boolean addBlackOlives() {
        return addTopping(Topping.BLACK_OLIVES);
    }

    public boolean removeBlackOlives() {
        return removeTopping(Topping.BLACK_OLIVES);
    }

    public boolean addRedOnions() {
        return addTopping(Topping.RED_ONIONS);
    }

    public boolean removeRedOnions() {
        return removeTopping(Topping.RED_ONIONS);
    }

    public boolean addGreenPeppers() {
        return addTopping(Topping.GREEN_PEPPERS);
    }

    public boolean removeGreenPeppers() {
        return removeTopping(Topping.GREEN_PEPPERS);
    }


}
