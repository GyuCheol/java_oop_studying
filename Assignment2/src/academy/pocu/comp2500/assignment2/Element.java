package academy.pocu.comp2500.assignment2;

public class Element {

    private int x;
    private int y;
    private int elementId;

    protected Element(int elementId, int x, int y) {
        this.x = x;
        this.y = y;
        this.elementId = elementId;
    }

    public int getElementId() {
        return this.elementId;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
