package com.vk.app;

import com.vk.app.model.Alien_02;
import com.vk.app.model.Laptop_03;
import com.vk.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFirstProjectApplication_01 {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringFirstProjectApplication_01.class, args);

		// 'ApplicationContext' is use to create a Variable to create a object

		LaptopService service = context.getBean(LaptopService.class);

		Laptop_03 lap = context.getBean(Laptop_03.class);
		service.addlaptop(lap);

//		Alien_02 obj = context.getBean(Alien_02.class); // create an object using variable 'context'
//		System.out.println(obj.getAge());
//		obj.Code();

//		Alien_02 obj1 = context.getBean(Alien.class); // create a multiple object
//		obj1.Code();
	}

}
