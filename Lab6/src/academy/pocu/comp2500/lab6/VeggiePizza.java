package academy.pocu.comp2500.lab6;

public class VeggiePizza extends Pizza {

    public VeggiePizza() {
        super(17, 0, 2, 0);
        this.toppings.add(Topping.BLACK_OLIVES);
        this.toppings.add(Topping.RED_ONIONS);
        this.toppings.add(Topping.GREEN_PEPPERS);
    }

    public boolean addMozzarellaCheese() {
        return addToppingAction(Topping.MOZZARELLA_CHEESE);
    }

    public boolean removeMozzarellaCheese() {
        return removeToppingAction(Topping.MOZZARELLA_CHEESE);
    }

    public boolean addCheddarCheese() {
        return addToppingAction(Topping.CHEDDAR_CHEESE);
    }

    public boolean removeCheddarCheese() {
        return removeToppingAction(Topping.CHEDDAR_CHEESE);
    }

    public boolean addFetaCheese() {
        return addToppingAction(Topping.FETA_CHEESE);
    }

    public boolean removeFetaCheese() {
        return removeToppingAction(Topping.FETA_CHEESE);
    }

}
