package academy.pocu.comp2500.assignment2;

public class TextElement extends Element {

    private String text;

    public TextElement(int elementId, String text, int x, int y) {
        super(elementId, x, y);

        this.text = text;
    }

    public String getText() {
        return this.text;
    }

}
