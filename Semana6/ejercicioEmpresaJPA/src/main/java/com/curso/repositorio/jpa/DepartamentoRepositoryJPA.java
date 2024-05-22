package com.curso.repositorio.jpa;

import java.util.List;

import com.curso.modelos.Departamento;
import com.curso.repositorio.DepartamentoRepository;

import jakarta.persistence.EntityManager;

public class DepartamentoRepositoryJPA implements DepartamentoRepository {
	
	private EntityManager entityManager;

	public Departamento encuentraUno(int id_dept) {
		return entityManager.find(Departamento.class, id_dept);
	}

	public List<Departamento> encuentraTodos() {
		return entityManager.createQuery("SELECT d FROM Departamento d", Departamento.class).getResultList();
	}

	public void guardar(Departamento departamento) {
		entityManager.persist(departamento);
	}

	public void eliminar(Departamento departamento) {
		entityManager.remove(departamento);
	}
}
