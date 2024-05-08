package com.vk.Spring.Security2.controler;

import com.vk.Spring.Security2.service.JwtService;
import com.vk.Spring.Security2.model.User;
import com.vk.Spring.Security2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// User register
@RestController
public class UserCantroler {

    @Autowired
    private UserService service;

    @PostMapping("register")
    public User register(@RequestBody User user) {
        return service.saveUser(user);
    }

//     for Login (generate a token
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtservice;

    // check if is has account or not (uname,pass)
    @PostMapping("login")
    public String login(@RequestBody User user) {
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if (authentication.isAuthenticated())
            return jwtservice.generateToken(user.getUsername());
//            return "Success";
        else
            return "Login Failed";
    }
}
