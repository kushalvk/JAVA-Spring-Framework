package com.vk.Job.Management.System.Service;

import com.vk.Job.Management.System.Model.User;
import com.vk.Job.Management.System.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserRepo userRepo;

    public User saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        return userRepo.save(user);
    }
}
