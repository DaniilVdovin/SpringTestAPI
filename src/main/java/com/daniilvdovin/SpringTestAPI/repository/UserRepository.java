package com.daniilvdovin.SpringTestAPI.repository;

import com.daniilvdovin.SpringTestAPI.models.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users;
    public UserRepository() {
        this.users = List.of(
                new User("anton", "1234"),
                new User("ivan", "12345"));
    }

    public User getByLogin(String login) {
        return this.users.stream()
                .filter(user -> login.equals(user.getLogin()))
                .findFirst()
                .orElse(null);
    }

    public List<User> getAll() {
        return this.users;
    }
}
