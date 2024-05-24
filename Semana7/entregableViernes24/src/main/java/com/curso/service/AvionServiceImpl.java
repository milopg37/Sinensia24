package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.AvionDao;
import com.curso.models.Avion;

@Service
public class AvionServiceImpl implements AvionService {
	
	@Autowired
	AvionDao dao;
	
	/**
	 * Devuelve un avion dado su ID
	 */
	@Override
	public Avion findAvion(String idAvion) {
		return dao.findById(idAvion).orElse(null);
	}
	
	/**
	 * Agrega un nuevo avion
	 * Devuelve lista actualizada
	 */
	@Override
	public List<Avion> addAvion(Avion avion) {
		dao.save(avion);
		return dao.findAll();
	}
	
	/**
	 * Borra un avion dado su ID
	 * Devuelve lista actualizada
	 */
	@Override
	public List<Avion> deleteAvion(String idAvion) {
		dao.deleteById(idAvion);
		return dao.findAll();
	}
	
	/**
	 * Dado un avion, actualiza su campo capacidad
	 */
	@Override
	public void updateAvion(Avion avion, int nuevaCapacidad) {
		avion.setCapacidad(nuevaCapacidad);
		dao.save(avion);
	}

	/**
	 * Devuelve nº de horas de vuelo hechas por aviones de tipo militar
	 */
	@Override
	public Integer getTotalHorasByMilitares() {
		return dao.getTotalHorasByMilitares();
	}

	/**
	 * Devuelve un nº con la capacidad total de todos los aviones
	 * que pertenecen a una aerolinea
	 */
	@Override
	public Integer getTotalCapacidadAerolinea(String aerolinea) {
		return dao.getTotalCapacidadAerolinea(aerolinea);
	}
	
	/**
	 * Devuelve una lista de aviones que sean de tipo comercial
	 * y su estado sea activo
	 */
	@Override
	public List<Avion> findAllComercialesActivos() {
		return dao.findAllComercialesActivos();
	}

	/**
	 * Devuelve la lista de aviones que pertenecen a un fabricante dado
	 */
	@Override
	public List<Avion> getAvionesByFabricante(String fabricante) {
		return dao.getAvionesByFabricante(fabricante);
	}
}
