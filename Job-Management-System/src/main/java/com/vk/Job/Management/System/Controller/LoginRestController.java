package com.vk.Job.Management.System.Controller;

import com.vk.Job.Management.System.Model.User;
import com.vk.Job.Management.System.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Login")
public class LoginRestController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String register(@ModelAttribute User user) {
        System.out.println(user);
        userService.saveUser(user);
        return "<h1>Login Your Account <a href='login'> Login </a></h1>";
    }
}
