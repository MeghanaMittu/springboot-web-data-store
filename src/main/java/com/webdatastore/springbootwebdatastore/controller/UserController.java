package com.webdatastore.springbootwebdatastore.controller;

import com.webdatastore.springbootwebdatastore.exception.ResourceNotFoundException;
import com.webdatastore.springbootwebdatastore.model.User;
import com.webdatastore.springbootwebdatastore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //build create user REST API
    @PostMapping
    public User createUser(@RequestBody User user) {
    return userRepository.save(user);
    }

    //build get user by REST API
    @GetMapping("{userName}")
    public ResponseEntity<User> getUserByName(@PathVariable String userName) {
        User user = userRepository.findByUserName(userName);
                //orElseThrow(() -> new ResourceNotFoundException("User not exist with:" +userName));
                //not throwing exception here needs to be fixed
        return ResponseEntity.ok(user);
    }

    //build update User REST API
    public ResponseEntity<User> updateUser(String userName, User userDetails) {
        User updateUser = userRepository.findByUserName(userName)
    }
}
