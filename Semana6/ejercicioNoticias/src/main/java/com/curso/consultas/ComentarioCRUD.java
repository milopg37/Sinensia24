package com.curso.consultas;

import jakarta.persistence.*;

public class ComentarioCRUD {

	static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdperiodico");
	static final EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		System.out.println("- Crear Comentario -");
		createComentario();

		System.out.println("- Leer Comentario -");
		readComentario();

		System.out.println("- Actualizar Comentario -");
		updateComentario();

		System.out.println("- Borrar Comentario -");
		deleteComentario();
	}
	
	/**
	 * Crea un nuevo Comentario
	 */
	private static void createComentario() {

	}
	
	/**
	 * Lee un comentario existente
	 */
	private static void readComentario() {

	}
	
	/**
	 * Actualiza un comentario
	 */
	private static void updateComentario() {

	}
	
	/**
	 * Borra un comentario existente
	 */
	private static void deleteComentario() {

	}
}
