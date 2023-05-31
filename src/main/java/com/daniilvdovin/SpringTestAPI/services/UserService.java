package com.daniilvdovin.SpringTestAPI.services;

import com.daniilvdovin.SpringTestAPI.models.User;
import com.daniilvdovin.SpringTestAPI.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository repository;
    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    public List<User> getAll() {
        return this.repository.getAll();
    }
    public User getByLogin(String login) {
        return this.repository.getByLogin(login);
    }
}
