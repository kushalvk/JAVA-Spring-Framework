package com.vk.springbootrest9.service;

import com.vk.springbootrest9.model.User;
import com.vk.springbootrest9.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12); // password bcrypt

    @Autowired
    private UserRepo repo;

    public User saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return repo.save(user);
    }
}