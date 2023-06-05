package com.webdatastore.springbootwebdatastore.controller;

import com.webdatastore.springbootwebdatastore.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/users")
public class SessionController {

    @Autowired
    private SessionRepository sessionRepository;


}
