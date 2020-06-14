package academy.pocu.comp2500.lab6;

public class HousePizza extends Pizza {

    public HousePizza() {
        super(20, 2, 0, 0);
        this.toppings.add(Topping.BLACK_OLIVES);
        this.toppings.add(Topping.RED_ONIONS);
        this.toppings.add(Topping.GREEN_PEPPERS);
        this.toppings.add(Topping.MOZZARELLA_CHEESE);
    }

    public boolean addBacon() {
        return addToppingAction(Topping.BACON);
    }

    public boolean removeBacon() {
        return removeToppingAction(Topping.BACON);
    }

    public boolean addPeperoni() {
        return addToppingAction(Topping.PEPERONI);
    }

    public boolean removePeperoni() {
        return removeToppingAction(Topping.PEPERONI);
    }

    public boolean addSausages() {
        return addToppingAction(Topping.SAUSAGES);
    }

    public boolean removeSausages() {
        return removeToppingAction(Topping.SAUSAGES);
    }


}
