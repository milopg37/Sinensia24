package com.curso.querys;

import java.util.List;

import com.curso.dominio.Pelicula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class query06 {

	public static void main(String[] args) {
		/**
		 * Mostrar las peliculas cuyo director es Cosme
		 */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclub");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Pelicula> query = em.createQuery("SELECT p"
											+ " FROM Pelicula p "
											+ " WHERE p.director = 'Cosme'", Pelicula.class);
		
		List<Pelicula> listaPeliculas = query.getResultList();
		
		for (Pelicula pelicula : listaPeliculas) {
			System.out.println(pelicula);
		}

	}

}
