package com.cshsuzy.playground.web.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@Table(name = "user")
@ApiModel("使用者基本資訊")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty("ID")
    private int id;

    @ApiModelProperty("EMAIL")
    @Column(name = "EMAIL")
    private String email;

    @ApiModelProperty("手機")
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