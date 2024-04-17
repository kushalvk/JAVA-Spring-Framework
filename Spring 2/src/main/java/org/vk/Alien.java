package org.vk;

public class Alien {

    int age;
    private int age1;

    public Alien() {
//        System.out.println("Alien Object Created");
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
