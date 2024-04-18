package com.vk.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // it use to talk to Spring to create an Object of 'Alien'
public class Alien_02 {

    @Value("19")
    private int age;
    @Autowired // it mean spring will find the 'Laptop' class That was "@Component"
    private Computer com;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Computer getCom() {
        return com;
    }
    @Autowired // it mean spring will find the 'Computer' class That was "@Component"
    @Qualifier("laptop_03")
    public void setCom(Computer com) {
        this.com = com;
    }
    public void Code() {
        com.compile();
    }
}
