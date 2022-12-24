package com.pichkasik.articles.ec2_rds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableScheduling
@SpringBootApplication
public class AwsEssentialApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsEssentialApplication.class, args);
	}

}
