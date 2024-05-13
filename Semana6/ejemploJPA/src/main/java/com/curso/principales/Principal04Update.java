package com.curso.principales;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Principal04Update {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		

		Libro libroUpdatear = em.find(Libro.class, "1A");
		
		em.getTransaction().begin();
		
		libroUpdatear.setAutor("notCamilo");
		libroUpdatear.setPrecio(141);
		
		em.merge(libroUpdatear);
		
		em.getTransaction().commit();
	}

}
