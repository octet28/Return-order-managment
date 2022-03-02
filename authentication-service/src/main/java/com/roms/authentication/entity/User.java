package com.roms.authentication.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NonNull
    private String username;
    @NonNull
    private String password;
    @NonNull
    private String roles;

    public User(String username, String password, String roles) {
        this.password = password;
        this.username = username;
        this.roles = roles;
    }
}
