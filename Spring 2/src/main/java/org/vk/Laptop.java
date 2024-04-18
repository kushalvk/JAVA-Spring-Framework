package org.vk;

import org.springframework.stereotype.Component;

@Component // it's use to connect to all of the class to the each other by Spring
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Object Created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Laptop...");
    }
}
