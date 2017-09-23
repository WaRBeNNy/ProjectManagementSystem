package com.benny.jdbcapp.view;

import com.benny.jdbcapp.controller.JDBCController;

import java.sql.SQLException;

public class JDBCView {
    JDBCController controller = new JDBCController();

    public void start() throws SQLException, ClassNotFoundException {

        //controller.createCompany(7, "Samsung");
        //controller.readCompany();
        //controller.updateCompany(7, "Samsung Korea");
        controller.deleteCompany(7);
    }
}
