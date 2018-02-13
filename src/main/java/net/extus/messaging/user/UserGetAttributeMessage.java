package net.extus.messaging.user;

public class UserGetAttributeMessage {
    private final String key;
    private final String value;

    public UserGetAttributeMessage(final String key, final String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
