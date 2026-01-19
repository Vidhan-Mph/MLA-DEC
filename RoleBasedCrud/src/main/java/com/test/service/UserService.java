package com.test.service;

import java.util.List;

import com.test.dto.UserDto;
import com.test.entity.User;

public interface UserService {

    void saveUser(UserDto userDto);

    void updateUser(UserDto userDto);

    User findById(Long id);

    List<User> findAll();

    void deleteUser(Long id);
}