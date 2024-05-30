package com.curso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.service.PersonaService;

@Controller
@RequestMapping(value = "/personas")
public class Ejemplo3Controller {
	
	@Autowired
	PersonaService servicio;

	@GetMapping(value = "/lista")
	public String mostrarPersonas() {
		return "personas/lista";
	}
	
	@GetMapping(value = "/lista2")
	public String mostrarPersonas2(Model model) {
		model.addAttribute("lista", servicio.buscarTodas());
		return "personas/lista2";
	}
}
