package com.webdatastore.springbootwebdatastore;

import com.webdatastore.springbootwebdatastore.model.User;
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

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setUserName("Meghana9");
		user.setPassword("12345678");
		user.setEmail("meghanakanneganti@gmail.com");
		user.setPhoneNumber("9267853750");

		User user1 = new User();
		user1.setUserName("maggi");
		user1.setPassword("12345678");
		user1.setEmail("maggi@gmail.com");
		user1.setPhoneNumber("9267245020");
	}
}

