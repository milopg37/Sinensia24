package com.curso.consultas;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class quey03SelectWhereAnd {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.autor = :autor AND l.precio >= 30", Libro.class);
		
		

	}

}
