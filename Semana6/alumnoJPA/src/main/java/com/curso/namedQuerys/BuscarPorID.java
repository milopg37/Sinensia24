package com.curso.namedQuerys;

import java.util.List;

import com.curso.dominio.Alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class BuscarPorID {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("alumno");
        EntityManager em = emf.createEntityManager();
        
        
        TypedQuery<Alumno> queryBuscarPorID = em.createNamedQuery("Alumno.buscarPorID", Alumno.class);
        
        String idBuscar = "5";
        queryBuscarPorID.setParameter("id", idBuscar);
        
        List<Alumno> listaAlumnos = queryBuscarPorID.getResultList();
        
        for (Alumno alumno : listaAlumnos) {
			System.out.println("Alumno con el ID a buscar: " + idBuscar);
			System.out.println(alumno);
		}

	}

}
