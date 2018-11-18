package com.darshan.spring.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 //This annotation enables Swagger support in the class.
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()     // select() method called on the Docket bean instance returns an ApiSelectorBuilder,
                             // which provides the apis() and paths() methods that are used to filter the
                            // controllers and methods that are being documented using String predicates.
                .apis(RequestHandlerSelectors.basePackage("com.darshan")) //In the code, the RequestHandlerSelectors.basePackage predicate matches the com.darshan" base package to filter the API. 
                .build()
                .apiInfo(metaData());
	}

	private ApiInfo metaData() {
	        ApiInfo apiInfo = new ApiInfo(
	                "Spring Boot REST API",
	                "Spring Boot REST API for Learning ",
	                "1.0",
	                "Terms of service",
	                new Contact("Darshan", "https://google.com/images/", "darshan.mn746@gmail.com"),
	               "Apache License Version 2.0",
	                "https://www.apache.org/licenses/LICENSE-2.0");
	        return apiInfo;
	}
}
