package com.benny.jdbcapp.dao;

import com.benny.jdbcapp.model.*;

public class FactoryDAO {
    public EntityDAO getDAO(Object object) {
        EntityDAO eDAO = null;
        if(object instanceof Company)
            eDAO = new CompanyDAO();
        else if(object instanceof Customer)
            eDAO = new CustomerDAO();
        else if(object instanceof Developer)
            eDAO = new DeveloperDAO();
        else if(object instanceof Project)
            eDAO = new ProjectDAO();
        else if(object instanceof Skill)
            eDAO = new SkillDAO();

        return eDAO;
    }
}
