package com.numele_tau.proiect_nume;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("users") 
public class UserController {

    private List<User> userList = new ArrayList<>(); 

    
    @GetMapping
    public List<User> getAllUsers() {
        return userList;
    }


    @PostMapping
    public User addUser(@RequestBody User user) {
        userList.add(user);
        return user;
    }
}
