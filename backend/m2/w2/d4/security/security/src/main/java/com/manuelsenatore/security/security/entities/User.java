package com.manuelsenatore.security.security.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(unique = true, nullable = false)
    private String username;
    private String firstName;
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Calendar birthDate;
    private Boolean active;
    private String password;
    private String email;

    @ManyToMany
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<Role>();

}
