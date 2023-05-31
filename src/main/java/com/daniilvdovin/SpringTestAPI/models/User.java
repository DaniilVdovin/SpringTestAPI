package com.daniilvdovin.SpringTestAPI.models;

public class User {
    public int ID;
    public String Login;
    public String Username;
    public String Password;
    public User(String login, String username, String password) {
        Login = login;
        Username = username;
        Password = password;
    }
    public User(String Login, String Password) {
        this(Login,Login,Password);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
