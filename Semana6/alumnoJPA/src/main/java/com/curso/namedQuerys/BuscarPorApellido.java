package com.curso.namedQuerys;

import java.util.List;

import com.curso.dominio.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class BuscarPorApellido {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alumno");
        EntityManager em = emf.createEntityManager();
        
        TypedQuery<Alumno> queryBuscarPorApellido = em.createNamedQuery("Alumno.buscarPorApellido", Alumno.class);
        
        String apellidoBuscar = "Babarro";
        queryBuscarPorApellido.setParameter("apellido", apellidoBuscar);
        
        List<Alumno> listaAlumnos = queryBuscarPorApellido.getResultList();
        
        for (Alumno alumno : listaAlumnos) {
			System.out.println("Alumno con el Apellido a buscar: " + apellidoBuscar);
			System.out.println(alumno);
		}

	}

}
