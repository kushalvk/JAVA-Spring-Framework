package com.vk.springbootrest9.service;

import com.vk.springbootrest9.model.User;
import com.vk.springbootrest9.model.UserPrincipal;
import com.vk.springbootrest9.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDtailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = repo.findByUsername(username);
        if (user == null) {
            System.out.println("User 404");
            throw new UsernameNotFoundException("404");
        }

        return new UserPrincipal(user);
    }
}