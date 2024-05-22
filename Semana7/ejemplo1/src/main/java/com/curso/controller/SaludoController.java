package com.curso.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaludoController {
	
	
	// [Get] localhost:8080/saludo
	@GetMapping(value = "saludo", produces = MediaType.TEXT_PLAIN_VALUE)
	public String saludar() {
		return "Hola desde Spring";
	}

}
