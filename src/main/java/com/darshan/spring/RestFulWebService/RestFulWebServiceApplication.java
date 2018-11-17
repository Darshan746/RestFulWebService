package com.darshan.spring.RestFulWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="com.darshan.*")
public class RestFulWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFulWebServiceApplication.class, args);
	}
}
