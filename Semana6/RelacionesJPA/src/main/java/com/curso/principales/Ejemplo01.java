package com.curso.principales;

import com.curso.dominio.Categoria;
import com.curso.dominio.Libro;

import jakarta.persistence.*;

public class Ejemplo01 {

	public static void main(String[] args) {
		
		//Unidad que figura en el Persistence.xml
		EntityManagerFactory  emf = Persistence.createEntityManagerFactory("biblioteca2");
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		
		Libro libro1 = new Libro("L01", "Raccoon City", "Camilo", 1337);
		Categoria categoria = em.find(Categoria.class, "Mesh"); //Categoria existente en la DB
		libro1.setCategoria(categoria);
		em.persist(libro1); //Persistir en la DB
		
		em.getTransaction().commit();
	}

}
