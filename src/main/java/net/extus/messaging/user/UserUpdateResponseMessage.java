package net.extus.messaging.user;

import net.extus.api.user.User;

import java.util.UUID;

public class UserUpdateResponseMessage {
    private final UUID apiKey;
    private final UUID userId;
    private final User user;

    public UserUpdateResponseMessage(final UUID apiKey, final UUID userId, final User user) {
        this.apiKey = apiKey;
        this.userId = userId;
        this.user = user;
    }

    public UUID getUserId() {
        return userId;
    }

    public User getUser() {
        return user;
    }

    public UUID getApiKey() {
        return apiKey;
    }
}
