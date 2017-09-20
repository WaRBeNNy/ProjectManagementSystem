package com.benny.jdbcapp.dao;

import com.benny.jdbcapp.model.Company;

import java.sql.*;

public class CompanyDAO {
    Company company;
    Connection connection = null;
    Statement statement = null;

    public void connect(String url, String user, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        connection = DriverManager.getConnection(url, user, password);

        statement = connection.createStatement();
    }

    public void create() {
    }

    public void read() throws SQLException {
        String sql;
        sql = "SELECT * FROM developers";

        ResultSet resultSet = statement.executeQuery(sql);

        System.out.println("Retrieving data from database...");
        System.out.println("\nDevelopers:");
        while (resultSet.next()) {
            company = new Company(resultSet.getInt("dev_id"), resultSet.getString("name"));

            System.out.println("\n================\n");
            System.out.println("id: " + company.getId());
            System.out.println("Name: " + company.getName());
        }
        resultSet.close();
    }

    public void update() {
    }

    public void delete(Company company) {
    }

    public void close() throws SQLException {
        statement.close();
        connection.close();
    }
}
