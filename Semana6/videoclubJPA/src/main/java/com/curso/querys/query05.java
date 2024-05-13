package com.curso.querys;

import java.util.List;

import com.curso.dominio.Pelicula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class query05 {

	public static void main(String[] args) {
		/**
		 * 5. Mostrar las peliculas cuyo precio es mayor que 20 y menor que 55
			SELECT * FROM videoclub.peliculas WHERE precio_alquiler >= 20 AND precio_alquiler <= 55
		 */
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclub");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery query = em.createQuery("SELECT p"
				+ " FROM Pelicula p"
				+ " WHERE p.precio_alquiler >= :inicioRango AND p.precio_alquiler <= :finRango", Pelicula.class);
		
		query.setParameter("inicioRango", 20.0); //bindParams
		query.setParameter("finRango", 55.0); //bindParams
		
		List<Pelicula> listaPeliculas = query.getResultList();
		
		for (Pelicula pelicula : listaPeliculas) {
			System.out.println(pelicula);
		}
	}

}
