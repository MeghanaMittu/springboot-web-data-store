package com.webdatastore.springbootwebdatastore.repository;

import com.webdatastore.springbootwebdatastore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    //all crud database methods
}
