package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.models.Ejemplar;
import com.curso.service.EjemplarServiceImpl;

@RestController
public class EjemplarController {

	@Autowired
	EjemplarServiceImpl servicio;
	
	@PostMapping(value = "ejemplar/{isbn}/{titulo}/{tematica}")
	List<Ejemplar> altaEjemplar(@PathVariable("isbn") int isbn,
								@PathVariable("titulo") String titulo, 
								@PathVariable("tematica") String tematica){
		
		Ejemplar ejemplar = new Ejemplar(isbn,titulo,tematica);
		
		return servicio.nuevoEjemplar(ejemplar);
	}
}
