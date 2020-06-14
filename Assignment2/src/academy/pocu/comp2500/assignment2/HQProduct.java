package academy.pocu.comp2500.assignment2;

import java.util.ArrayList;

public class HQProduct extends Product {

    private Orientation orientation;
    private ArrayList<ImageElement> imageElements = new ArrayList<>();
    private ArrayList<TextElement> textElements = new ArrayList<>();

    protected HQProduct(int productId, int width, int height, int price, int color, Orientation orientation) {
        super(productId, width, height, price, color);

        this.orientation = orientation;
    }

    public Orientation getOrientation() {
        return this.orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public void addImageElement(ImageElement imageElement) {
        if (this.imageElements.contains(imageElement) == false) {
            this.imageElements.add(imageElement);
            super.price += 5;
        }
    }

    public void addTextElement(TextElement textElement) {
        if (this.textElements.contains(textElement) == false) {
            this.textElements.add(textElement);
            super.price += 5;
        }
    }

    public void removeImageElement(ImageElement imageElement) {
        if (this.imageElements.contains(imageElement)) {
            this.imageElements.remove(imageElement);
            super.price -= 5;
        }
    }

    public void removeTextElement(TextElement textElement) {
        if (this.textElements.contains(textElement)) {
            this.textElements.remove(textElement);
            super.price -= 5;
        }
    }

}
