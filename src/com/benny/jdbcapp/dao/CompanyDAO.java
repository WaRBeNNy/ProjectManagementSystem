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

    public void create(int id, String name) throws SQLException {
        String sql = "INSERT INTO `my_schema`.`companies` VALUES ('" + id + "', '" + name + "')";

        statement.execute(sql);
        System.out.println("Company " + name + " added to database.");
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

    public void update(int id, String name) throws SQLException {
        String sql = "UPDATE `my_schema`.`companies` SET `name`='" + name + "' WHERE `comp_id`='" + id + "'";

        statement.execute(sql);
        System.out.println("Company " + name + " has been updated");
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM `my_schema`.`companies` WHERE `comp_id`='" + id + "';";

        statement.execute(sql);
        System.out.println("Company with id=" + id + " has been deleted.");
    }

    public void close() throws SQLException {
        statement.close();
        connection.close();
    }
}
