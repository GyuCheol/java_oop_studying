package academy.pocu.comp2500.lab5;

public class Knight extends Gladiator {

    protected Pet pet;

    public Knight(String name, int maxHp, int attack, int defense) {
        super(name, maxHp, attack, defense);
    }

    public void setPet(Pet petOrNUll) {
        this.pet = petOrNUll;
    }

    public void attackTogether(Barbarian barbarian) {

        if (this.pet == null) {
            return;
        }

        double dmg = (double)(this.attack + pet.getAttack() - barbarian.defense) / 2.0;
        int intDmg = Math.max(1, (int)dmg);

        barbarian.damage(intDmg);

    }

}
