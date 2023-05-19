package entities;

public abstract class UserFactory {
    public abstract User createUser();

    public void doSomething() {
        User user = createUser();
        user.displayInfo();
    }
}
