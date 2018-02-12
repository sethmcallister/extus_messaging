package net.extus.messaging.user;

import net.extus.api.user.User;

import java.util.UUID;

public class UserGetResponseMessage {
    private final UUID uuid;
    private final User user;

    public UserGetResponseMessage(final UUID uuid, final User user) {
        this.uuid = uuid;
        this.user = user;
    }

    public UUID getUuid() {
        return uuid;
    }

    public User getUser() {
        return user;
    }
}
