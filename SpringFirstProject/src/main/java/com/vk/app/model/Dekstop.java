package com.vk.app.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dekstop implements Computer{
    public void compile() {
        System.out.println("Compiling in Dekstop");
    }
}