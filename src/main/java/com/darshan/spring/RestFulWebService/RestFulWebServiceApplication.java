package com.darshan.spring.RestFulWebService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="com.darshan.*")
@EnableCaching
//@EnableAutoConfiguration(exclude=HibernateJpaAutoConfiguration.class)
public class RestFulWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFulWebServiceApplication.class, args);
	}
}