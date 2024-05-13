package com.curso.principales;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Principal03Delete {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		Libro libroEliminar = em.find(Libro.class, "3A");
		
		em.getTransaction().begin();
		
		em.remove(libroEliminar);
		
		em.getTransaction().commit();
	}

}
