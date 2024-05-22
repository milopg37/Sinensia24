package com.curso.repositorio.jpa;

import java.util.List;

import com.curso.modelos.Empleado;
import com.curso.repositorio.EmpleadoRepository;

import jakarta.persistence.EntityManager;

public class EmpleadoRepositoryJPA implements EmpleadoRepository {
	
	private EntityManager entityManager;

	public Empleado encuentraUno(int id_emp) {
		return entityManager.find(Empleado.class, id_emp);
	}

	public List<Empleado> encuentraTodos() {
		return entityManager.createQuery("SELECT e FROM Empleado e", Empleado.class).getResultList();
	}

	public void guardar(Empleado empleado) {
		entityManager.persist(empleado);
	}

	public void eliminar(Empleado empleado) {
		entityManager.remove(empleado);
	}
}
