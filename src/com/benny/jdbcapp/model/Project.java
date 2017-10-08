package com.benny.jdbcapp.model;

public class Project extends Entity{
    private int company_id;
    private int customer_id;
    private double cost;

    public Project() {
    }

    public Project(int id, String name, int company_id, int customer_id, double cost) {
        super(id, name);
        this.company_id = company_id;
        this.customer_id = customer_id;
        this.cost = cost;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
