package com.curso.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.curso.controller"})
public class EjemploThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploThymeleafApplication.class, args);
	}

}
