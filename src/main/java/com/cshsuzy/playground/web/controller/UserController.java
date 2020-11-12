package com.cshsuzy.playground.web.controller;

import com.cshsuzy.playground.UserRepository;
import com.cshsuzy.playground.web.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/api")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/users")
    public String users() {
        for (UserEntity user : userRepository.findAll()) {
            log.info(user.toString());
        }
        return "Finish";
    }
}