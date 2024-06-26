package org.vk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // it's use to connect to all of the class to the each other by Spring
public class Alien {

    int age;
    @Value("10")
    private int age1;

    public Alien() {
        System.out.println("Alien Object Created");
    }
//    public Alien(int age1, Laptop lap) {
//        this.age1 = age1;
//        this.lap = lap;
//    }
    public int getAge1() {
        return age1;
    }
    public void setAge1(int age1) {
//        System.out.println("Setter called");
        this.age1 = age1;
    }

//    private Laptop lap;
//    public Laptop getLap() {
//        return lap;
//    }
//    public void setLap(Laptop lap) {
//        this.lap = lap;
//    }
//    public void code() {
//        System.out.println("Coding...");
//        lap.compile();
//    }

    @Autowired // two match it's give an error
//    @Qualifier("laptop") // Qualifier to which bean is use
    private Computer com;
    public Computer getCom() {
        return com;
    }
    public void setCom(Computer com) {
        this.com = com;
    }
    public void code() {
        System.out.println("Coding...");
        com.compile();
    }
}
