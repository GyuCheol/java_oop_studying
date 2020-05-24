package academy.pocu.comp2500.assignment1;

public enum ReactionType {

    GREAT(0),
    SAD(1),
    ANGRY(2),
    FUN(3),
    LOVE(4);

    private final int index;

    private ReactionType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }

}
