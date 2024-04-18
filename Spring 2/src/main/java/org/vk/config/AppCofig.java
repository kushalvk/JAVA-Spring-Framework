// this file is 'java base config' it replace to the 'XML' file.

package org.vk.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.vk.Alien;
import org.vk.Computer;
import org.vk.Desktop;
import org.vk.Laptop;

@Configuration
@ComponentScan("org.vk") // it's use to connect to all of file in the "org.vk" class to the each other by Spring
public class AppCofig {

    // Desktop
//    @Bean

        // Bean name
//    @Bean(name = "desk") // defining name of the bean
//    @Bean(name = {"desk","desk1","desk2"}) // defining multiple name of the bean

        // Scope
//    @Scope("prototype")
//    @Scope("singleton") // default

//    @Bean
//    public Desktop desktop1() {
//        return new Desktop();
//    }


    // Alien
//    @Bean
//    public Alien alien(Computer com) { // '@Autowired' is optional if you mention or not is works Ex:- (@Autowired Computer com)
////        @Qualifier("laptop1") is use to the 'reference' of the bean Ex:- (@Qualifier("desktop1") Computer com)
//        Alien obj = new Alien();
//        obj.setAge1(30);
//        obj.setCom(com); // autowire to computer class
//        return obj;
//    }
//
//
//    // Laptop
//    @Bean
//    @Primary // First refers if multi references are given Ex:- desktop1(),laptop1()
//    public Laptop laptop1() {
//        return new Laptop();
//    }
}
