package academy.pocu.comp2500.lab6;

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
        return addToppingAction(Topping.BLACK_OLIVES);
    }

    public boolean removeBlackOlives() {
        return removeToppingAction(Topping.BLACK_OLIVES);
    }

    public boolean addRedOnions() {
        return addToppingAction(Topping.RED_ONIONS);
    }

    public boolean removeRedOnions() {
        return removeToppingAction(Topping.RED_ONIONS);
    }

    public boolean addGreenPeppers() {
        return addToppingAction(Topping.GREEN_PEPPERS);
    }

    public boolean removeGreenPeppers() {
        return removeToppingAction(Topping.GREEN_PEPPERS);
    }


}
