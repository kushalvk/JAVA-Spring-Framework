package com.vk.Job.Management.System.Service;

import com.vk.Job.Management.System.Model.User;
import com.vk.Job.Management.System.Model.UserPrincipal;
import com.vk.Job.Management.System.Repo.UserRepo;
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
        User user = userRepo.findByusername(username);
        if (user == null) {
            System.out.println("User 404");
            throw new UsernameNotFoundException("404");
        }

        return new UserPrincipal(user);
    }
}
