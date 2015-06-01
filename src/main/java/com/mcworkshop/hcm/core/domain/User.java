package com.mcworkshop.hcm.core.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by markfredchen on 5/29/15.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userID;

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    private String title;

    private String department;

}
