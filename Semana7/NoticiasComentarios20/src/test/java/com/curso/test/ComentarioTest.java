package com.curso.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import com.curso.modelos.Comentario;
import com.curso.modelos.Noticia;


class ComentarioTest extends JpaUnitTest{
	
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
	void seleccionarComentarioInicialTest() {
		Comentario comentario = em.find(Comentario.class, 1);
		assertEquals("Manolito", comentario.getAutor());
	}
	
	@Test
	void seleccionarComentarioDeNoticiaTest() {
		
		Noticia noticia = em.find(Noticia.class, "Por fin Lunes");
		Comentario comentario = noticia.getListaComentarios().get(0);
		assertEquals("Manolito", comentario.getAutor());
	}
	
	
}
