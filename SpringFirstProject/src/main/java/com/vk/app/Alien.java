package com.vk.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // it use to talk to Spring to create an Object of 'Alien'
public class Alien {

    @Autowired // it mean spring will find the 'Laptop' class That was "@Component"
    Laptop laptop;

    public void Code() {
        laptop.compile();
        System.out.println("Coding");
    }
}
