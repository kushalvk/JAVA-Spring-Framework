package com.vk.Bookmark.app6.Service;

import com.vk.Bookmark.app6.Model.UserPrincipal;
import com.vk.Bookmark.app6.Model.bookmark;
import com.vk.Bookmark.app6.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        bookmark user = userRepo.findByUsername(username);
        if (user == null) {
            System.out.println("User 404");
            throw new UsernameNotFoundException("404");
        }

        return new UserPrincipal(user);
    }
}
