package com.vk.Service.Registry9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistry19Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistry19Application.class, args);
	}

}
