package com.example.tp_rest.controller;

import com.example.tp_rest.model.User;
import com.example.tp_rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;
    @Autowired
    public UserController( UserService userService ) {
        this.userService = userService;
    }
    @GetMapping("/user")
    public User getUser(@RequestParam int id){
        User user= userService.getUser(id);
        if (user!=null){
            return user;
        }
        return null;
    }
        @GetMapping("/users")
        public List<User> getUsers() {
            return userService.getUsers();
        }
        @PostMapping("/usr")
        public void setUser( @RequestParam int id, @RequestParam String nom, @RequestParam String mail) {
            User user= new User(id, nom, mail);
            userService.setUser(id, user);
        }
        @DeleteMapping("/supp")
            public void SupprimerUser (@RequestParam int id) {
            userService.suppUser(id);
        }
}
