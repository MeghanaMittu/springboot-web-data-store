package com.webdatastore.springbootwebdatastore;

import com.webdatastore.springbootwebdatastore.model.User;
import com.webdatastore.springbootwebdatastore.repository.SessionRepository;
import com.webdatastore.springbootwebdatastore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootWebDataStoreApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebDataStoreApplication.class, args);
	}

	@Autowired
	public UserRepository userRepository;

	@Autowired
	public SessionRepository sessionRepository;

	@Override
	public void run(String... args) throws Exception {

	}
}

