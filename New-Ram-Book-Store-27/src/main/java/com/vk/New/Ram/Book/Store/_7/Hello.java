package com.vk.New.Ram.Book.Store._7;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping("Hello")
    public String HelloController() {
        return "Hello.......!";
    }
}
