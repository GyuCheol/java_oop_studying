package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class ApertureProduct extends Product {
    private Orientation orientation;
    private ArrayList<Element> elements = new ArrayList<>();

    protected ApertureProduct(int productId, int width, int height, int color, Orientation orientation, ShippingMethod shippingMethod) {
        super(productId, width, height, color, shippingMethod);

        this.orientation = orientation;
    }

    public void addElement(Element element) {
        if (this.elements.contains(element) == false) {
            this.elements.add(element);
            super.price += 5;
        }
    }

    public void removeElement(Element element) {
        if (this.elements.contains(element)) {
            this.elements.remove(element);
            super.price -= 5;
        }
    }

    public Orientation getOrientation() {
        return this.orientation;
    }


}
