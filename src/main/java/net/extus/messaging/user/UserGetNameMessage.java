package net.extus.messaging.user;

public class UserGetNameMessage {
    private final String name;

    public UserGetNameMessage(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
