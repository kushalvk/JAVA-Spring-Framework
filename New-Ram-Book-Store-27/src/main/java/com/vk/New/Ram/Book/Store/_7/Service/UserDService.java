package com.vk.New.Ram.Book.Store._7.Service;

import com.vk.New.Ram.Book.Store._7.Model.User;
import com.vk.New.Ram.Book.Store._7.Model.UserPrincipal;
import com.vk.New.Ram.Book.Store._7.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDService implements UserDetailsService {

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
