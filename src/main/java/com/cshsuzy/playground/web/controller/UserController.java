package com.cshsuzy.playground.web.controller;

import com.cshsuzy.playground.UserRepository;
import com.cshsuzy.playground.web.entity.UserEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
@Api(tags="使用者管理")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserRepository userRepository;

    @ApiOperation(value = "取得使用者", notes = "列出所有使用者")
    @GetMapping("/users")
    public List<UserEntity> users() {
        List<UserEntity> userEntityList =  userRepository.findAll();
//        for (UserEntity user : userEntityList) {
//            log.info(user.toString());
//        }
        return userEntityList;
    }
}