package com.darshan.spring.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping(path="/helloworld")
	public String getHelloWorld() {
		return "Hello world";
	}
	
	@GetMapping(path="/helloworldBean")
	public HelloWorldBean getHelloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

	@GetMapping(path="/helloworldBean/path-variable/{name}")
	public HelloWorldBean getHelloWorldBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World %s", name));
	}

	
}
