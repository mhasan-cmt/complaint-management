package com.devmahmud.complainmanagement.service;

import com.devmahmud.complainmanagement.entity.User;

import java.util.List;

public interface UserService {
    Boolean add(User user);

    List<User> getAllUsers();

    User getUserById(Long id);
}
