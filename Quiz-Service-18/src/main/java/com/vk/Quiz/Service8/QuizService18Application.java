package com.vk.Quiz.Service8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QuizService18Application {

	public static void main(String[] args) {
		SpringApplication.run(QuizService18Application.class, args);
	}

}
