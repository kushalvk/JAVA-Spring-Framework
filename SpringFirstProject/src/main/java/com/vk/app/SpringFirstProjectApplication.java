package com.vk.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFirstProjectApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringFirstProjectApplication.class, args);

		// 'ApplicationContext' is use to create a Variable to create a object

		Alien obj = context.getBean(Alien.class); // create an object using variable 'context'
		obj.Code();

//		Alien obj1 = context.getBean(Alien.class); // create a multiple object
//		obj1.Code();
	}

}
