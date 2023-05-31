package com.daniilvdovin.SpringTestAPI.controllers;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
    @GetMapping("/")
    public String GetHome(){
        return "Get Home";
    }
    @PostMapping("/")
    public String PostHome(){
        return "Post Home";
    }
    @PutMapping("/")
    public String PutHome(){
        return "Put Home";
    }
    @DeleteMapping("/")
    public String DeleteHome(){
        return "Delete Home";
    }
}
