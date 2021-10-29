package com.springboot.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Employee Project", version = "0.0.1-SNAPSHOT", description = "Employee Service Operations", termsOfService = "vkakarla java springboot service", contact = @Contact(name = "vkakarl", email = "vkakarla1985@gmail.com"), license = @License(name = "vkakarla", url = "http://youtube.com/vkakarla")))
@ComponentScan(value = "com.springboot.openapi")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
