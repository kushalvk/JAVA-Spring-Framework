package com.vk.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // it use to talk to Spring to create an Object of 'Alien'
public class Alien_02 {

    @Autowired // it mean spring will find the 'Laptop' class That was "@Component"
    Laptop_03 laptop;

    public void Code() {
        laptop.compile();
        System.out.println("Coding");
    }
}
