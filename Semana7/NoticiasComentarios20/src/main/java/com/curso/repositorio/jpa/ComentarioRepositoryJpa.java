package com.curso.repositorio.jpa;

import java.util.List;

import com.curso.modelos.Comentario;
import com.curso.repositorio.ComentarioRepository;

import jakarta.persistence.EntityManager;

public class ComentarioRepositoryJpa implements ComentarioRepository {
	
	private EntityManager entityManager;

	public Comentario findOne(int numero) {
		return entityManager.find(Comentario.class, numero);
	}

	public List<Comentario> findAll() {
		return entityManager.createQuery("SELECT c FROM Comentario c",Comentario.class).getResultList();
	}

	public void save(Comentario comment) {
		entityManager.persist(comment);
	}

	public void delete(Comentario coment) {
		entityManager.remove(coment);
	}
}
