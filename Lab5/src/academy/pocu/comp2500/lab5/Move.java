package academy.pocu.comp2500.lab5;

public class Move {

    private String name;
    private int power;
    private int maxPower;
    private int curPower;

    public Move(String name, int power, int maxPower) {
        this.name = name;
        this.power = power;
        this.maxPower = maxPower;
        this.curPower = this.maxPower;
    }

    public String getName() {
        return this.name;
    }

    public int getPower() {
        return this.power;
    }

    public boolean canUse() {
        return this.curPower > 0;
    }

    public void useMove() {
        if (canUse()) {
            this.curPower -= 1;
        }
    }

    public void rest() {
        this.curPower = Math.min(this.maxPower, this.curPower + 1);
    }

}
