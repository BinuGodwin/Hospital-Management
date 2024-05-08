package com.ty.HospitalManagementSystem.swagger;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket getDocket() {
		ApiInfo apiInfo = new ApiInfo("Swagger demo", "Swagger and Validation", "1.0", "http://www.jspiders.com",
				new Contact("Vikram Pal", "http://www.Jspiders.com", "vikrampal21@gmail.com"), "TY-2023",
				"http://www.Jspiders.com", new ArrayList<>());

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.ty.HospitalManagementSystem")).build().apiInfo(apiInfo)
				.useDefaultResponseMessages(false);
	}

}
