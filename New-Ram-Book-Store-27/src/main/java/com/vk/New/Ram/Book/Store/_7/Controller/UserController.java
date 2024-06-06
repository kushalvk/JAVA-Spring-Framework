package com.vk.New.Ram.Book.Store._7.Controller;

import com.vk.New.Ram.Book.Store._7.Model.Book;
import com.vk.New.Ram.Book.Store._7.Model.User;
import com.vk.New.Ram.Book.Store._7.Service.BookService;
import com.vk.New.Ram.Book.Store._7.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("login")
    public String register(@ModelAttribute User user) {
        service.saveUser(user);
        System.out.println("Coming here");
        return "<h1>Registration Successfull.......!</h1><br><a href='Login'><button>Let's log in</button></a>";
    }
}
