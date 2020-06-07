package academy.pocu.comp2500.lab5;

public class Barbarian {

    private String name;
    protected int attack;
    protected int defense;
    protected int maxHp;
    protected int hp;

    public Barbarian(String name, int maxHp, int attack, int defense) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.maxHp = maxHp;
        this.hp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void attack(Barbarian barbarian) {
        if (this == barbarian) {
            return;
        }

        double dmg = (this.attack - barbarian.defense) / 2.0;
        int intDmg = Math.max(1, (int) dmg);

        barbarian.damage(intDmg);
    }

    protected void damage(int dmg) {
        this.hp = Math.max(0, this.hp - dmg);
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

}
