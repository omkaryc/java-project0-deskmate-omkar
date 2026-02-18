package com.deskmate.config;




import com.deskmate.controller.DeskController;
import com.deskmate.dao.DeskDao;
//import com.deskmate.dbps.service.*;
import com.deskmate.impl.JdbcDeskDao;
import com.deskmate.service.DeskService;

public class AppConfig {

    public DeskController deskController() {
        DeskDao deskDao = new JdbcDeskDao();
        DeskService deskService = new DeskService(deskDao);
        return new DeskController(deskService);
    }
}

