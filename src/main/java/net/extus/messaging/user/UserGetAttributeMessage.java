package net.extus.messaging.user;

import java.util.UUID;

public class UserGetAttributeMessage {
    private final UUID apiKey;
    private final String key;
    private final String value;

    public UserGetAttributeMessage(final UUID apiKey, final String key, final String value) {
        this.apiKey = apiKey;
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public UUID getApiKey() {
        return apiKey;
    }
}
