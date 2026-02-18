package com.deskmate.dao;

import com.deskmate.report.copy.DailyRevenueRow;
import com.deskmate.report.copy.DeskUtilizationRow;

import java.time.LocalDate;
import java.util.List;

public interface ReportDao {
    DailyRevenueRow dailyRevenue(LocalDate date);
    List<DeskUtilizationRow> deskUtilization(LocalDate date);
}

