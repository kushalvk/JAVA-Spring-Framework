package org.vk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.vk.config.AppCofig;

public class App
{
    public static void main( String[] args )
    {

                    // XML base cnfig
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // create a container
        // "spring.xml" is create a main/resources
        // in the above line is create an object (if you run the constructor of 'Alian class' is called)

//        Alien obj1 = (Alien) context.getBean("alien1"); // create an object of container
//        obj1.age = 21;
//        System.out.println(obj1.age);

//        obj1.setAge1(22);
//        System.out.println(obj1.getAge1());

//        obj1.code();

//        Alien obj2 = context.getBean("alien1", Alien.class); // create an object of container without type casting
//        System.out.println(obj2.age);
//        obj2.code();

//        The both the object of "alien1" class is work as once.(One Bean multi object = once) (it's called "Singleton" Bean)

//        Computer com = context.getBean(Computer.class); // Interface

//        Desktop obj3 = context.getBean(Desktop.class);


                // java base config

        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppCofig.class);
//        Desktop dt = context1.getBean(Desktop.class);

            // Bean name
//        Desktop dt = context1.getBean("desktop1",Desktop.class);
//        the default name of bean is the method name

            // scope
//        Desktop dt = context1.getBean(Desktop.class);
//        dt.compile();
//        Desktop dt1 = context1.getBean(Desktop.class);
//        dt1.compile();

            // autowire
        Alien obj1 = context1.getBean(Alien.class);
        System.out.println(obj1.getAge1());
        obj1.code();
    }
}
