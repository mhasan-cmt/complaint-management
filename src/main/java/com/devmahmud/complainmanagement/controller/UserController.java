package com.devmahmud.complainmanagement.controller;

import com.devmahmud.complainmanagement.entity.User;
import com.devmahmud.complainmanagement.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/add")
    public Boolean addUser(@RequestBody User user){
        return userService.add(user);
    }

    @GetMapping("/all")
    @ResponseBody
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
