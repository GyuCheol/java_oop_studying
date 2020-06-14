package academy.pocu.comp2500.lab6;

public class ThreeCourseMeal extends SetMenu {

    public ThreeCourseMeal() {
        super(25, 1, 1, 1);
    }

    public void setMainCourse(MainCourse mainCourse) {
        super.setMainCourseParams(mainCourse);
    }

    public void setAppetizer(Appetizer appetizer) {
        super.setAppetizerParams(appetizer);
    }

    public void setDessert(Dessert dessert) {
        super.setDessertParams(dessert);
    }



}
