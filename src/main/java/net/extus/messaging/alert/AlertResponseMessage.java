package net.extus.messaging.alert;

import xyz.sethy.extus.api.cheat.CheatType;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public class AlertResponseMessage {
    private final UUID serverId;
    private final UUID playerUUID;
    private final CheatType cheatType;
    private final Boolean violation;

    public AlertResponseMessage(final UUID uuid, final UUID playerUUID, final CheatType cheatType, final Boolean violation) {
        this.serverId = uuid;
        this.playerUUID = playerUUID;
        this.cheatType = cheatType;
        this.violation = violation;
    }

    public UUID getServerId() {
        return serverId;
    }

    public UUID getPlayerUUID() {
        return playerUUID;
    }

    public CheatType getCheatType() {
        return cheatType;
    }

    public Boolean getViolation() {
        return violation;
    }
}
