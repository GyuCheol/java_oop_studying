package academy.pocu.comp2500.assignment2;

public class ImageElement extends Element {

    private String imagePath;

    public ImageElement(int elementId, String imagePath, int x, int y) {
        super(elementId, x, y);

        this.imagePath = imagePath;
    }

    public String getImagePath() {
        return this.imagePath;
    }

}
