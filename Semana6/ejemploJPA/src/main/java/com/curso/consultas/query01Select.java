package com.curso.consultas;

import java.util.List;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class query01Select {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery query = em.createQuery("SELECT l FROM Libro l", Libro.class);
		
		List<Libro> listaLibros = query.getResultList();
		
		for (Libro libro : listaLibros) {
			System.out.println(libro);
		}
		
	}

}
