package com.benny.jdbcapp.model;

public class Skill extends Entity{
   private int developer_id;

    public Skill() {
    }

    public Skill(int id, String name, int developer_id) {
        super(id, name);
        this.developer_id = developer_id;
    }

    public int getDeveloper_id() {
        return developer_id;
    }

    public void setDeveloper_id(int developer_id) {
        this.developer_id = developer_id;
    }
}

