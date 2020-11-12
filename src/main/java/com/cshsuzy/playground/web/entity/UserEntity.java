package com.cshsuzy.playground.web.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PHONE")
    private String phone;

    protected UserEntity() {}

    public UserEntity(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format(
                "User[id=%d, Email='%s', Phone='%s']",
                id, email, phone);
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}