package com.vk.Spring.OAuth3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringOAuth13Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringOAuth13Application.class, args);

		// OAuth is use to not login by uname and password
		// it is login by other application like google or github

	}

}
