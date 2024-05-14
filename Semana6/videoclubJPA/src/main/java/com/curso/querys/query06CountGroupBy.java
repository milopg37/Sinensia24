package com.curso.querys;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class query06CountGroupBy {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("videoclub");
		EntityManager em = emf.createEntityManager();
		
		//Contar elementos y ordenar por precio
		TypedQuery<Object[]> query = em.createQuery("SELECT COUNT(p.precio_alquiler), p.precio_alquiler"
											+ " FROM Pelicula p"
											+ " GROUP BY p.precio_alquiler", Object[].class);
		
		List<Object[]> listaPrecios = query.getResultList();
		
		for (Object[] objects : listaPrecios) {
			System.out.println("Nº peliculas con el mismo precio: "+ objects[0] + " El precio en cuestion: "+ objects[1]);
		}

	}

}
