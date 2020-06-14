package academy.pocu.comp2500.assignment2;

public enum CardColor {

    GRAY(0xE6E6E6),
    IVORY(0xFFFFF0),
    WHITE(0xFFFFFF);

    private final int color;

    private CardColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return this.color;
    }
}
