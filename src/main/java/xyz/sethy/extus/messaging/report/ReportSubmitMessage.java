package xyz.sethy.extus.messaging.report;

import xyz.sethy.extus.api.cheat.CheatType;

import java.util.UUID;

public class ReportSubmitMessage {
    private final UUID serverId;
    private final UUID playerId;
    private final Integer reportId;
    private final CheatType cheatType;
    private final long time;

    public ReportSubmitMessage(final UUID serverId, final UUID playerId, final Integer reportId, final CheatType cheatType, final long time) {
        this.serverId = serverId;
        this.playerId = playerId;
        this.reportId = reportId;
        this.cheatType = cheatType;
        this.time = time;
    }

    public UUID getServerId() {
        return serverId;
    }

    public UUID getPlayerId() {
        return playerId;
    }

    public Integer getReportId() {
        return reportId;
    }

    public CheatType getCheatType() {
        return cheatType;
    }

    public long getTime() {
        return time;
    }
}
