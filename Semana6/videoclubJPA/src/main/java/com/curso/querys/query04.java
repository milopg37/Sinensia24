package com.curso.querys;

import java.util.List;

import com.curso.dominio.Pelicula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class query04 {

	public static void main(String[] args) {
		/**
		 * 4.Mostrar solo los directores de las peliculas
			SELECT director FROM videoclub.peliculas
		 */

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclub");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery query = em.createQuery("SELECT p.director"
				+ " FROM Pelicula p", String.class);
		
		List<String> listaDirectores = query.getResultList();
		
		for (String director : listaDirectores) {
			System.out.println(director);
		}
		
	}

}
