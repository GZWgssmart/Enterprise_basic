package com.gs.bean;

/**
 * Created by Wang Genshen on 2017-07-17.
 */
public class Admin {
    private String id;
    private String name;
    private String password; //管理员密码

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
