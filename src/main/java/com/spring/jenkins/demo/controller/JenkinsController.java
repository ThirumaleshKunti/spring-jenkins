package com.spring.jenkins.demo.controller;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

	private Logger logger = LoggerFactory.getLogger(JenkinsController.class);
	@PostConstruct
	public  getMessage() {
		logger.info("welcome message in Controller class...");
		return "Spring boot with jenkins integration..";
	}
}
