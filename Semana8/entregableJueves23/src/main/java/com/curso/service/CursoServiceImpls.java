package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursoDao;
import com.curso.models.Curso;

import jakarta.transaction.Transactional;

@Service
public class CursoServiceImpls implements CursoService {
	
	@Autowired
	CursoDao dao;

	/**
	 * Busca y devuelve un curso por ID
	 */
	@Override
	public Curso findCurso(String codCurso) {
		
		return dao.findById(codCurso).orElse(null);
	}

	/**
	 * Recibe 2 precios como rango
	 * Devuelve una lista de cursos cuyo precio
	 * se encuentre en ese rango
	 */
	@Override
	public List<Curso> getCursosEntrePrecios(double minPrecio, double maxPrecio) {
		
		return dao.getCursosEntrePrecios(minPrecio, maxPrecio);
	}

	/**
	 * Agrega un nuevo curso
	 * Después devuelve la lista actualizada
	 */
	@Override
	public List<Curso> altaCurso(Curso curso) {
		dao.save(curso);
		return dao.findAll();
	}

	/**
	 * Borra curso buscando por ID
	 * Después devuelve la lista actualizada
	 */
	@Transactional
	@Override
	public List<Curso> deleteCurso(String codCurso) {
		dao.deleteById(codCurso);;
		return dao.findAll();
	}

	/**
	 *Actualiza el curso en la BD 
	 */
	@Override
	public void updateHorasCurso(Curso curso, int nuevaDuracion) {
		curso.setDuracion(nuevaDuracion);
		dao.save(curso);
	}

	/**
	 * Devuelve una lista con todos los cursos
	 */
	@Override
	public List<Curso> findAll() {
		return dao.findAll();
	}
}
