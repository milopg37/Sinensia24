package com.curso.test;

import org.junit.jupiter.api.*;

import jakarta.persistence.*;

public class JpaUnitTest {
	
	static EntityManagerFactory emf;
	static EntityManager em;
	
	@BeforeAll
	static void setupStaticTest() {
		Persistence.generateSchema("noticias", null);
		emf = Persistence.createEntityManagerFactory("noticias");
	}
	
	@BeforeEach
	void setupTest() {
		em = emf.createEntityManager();
	}
	
	@AfterEach
	void downTest() {
		em.clear();
		em.close();
	}
	
	@AfterAll
	void downStaticTest() {
		emf.close();
	}
}
