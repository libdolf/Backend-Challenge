package com.libdolf.challenge.controllers;

import com.libdolf.challenge.models.Inventory;
import com.libdolf.challenge.models.User;
import com.libdolf.challenge.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class AppController {
    private UserRepository userRepository;

    @GetMapping(value = "/users")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    @PostMapping(value = "/newuser")
    public ResponseEntity<User> createNewUser(@RequestBody User user){
        for(Inventory inventory : user.getInventory()){
            inventory.setUser(user);
        }
        return ResponseEntity.ok(userRepository.save(user));
    }
}
