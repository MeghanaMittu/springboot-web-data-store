package com.webdatastore.springbootwebdatastore.controller;

import com.webdatastore.springbootwebdatastore.exception.ResourceNotFoundException;
import com.webdatastore.springbootwebdatastore.model.User;
import com.webdatastore.springbootwebdatastore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    //build get user with email by REST API
    @GetMapping("{email}")
    public ResponseEntity<User> getUserByName(@PathVariable String email) {
        User user = userRepository.findByEmail(email);
                //orElseThrow(() -> new ResourceNotFoundException("User not exist with:" +userName));
                //not throwing exception here needs to be fixed
        return ResponseEntity.ok(user);
    }

    //build update User REST API
    @PutMapping("{email}")
    public ResponseEntity<User> updateUser(@PathVariable String email, @RequestBody User userDetails) {
        User updateUserDetails = userRepository.findByEmail(email);
        //.orElseThrow(() -> new ResourceNotFoundException("User doesn't exist with " +email));

        updateUserDetails.setUserName(userDetails.getUserName());
        updateUserDetails.setPhoneNumber(userDetails.getPhoneNumber());
        updateUserDetails.setPassword(userDetails.getPassword());

        userRepository.save(updateUserDetails);

        return ResponseEntity.ok(updateUserDetails);
    }

    //build delete User REST API
    @DeleteMapping("{email}")
    public ResponseEntity<User> delete(@PathVariable String email) {

        User user = userRepository.findByEmail(email);
        //.orElseThrow(() -> new ResourceNotFoundException("User doesn't exist with " +email));

        userRepository.delete(user);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
