package xyz.sethy.extus.messaging.report;

import java.util.UUID;

public class ReportIdResponseMessage {
    private final UUID serverId;
    private final Integer reportId;

    public ReportIdResponseMessage(final UUID serverId, final Integer reportId) {
        this.serverId = serverId;
        this.reportId = reportId;
    }

    public UUID getServerId() {
        return serverId;
    }

    public Integer getReportId() {
        return reportId;
    }
}
