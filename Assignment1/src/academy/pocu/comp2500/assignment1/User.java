package academy.pocu.comp2500.assignment1;

public class User {

    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return this.userId;
    }

    public String getName() {
        return this.name;
    }

}
