package com.curso.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

import com.curso.modelos.Noticia;

class NoticiaTest extends JpaUnitTest{
	
	/*
	EntityManagerFactory emf;
	EntityManager em;
	
	@BeforeEach
	public void iniciar() {
		Persistence.generateSchema("noticias", null);
		emf = Persistence.createEntityManagerFactory("noticias");
		em = emf.createEntityManager();
	}*/
	
	
	@Test
	void entityManagerFactoryTest() {
		assertNotNull(emf);
	}
	
	@Test
	void entityManagerTest() {
		assertNotNull(em);
	}
	

	@Test
	void seleccionarNoticiaInicialTest() {
		Noticia noticia = em.find(Noticia.class, "Por fin Lunes");
		assertEquals("Camilo", noticia.getAutor());
	}
	
	@Test
	void borrarNoticiaInicialTest() {
		Noticia noticia = em.find(Noticia.class, "Por fin Lunes");
		em.getTransaction().begin();
		
		em.remove(noticia);
		
		em.getTransaction().commit();
		Noticia sinNoticia = em.find(Noticia.class, "Por fin Lunes");
		assertNull(sinNoticia);
	}


	@Test
	void insertarNoticiaTest() {
		em.getTransaction().begin();
		
		Noticia nuevaNoticia = new Noticia("Nueva","Autor",LocalDate.now());
		em.persist(nuevaNoticia);
		em.getTransaction().commit();
		Noticia noticiaInsertada = em.find(Noticia.class, "Nueva");
		assertEquals("Nueva", noticiaInsertada.getTitulo());
		
	}
}
