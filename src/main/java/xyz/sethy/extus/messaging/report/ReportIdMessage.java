package xyz.sethy.extus.messaging.report;

import java.util.UUID;

public class ReportIdMessage {
    private final UUID serverId;

    public ReportIdMessage(final UUID serverId) {
        this.serverId = serverId;
    }

    public UUID getServerId() {
        return serverId;
    }
}
