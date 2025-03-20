package com.capgemini.userservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "micro_users")
public class User {

    @Id
    @Column(name = "ID")
    private String userId;

    @Column(name = "NAME",length = 25)
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name= "ABOUT")
    private String about;

    //It doest not store in DB
    @Transient
    private List<Rating> ratings = new ArrayList<>();


}
