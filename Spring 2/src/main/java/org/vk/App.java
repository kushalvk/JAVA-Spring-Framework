package org.vk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // create a container
        // "spring.xml" is create a main/resources
        Alien obj = (Alien) context.getBean("alien"); // create an object of container
        obj.code();
    }
}
