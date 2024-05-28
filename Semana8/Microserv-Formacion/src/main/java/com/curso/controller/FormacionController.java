package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.curso.models.Curso;
import com.curso.models.Formacion;
import com.curso.service.FormacionServiceImpl;

@RestController
public class FormacionController {
	
	@Autowired
	private FormacionServiceImpl servicio;
	
	@GetMapping(value = "formacion/findAll", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Curso> getCursosExistentes(){
		return servicio.getCursosExistentes();
	}
	
	
	@PostMapping(value = "formacion/nuevoCurso", consumes = MediaType.APPLICATION_JSON_VALUE)
	void altaCurso(@RequestBody Formacion formacionAlta) {
		servicio.altaCurso(formacionAlta);
	}
}
