package com.webdatastore.springbootwebdatastore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "session")
public class Session {

    @Id
    @Column(name = "session_id", unique = true, nullable = false)
    private Long sessionID;
    @Column(name = "session_token")
    private String sessionToken;
    @Column(name = "expires_at")
    private Long expiresAt;
    @Column(name = "generated_time")
    private Long generatedTime;

}
