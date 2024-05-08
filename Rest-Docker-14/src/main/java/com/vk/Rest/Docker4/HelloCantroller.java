package com.vk.Rest.Docker4;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCantroller {

    @RequestMapping("/")
    public String greet() {
        return "Hello World";
    }
}
