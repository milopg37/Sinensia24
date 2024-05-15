package com.curso.principales;

import java.util.ArrayList;
import java.util.List;

import com.curso.dominio.Categoria;
import com.curso.dominio.Libro;

import jakarta.persistence.*;

public class Ejemplo02 {

	public static void main(String[] args) {
		
		//Unidad que figura en el Persistence.xml
		EntityManagerFactory  emf = Persistence.createEntityManagerFactory("biblioteca2");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Categoria nuevaCategoria = new Categoria("Haylee", "Lorem Ipsum");
		Libro nuevoLibro = new Libro("L02", "Eternal Sunset", "Luppo", 56);
		Libro nuevoLibro2 = new Libro("L03", "Quid Pro Quo", "Muller", 16);
		nuevoLibro.setCategoria(nuevaCategoria);
		nuevoLibro2.setCategoria(nuevaCategoria);
		
		List<Libro> lista = new ArrayList<Libro>();
		lista.add(nuevoLibro);
		lista.add(nuevoLibro2);
		
		nuevaCategoria.setListaLibros(lista);
		
		em.persist(nuevaCategoria);
		em.persist(nuevoLibro);
		em.persist(nuevoLibro2);
		
		em.getTransaction().commit();
	}

}
