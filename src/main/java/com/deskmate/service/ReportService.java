package com.deskmate.service;

import com.deskmate.dao.ReportDao;
import com.deskmate.report.copy.DailyRevenueRow;
import com.deskmate.report.copy.DeskUtilizationRow;

import java.time.LocalDate;
import java.util.List;

public class ReportService {
    private final ReportDao reportDao;

    public ReportService(ReportDao reportDao) {
        this.reportDao = reportDao;
    }

    public DailyRevenueRow dailyRevenue(LocalDate date) {
        return reportDao.dailyRevenue(date);
    }

    public List<DeskUtilizationRow> deskUtilization(LocalDate date) {
        return reportDao.deskUtilization(date);
    }
}

