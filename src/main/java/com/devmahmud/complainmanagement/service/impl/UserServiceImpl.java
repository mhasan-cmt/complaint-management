package com.devmahmud.complainmanagement.service.impl;

import com.devmahmud.complainmanagement.entity.User;
import com.devmahmud.complainmanagement.repository.UserRepository;
import com.devmahmud.complainmanagement.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Boolean add(User user) {
        return userRepository.save(user) != null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }
}
