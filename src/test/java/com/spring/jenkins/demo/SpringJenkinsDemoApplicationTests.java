package com.spring.jenkins.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDemoApplicationTests {

	public Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("inside test case method....");
		assertEquals(true, true);
	}

}
