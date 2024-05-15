package com.curso.principales;

import java.util.List;

import com.curso.dominio.Categoria;

import jakarta.persistence.*;

public class Ejemplo05 {

	public static void main(String[] args) {
		//Seleccionar las categorias con menos de 3 libros
		
		EntityManagerFactory  emf = Persistence.createEntityManagerFactory("biblioteca2");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		TypedQuery<Categoria> consulta = em.createQuery("SELECT c FROM Categoria c WHERE SIZE(c.listaLibros)<3", Categoria.class);
		
		List<Categoria> resultado = consulta.getResultList();
		
		for (Categoria categoria : resultado) {
			System.out.println(categoria);
		}
		
		
		em.getTransaction().commit();
	}

}
