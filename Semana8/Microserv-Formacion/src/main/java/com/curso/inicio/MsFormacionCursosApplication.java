package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"com.curso.service","com.curso.controller"})
public class MsFormacionCursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsFormacionCursosApplication.class, args);
	}

	@Bean
	RestTemplate template() {
		return new RestTemplate();
	}
}
