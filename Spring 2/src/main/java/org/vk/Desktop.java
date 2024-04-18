package org.vk;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // it's use to connect to all of the class to the each other by Spring
@Primary // it's use references if two bean found
@Scope("prototype") // define scope itself.
public class Desktop implements Computer{

    public Desktop() {
        System.out.println("Desktop Object Created");
    }

    @Override
    public void compile() {
        System.out.println("Compiling using Desktop...");
    }
}
