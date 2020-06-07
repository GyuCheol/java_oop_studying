package academy.pocu.comp2500.lab5;

public class Pet {

    private String name;
    private int attack;

    public Pet(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public int getAttack() {
        return this.attack;
    }
}
