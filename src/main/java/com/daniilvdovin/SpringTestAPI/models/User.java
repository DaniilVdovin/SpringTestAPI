package com.daniilvdovin.SpringTestAPI.models;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

public class User {
    public int ID;
    public String name;

    public User(int i, String s) {
        ID = i;
        name = s;
    }
}
