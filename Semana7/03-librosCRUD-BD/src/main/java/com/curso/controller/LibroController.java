package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.curso.model.Libro;
import com.curso.service.LibroServiceImpl;

@RestController
public class LibroController {
	
	@Autowired
	LibroServiceImpl servicio;
	
	@GetMapping(value = "libros", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> libros(){
		return servicio.libros();
	}
	
	@GetMapping(value = "libros/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Libro buscarLibro(@PathVariable("isbn") int isbn) {
		return servicio.buscarLibro(isbn);
	}
	
	@PostMapping(value = "libros", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void altaLibro(@RequestBody Libro libro) {
		servicio.altaLibro(libro);
	}
	
	@PutMapping(value = "libros", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarLibro(@RequestBody Libro libro) {
		servicio.actualizarLibro(libro);
	}
	
	@DeleteMapping(value = "libros/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> eliminarLibro(@PathVariable("isbn") int isbn){
		return servicio.eliminarLibro(isbn);
	}
}
