package net.extus.messaging.user;

import net.extus.api.user.User;
import java.util.UUID;

public class UserUpdateMessage {
    private final UUID apiKey;
    private final UUID uuid;
    private final User user;

    public UserUpdateMessage(final UUID apiKey, final UUID uuid, final User user) {
        this.apiKey = apiKey;
        this.uuid = uuid;
        this.user = user;
    }

    public UUID getUuid() {
        return uuid;
    }

    public User getUser() {
        return user;
    }

    public UUID getApiKey() {
        return apiKey;
    }
}
