package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.models.Libro;

@Service
public class LibroServiceImpl implements LibroService{
	
	List<Libro> libros;
	
	public LibroServiceImpl() {
		libros = new ArrayList<>();
		libros.add(new Libro(111,"Grecia","Viajes"));
		libros.add(new Libro(222,"LA Noir","Crimen"));
		libros.add(new Libro(333,"El tercer cuerpo","Psicologia"));
		libros.add(new Libro(444,"Viaje del Heroe","Fantasia"));
	}

	/**
	 * Devuelve toda la lista de libros
	 */
	@Override
	public List<Libro> libros() {
		
		return libros;
	}

	/**
	 * Busca un libro por clave ISBN
	 * y lo devuelve
	 */
	@Override
	public Libro buscarLibro(int isbn) {
		
		for (Libro libro : libros) {
			if (libro.getIsbn() == isbn) {
				return libro;
			}
		}
		return null;
	}

	/**
	 * Añade un nuevo libro a la lista
	 */
	@Override
	public void altaLibro(Libro libro) {
		
		libros.add(libro);
	}

	/**
	 * Actualiza un libro
	 */
	@Override
	public void actualizarLibro(Libro libro) {
		
		Libro libro2 = buscarLibro(libro.getIsbn());
		
		if (libro2 != null) {
			libro2.setTitulo(libro.getTitulo());
			libro2.setTematica(libro.getTematica());
		}
		
	}

	/**
	 * Elimina un libro por clave ISBN
	 * Devuelve la lista actualizada
	 */
	@Override
	public List<Libro> eliminarLibro(int isbn) {
		libros.remove(buscarLibro(isbn));
		return libros;
	}
	

}
