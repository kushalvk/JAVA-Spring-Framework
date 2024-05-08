package com.vk.Rest.Docker4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestDocker14Application {

	public static void main(String[] args) {
		SpringApplication.run(RestDocker14Application.class, args);
	}
//	 get JDK in docker
//	-> docker run -it openjdk:23-slim-bullseye (image name and version name)

//	copy the jar into container
//	-> docker cp target/rest-docker.jar xenodochial_banach:/tmp(container name and folder name)

//	create the image and pass the command
//	docker commit --change='CMD ["java","-jar","/tmp/rets-docker.jar"]' xenodochial_banach vk/rest-demo:v1
}
