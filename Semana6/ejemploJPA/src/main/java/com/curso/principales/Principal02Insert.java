package com.curso.principales;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Principal02Insert {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		Libro libro = new Libro("3A","JPA","Ana", 60);
		
		em.getTransaction().begin();
		
		em.persist(libro);
		
		em.getTransaction().commit();
	}

}
