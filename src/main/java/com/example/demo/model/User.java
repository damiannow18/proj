package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class User {
    private String login;
    private String password;
    public User(@JsonProperty("login")String login, @JsonProperty("password")String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
