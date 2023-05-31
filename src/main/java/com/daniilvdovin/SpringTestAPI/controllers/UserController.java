package com.daniilvdovin.SpringTestAPI.controllers;

import com.daniilvdovin.SpringTestAPI.models.User;
import com.daniilvdovin.SpringTestAPI.repository.UserRepository;
import com.daniilvdovin.SpringTestAPI.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserService service;
    public UserController(UserService service) {
        this.service = service;
    }
    @GetMapping(path = "/allusers", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<User> GetAllUsers(){
        return this.service.getAll();
    }
}
