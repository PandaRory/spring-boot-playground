package com.cshsuzy.playground;

import com.cshsuzy.playground.web.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserEntity, Integer> {
    List<UserEntity> findAll();

    List<UserEntity> findByEmail(String email);
}