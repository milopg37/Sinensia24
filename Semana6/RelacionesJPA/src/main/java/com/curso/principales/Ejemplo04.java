package com.curso.principales;

import java.util.List;

import com.curso.dominio.Libro;

import jakarta.persistence.*;

public class Ejemplo04 {

	public static void main(String[] args) {
		
		//Unidad que figura en el Persistence.xml
				EntityManagerFactory  emf = Persistence.createEntityManagerFactory("biblioteca2");
				EntityManager em = emf.createEntityManager();
				
				em.getTransaction().begin();
				
				TypedQuery<Libro> consulta = em.createQuery("SELECT l FROM Libro l WHERE l.categoria.nombre = 'Mesh'", Libro.class);
				//En la query accedo de esa manera al nombre de la categoria en el Where porque es un objeto con propiedades
				
				List<Libro> resultado = consulta.getResultList();
				
				for (Libro libro : resultado) {
					System.out.println(libro);
				}
				
				
				em.getTransaction().commit();

	}

}
