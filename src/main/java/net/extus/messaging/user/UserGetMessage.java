package net.extus.messaging.user;

import java.util.UUID;

public class UserGetMessage {
    private final UUID uuid;

    public UserGetMessage(final UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }
}
