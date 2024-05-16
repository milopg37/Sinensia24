package com.curso.consultas;

import jakarta.persistence.*;

public class NoticiaCRUD {

	static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("bdperiodico");
	static final EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

		System.out.println("- Crear Noticia -");
		createNoticia();

		System.out.println("- Leer Noticia -");
		readNoticia();

		System.out.println("- Actualizar Noticia -");
		updateNoticia();

		System.out.println("- Borrar Noticia -");
		deleteNoticia();
	}

	/**
	 * Crea una nueva noticia
	 */
	private static void createNoticia() {

	}
	
	/**
	 * Lee una noticia existente
	 */
	private static void readNoticia() {

	}
	
	/**
	 * Actualiza una noticia existente
	 */
	private static void updateNoticia() {

	}

	/**
	 * Borra una noticia existente
	 */
	private static void deleteNoticia() {

	}
}
