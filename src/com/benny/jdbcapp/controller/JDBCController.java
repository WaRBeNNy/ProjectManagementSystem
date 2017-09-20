package com.benny.jdbcapp.controller;

import com.benny.jdbcapp.dao.CompanyDAO;

import java.sql.SQLException;

public class JDBCController {
    static final String DATABASE_URL = "jdbc:mysql://localhost/my_schema";

    static final String USER = "root";
    static final String PASSWORD = "BeNNySQL007";

    CompanyDAO companyDAO = new CompanyDAO();

    public void readCompany() throws SQLException, ClassNotFoundException {
        companyDAO.connect(DATABASE_URL, USER, PASSWORD);
        companyDAO.read();
        companyDAO.close();
    }
}
