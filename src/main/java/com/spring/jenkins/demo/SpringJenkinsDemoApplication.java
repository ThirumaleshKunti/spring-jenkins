package com.spring.jenkins.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsDemoApplication {
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplication.class);

	@PostConstruct
	public  init() {
		logger.info("init methd execution...");
	}

	public static void main(String[] args) {
		logger.info("Main method execution...");
		SpringApplication.run(SpringJenkinsDemoApplication.class, args);
	}

}
