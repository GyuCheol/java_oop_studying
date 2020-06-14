package academy.pocu.comp2500.lab6;

public class Menu {
    private int price;
    protected boolean isValid = false;

    public Menu(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public boolean isValid() {
        return isValid;
    }

}
