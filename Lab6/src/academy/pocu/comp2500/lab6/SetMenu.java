package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class SetMenu {

    private int price;
    private int maxAppetizerCount;
    private int maxDessertCount;
    private int maxMainCourseCount;

    protected ArrayList<Dessert> desserts = new ArrayList<>();
    protected ArrayList<Appetizer> appetizers = new ArrayList<>();
    protected ArrayList<MainCourse> mainCourses = new ArrayList<>();

    public SetMenu(int price, int maxAppetizerCount, int maxDessertCount, int maxMainCourseCount) {
        this.price = price;
        this.maxAppetizerCount = maxAppetizerCount;
        this.maxDessertCount = maxDessertCount;
        this.maxMainCourseCount = maxMainCourseCount;
    }

    public int getPrice() {
        return this.price;
    }

    public boolean isValid() {
        return this.desserts.size() == this.maxDessertCount &&
                this.appetizers.size() == this.maxAppetizerCount &&
                this.mainCourses.size() == this.maxMainCourseCount;
    }

    public Dessert getDessert() {
        if (desserts.size() > 0) {
            return desserts.get(0);
        }

        return null;
    }

    public ArrayList<Dessert> getDesserts() {
        return desserts;
    }

    public void setDessert(Dessert dessert) {
        setDesserts(dessert);
    }

    public void setDesserts(Dessert... dessert) {
        desserts.clear();

        for (Dessert d : dessert) {
            desserts.add(d);
        }
    }

    public Appetizer getAppetizer() {
        if (appetizers.size() > 0) {
            return appetizers.get(0);
        }

        return null;
    }

    public ArrayList<Appetizer> getAppetizers() {
        return appetizers;
    }

    public void setAppetizer(Appetizer appetizer) {
        setAppetizers(appetizer);
    }

    public void setAppetizers(Appetizer... appetizer) {
        appetizers.clear();

        for (Appetizer a : appetizer) {
            appetizers.add(a);
        }
    }

    public MainCourse getMainCourse() {
        if (mainCourses.size() > 0) {
            return mainCourses.get(0);
        }

        return null;
    }

    public ArrayList<MainCourse> getMainCourses() {
        return mainCourses;
    }

    public void setMainCourse(MainCourse mainCourse) {
        setMainCourses(mainCourse);
    }

    public void setMainCourses(MainCourse... mainCourse) {
        mainCourses.clear();

        for (MainCourse m : mainCourse) {
            mainCourses.add(m);
        }
    }

}
