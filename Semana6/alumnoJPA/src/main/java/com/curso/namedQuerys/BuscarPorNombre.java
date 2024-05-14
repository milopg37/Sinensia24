package com.curso.namedQuerys;

import java.util.List;

import com.curso.dominio.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class BuscarPorNombre {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alumno");
        EntityManager em = emf.createEntityManager();
        
        TypedQuery<Alumno> queryBuscarPorNombre = em.createNamedQuery("Alumno.buscarPorNombre", Alumno.class);
        
        String nombreBuscar = "Camilo";
        queryBuscarPorNombre.setParameter("nombre", nombreBuscar);
        
        List<Alumno> listaAlumnos = queryBuscarPorNombre.getResultList();
        
        for (Alumno alumno : listaAlumnos) {
			System.out.println("Alumno con el Nombre a buscar: " + nombreBuscar);
			System.out.println(alumno);
		}

	}

}
