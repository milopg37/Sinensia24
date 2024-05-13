package com.curso.consultas;

import java.util.List;

import com.curso.dominio.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class query02SelectWhere {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
		EntityManager em = emf.createEntityManager();
		
		TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.autor = :autor", Libro.class);
		
		query.setParameter("autor", "pedro"); //bindParams
		
		List<Libro> listaLibros = query.getResultList();
		
		for (Libro libro : listaLibros) {
			System.out.println(libro);
		}
		
	}

}
