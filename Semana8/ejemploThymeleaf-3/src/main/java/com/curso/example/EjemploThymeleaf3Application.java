package com.curso.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.curso.controller", "com.curso.service"})
public class EjemploThymeleaf3Application {

	public static void main(String[] args) {
		SpringApplication.run(EjemploThymeleaf3Application.class, args);
	}

}
