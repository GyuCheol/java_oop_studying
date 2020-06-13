package academy.pocu.comp2500.assignment2;

public enum StampColor {
    RED(0x0000FF),
    BLUE(0xFF0000),
    GREEN(0x00FF00);

    private final int rgb;

    private StampColor(int rgb) {
        this.rgb = rgb;
    }

    public int getRgb() {
        return this.rgb;
    }

}
