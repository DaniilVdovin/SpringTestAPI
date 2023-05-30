package com.daniilvdovin.SpringTestAPI.controllers;

import com.daniilvdovin.SpringTestAPI.models.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @PostMapping("/login")
    public String PostLogin(@RequestBody User user){

        return "Hello "+user.name;
    }
    @PostMapping("/reg")
    public String PostReg(@RequestBody User user){
        return "Hello "+user.name;
    }
}
