package com.webdatastore.springbootwebdatastore.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "userDetails")
public class User {

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "user_name, nullable")
    private String userName;
    @Column(name = "email_id")
    private String email;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Id
    @GeneratedValue(generator = "UUID")
    private java.util.UUID userId;
    private String password;
    @Column(name = "isAdmin")
    private boolean isAdmin;

}
