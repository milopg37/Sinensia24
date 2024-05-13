package com.curso.querys;

import java.util.List;

import com.curso.dominio.Pelicula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class query03 {

	public static void main(String[] args) {
		/**
		 * 3. Mostrar todas las peliculas cuya directora es Ana o Eva
			SELECT * FROM videoclub.peliculas WHERE director = 'Ana' OR  director = 'Eva';
		 */
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclub");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery query = em.createQuery("SELECT p"
				+ " FROM Pelicula p"
				+ " WHERE p.director = 'Ana' OR p.director = 'Eva'", Pelicula.class);
		
		List<Pelicula> listaPeliculas = query.getResultList();
		
		for (Pelicula pelicula : listaPeliculas) {
			System.out.println(pelicula);
		}
		
	}

}
