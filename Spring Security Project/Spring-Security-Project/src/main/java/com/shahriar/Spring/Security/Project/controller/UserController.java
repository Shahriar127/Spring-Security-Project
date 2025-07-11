package com.shahriar.Spring.Security.Project.controller;

import com.shahriar.Spring.Security.Project.model.User;

import com.shahriar.Spring.Security.Project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("register")
    public User register(@RequestBody User user) {
        return userService.saveUser(user);
    }
}