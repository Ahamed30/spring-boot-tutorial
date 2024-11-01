package com.demo.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// We can explicitly mention packages that need component scanning when this app runs.
// By default for this app, spring-boot does component scanning inside com.demo.springcoredemo
//@SpringBootApplication(
//		scanBasePackages = {"com.demo.springcoredemo",
//							"com.demo.util"})
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
