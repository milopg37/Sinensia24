package com.curso.namedQuerys;

import java.util.List;

import com.curso.dominio.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class BuscarTodos {

	public static void main(String[] args) {
		
		  	EntityManagerFactory emf = Persistence.createEntityManagerFactory("alumno");
	        EntityManager em = emf.createEntityManager();
	        
	        
	        
	        TypedQuery<Alumno> queryBuscarTodos = em.createNamedQuery("Alumno.buscarTodos", Alumno.class);
	        
	        List<Alumno> listaAlumnos = queryBuscarTodos.getResultList();
	        
	        for (Alumno alumno : listaAlumnos) {
				System.out.println("--Listado--");
				System.out.println(alumno);
			}

	}

}
