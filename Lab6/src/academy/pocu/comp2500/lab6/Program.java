package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        {
            MeatLoverPizza meatLoverPizza = new MeatLoverPizza();
            boolean isAdded = meatLoverPizza.addGreenPeppers(); // true
            boolean isRemoved = meatLoverPizza.removeGreenPeppers(); // true
            isAdded = meatLoverPizza.addRedOnions(); // true
            boolean isValid = meatLoverPizza.isValid(); // true
            int price = meatLoverPizza.getPrice(); // 21
            ArrayList<Topping> toppings = meatLoverPizza.getToppings();

            DeathByDesserts deathByDesserts = new DeathByDesserts();
            deathByDesserts.setDesserts(Dessert.GREEN_TEA_ICE_CREAM, Dessert.ITALIAN_DONUTS, Dessert.MANGO_PUDDING, Dessert.CHOCOLATE_MOUSSE);
            deathByDesserts.isValid(); // true
        }

        {
            NoHeavyMeal noHeavyMeal = new NoHeavyMeal();

            assert (!noHeavyMeal.isValid());

            noHeavyMeal.setAppetizers(Appetizer.CALAMARI, Appetizer.GYOZA);

            assert (!noHeavyMeal.isValid());

            noHeavyMeal.setDessert(Dessert.APPLE_PIE);

            assert (noHeavyMeal.isValid());
        }

        {
            DeathByDesserts deathByDesserts = new DeathByDesserts();

            assert (!deathByDesserts.isValid());

            deathByDesserts.setDesserts(Dessert.GREEN_TEA_ICE_CREAM, Dessert.ITALIAN_DONUTS, Dessert.MANGO_PUDDING, Dessert.CHOCOLATE_MOUSSE);

            assert (deathByDesserts.isValid());
        }

        {
            ThreeCourseMeal threeCourseMeal = new ThreeCourseMeal();

            assert (!threeCourseMeal.isValid());

            threeCourseMeal.setAppetizer(Appetizer.GYOZA);
            threeCourseMeal.setDessert(Dessert.CHOCOLATE_MOUSSE);

            assert (!threeCourseMeal.isValid());

            threeCourseMeal.setMainCourse(MainCourse.BOMBAY_BUTTER_CHICKEN);

            assert (threeCourseMeal.isValid());
        }

        {
            HousePizza housePizza = new HousePizza();

            assert (!housePizza.isValid());
            assert (housePizza.addBacon());
            assert (!housePizza.isValid());
            assert (housePizza.addPeperoni());
            assert (housePizza.isValid());
            assert (!housePizza.addSausages());
            assert (housePizza.isValid());
            assert (!housePizza.removeSausages());
            assert (housePizza.removeBacon());
            assert (!housePizza.isValid());
            assert (housePizza.addPeperoni());
            assert (housePizza.isValid());
        }

        {
            MeatLoverPizza meatLoverPizza = new MeatLoverPizza();

            assert (!meatLoverPizza.isValid());
            assert (meatLoverPizza.addGreenPeppers());
            assert (!meatLoverPizza.addGreenPeppers());
            assert (meatLoverPizza.isValid());
            assert (meatLoverPizza.removeGreenPeppers());
            assert (!meatLoverPizza.isValid());
        }

        {
            VeggiePizza veggiePizza = new VeggiePizza();

            assert (!veggiePizza.isValid());
            assert (veggiePizza.addCheddarCheese());
            assert (!veggiePizza.isValid());
            assert (veggiePizza.addFetaCheese());
            assert (veggiePizza.isValid());
            assert (veggiePizza.removeCheddarCheese());
            assert (!veggiePizza.isValid());
            assert (veggiePizza.addMozzarellaCheese());
            assert (veggiePizza.isValid());
        }

        {
            FreeSoulPizza freeSoulPizza = new FreeSoulPizza();

            assert (!freeSoulPizza.isValid());
            assert (freeSoulPizza.addToppingAction(Topping.FETA_CHEESE));
            assert (!freeSoulPizza.addToppingAction(Topping.CHEDDAR_CHEESE));
            assert (freeSoulPizza.addToppingAction(Topping.BLACK_OLIVES));
            assert (freeSoulPizza.addToppingAction(Topping.RED_ONIONS));
            assert (!freeSoulPizza.isValid());
            assert (!freeSoulPizza.addToppingAction(Topping.GREEN_PEPPERS));
            assert (!freeSoulPizza.removeToppingAction(Topping.GREEN_PEPPERS));
            assert (!freeSoulPizza.isValid());
            assert (freeSoulPizza.addToppingAction(Topping.CHICKEN));
            assert (freeSoulPizza.addToppingAction(Topping.SAUSAGES));
            assert (freeSoulPizza.isValid());
            assert (!freeSoulPizza.addToppingAction(Topping.PEPERONI));
        }


    }
}
