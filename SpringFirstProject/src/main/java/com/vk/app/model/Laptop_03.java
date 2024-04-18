package com.vk.app.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop_03 implements Computer{
    public void compile() {
        System.out.println("Compiling in Laptop");
    }
}
