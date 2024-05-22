package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.curso.models.Libro;
import com.curso.service.LibroService;

@RestController
public class LibroController {
	
	@Autowired
	LibroService service;

	@GetMapping(value = "libros", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> getLibros(){
		return service.libros();
	}
	
	@GetMapping(value = "libros/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Libro buscarLibro(@PathVariable("isbn") int isbn) {
		return service.buscarLibro(isbn);
	}
	
	@PostMapping(value = "libros", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void altaLibro(@RequestBody Libro libro) {
		service.altaLibro(libro);
	}
	
	@PutMapping(value = "libros", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarLibro(@RequestBody Libro libro) {
		service.actualizarLibro(libro);
	}
	
	@DeleteMapping(value = "libros/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Libro> eliminarLibro(@PathVariable("isbn") int isbn){
		return service.eliminarLibro(isbn);
	}
}
