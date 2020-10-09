package com.obss.mentor.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MentorServiceRegistry {

	public static void main(String[] args) {
		SpringApplication.run(MentorServiceRegistry.class, args);
	}

}
