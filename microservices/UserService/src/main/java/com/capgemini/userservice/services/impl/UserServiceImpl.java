package com.capgemini.userservice.services.impl;

import com.capgemini.userservice.entities.User;
import com.capgemini.userservice.exceptions.ResourceNotFoundException;
import com.capgemini.userservice.repositories.UserRepository;
import com.capgemini.userservice.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserServices {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        //Generate unique userId
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given ID is not found on server !! :" + userId));
    }
}
