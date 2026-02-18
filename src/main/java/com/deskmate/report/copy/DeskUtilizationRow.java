package com.deskmate.report.copy;

public class DeskUtilizationRow {
    private final String deskCode;
    private final long paidBookingsCount;

    public DeskUtilizationRow(String deskCode, long paidBookingsCount) {
        this.deskCode = deskCode;
        this.paidBookingsCount = paidBookingsCount;
    }

    public String getDeskCode() { return deskCode; }
    public long getPaidBookingsCount() { return paidBookingsCount; }
}
