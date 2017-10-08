package com.benny.jdbcapp.controller;

import com.benny.jdbcapp.dao.EntityDAO;
import com.benny.jdbcapp.dao.FactoryDAO;
import com.benny.jdbcapp.model.Entity;

import java.sql.SQLException;

public class JDBCController {
    FactoryDAO factory = new FactoryDAO();
    EntityDAO eDAO = new EntityDAO();

    public void setDAO(Entity entity) {
        eDAO = factory.getDAO(entity);
    }

    public void create(Entity entity) throws SQLException, ClassNotFoundException {
        eDAO.connect();
        eDAO.create(entity);
        eDAO.close();
    }

    public void read() throws SQLException, ClassNotFoundException {
        eDAO.connect();
        eDAO.read();
        eDAO.close();
    }

    public void update(Entity entity) throws SQLException, ClassNotFoundException {
        eDAO.connect();
        eDAO.update(entity);
        eDAO.close();
    }

    public void delete(int id) throws SQLException, ClassNotFoundException {
        eDAO.connect();
        eDAO.delete(id);
        eDAO.close();
    }
}
