package org.vk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // create a container
        // "spring.xml" is create a main/resources
        // in the above line is create an object (if you run the constructor of 'Alian class' is called)

        Alien obj1 = (Alien) context.getBean("alien1"); // create an object of container
//        obj1.age = 21;
//        System.out.println(obj1.age);

//        obj1.setAge1(22);
        System.out.println(obj1.getAge1());

        obj1.code();

//        Alien obj2 = (Alien) context.getBean("alien1");
//        System.out.println(obj2.age);
//        obj2.code();

//        The both the object of "alien1" class is work as once.(One Bean multi object = once) (it's called "Singleton" Bean)
    }
}
