package com.curso.querys;

import java.util.List;

import com.curso.dominio.Pelicula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class query01 {

	public static void main(String[] args) {
		
		/**
		 * 1. Mostrar todas las peliculas:
			SELECT * FROM videoclub.peliculas;
		 */
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclub");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Pelicula> query = em.createQuery("SELECT p"
											+ " FROM Pelicula p", Pelicula.class);
		
		List<Pelicula> listaPeliculas = query.getResultList();
		
		for (Pelicula pelicula : listaPeliculas) {
			System.out.println(pelicula);
		}
		
	}

}
