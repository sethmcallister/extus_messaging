package net.extus.messaging.user;

import java.util.UUID;

public class UserGetMessage {
    private final UUID apiKey;
    private final UUID uuid;

    public UserGetMessage(final UUID apiKey, final UUID uuid) {
        this.apiKey = apiKey;
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public UUID getApiKey() {
        return apiKey;
    }
}
