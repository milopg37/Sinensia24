package com.curso.principales;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Principal01 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		Libro libro = em.find(Libro.class, "1A");
		System.out.println(libro.getIsbn());
		System.out.println(libro.getTitulo());
		System.out.println(libro.getAutor());
		System.out.println(libro.getPrecio());
		

	}

}
