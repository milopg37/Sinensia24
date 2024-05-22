package com.curso.repositorio.jpa;

import java.util.List;

import com.curso.modelos.Noticia;
import com.curso.repositorio.NoticiaRepository;

import jakarta.persistence.EntityManager;

public class NoticiaRepositoryJpa implements NoticiaRepository {

	private EntityManager entityManager;
	
	public Noticia findOne(String titulo) {
		return entityManager.find(Noticia.class, titulo);
	}

	public List<Noticia> findAll() {
		return entityManager.createQuery("SELECT n FROM Noticia n", Noticia.class).getResultList();
	}

	public void save(Noticia noticia) {
		entityManager.persist(noticia);
	}

	public void delete(Noticia noticia) {
		entityManager.remove(noticia);
	}
}
