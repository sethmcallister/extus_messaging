package xyz.sethy.extus.messaging.alert;


import xyz.sethy.extus.api.cheat.CheatType;

import java.util.UUID;

public class AlertMessage {
    private final UUID serverId;
    private final UUID playerUUID;
    private final CheatType cheatType;
    private final double data;
    private final String stringData;

    public AlertMessage(final UUID serverId, final UUID playerUUID, final CheatType cheatType, final double data, final String stringData) {
        this.serverId = serverId;
        this.playerUUID = playerUUID;
        this.cheatType = cheatType;
        this.data = data;
        this.stringData = stringData;
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

    public double getData() {
        return data;
    }

    public String getStringData() {
        return stringData;
    }
}
