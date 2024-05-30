package com.curso.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.curso.controller", "com.curso.service"})
public class ThymeleafReservasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafReservasApplication.class, args);
	}

}
