package academy.pocu.comp2500.lab5;

import java.util.ArrayList;

public class Gladiator extends Barbarian {

    private ArrayList<Move> moveList = new ArrayList<>();

    public Gladiator(String name, int maxHp, int attack, int defense) {
        super(name, maxHp, attack, defense);
    }

    public boolean addMove(Move move) {

        if (moveList.size() >= 4) {
            return false;
        }

        for (Move tmp : moveList) {
            if (tmp.getName().equals(move.getName())) {
                return false;
            }
        }

        moveList.add(move);
        return true;
    }

    public boolean removeMove(String skillName) {
        for (Move tmp : moveList) {
            if (tmp.getName().equals(skillName)) {
                moveList.remove(tmp);
                return true;
            }
        }

        return false;
    }

    private Move getSkillOrNull(String skillName) {
        for (Move tmp : moveList) {
            if (tmp.getName().equals(skillName)) {
                return tmp;
            }
        }

        return null;
    }

    public void attack(String skillName, Barbarian barbarian) {
        Move skill = getSkillOrNull(skillName);

        if (skill == null || this == barbarian) {
            return;
        }

        double dmg = ((double)this.attack / barbarian.defense * skill.getPower()) / 2.0;
        int intDmg = Math.max(1, (int) dmg);

        barbarian.damage(intDmg);
    }

    public void rest() {
        for (Move move : moveList) {
            move.rest();
        }

        this.hp = Math.min(this.hp + 10, this.maxHp);

    }


}
