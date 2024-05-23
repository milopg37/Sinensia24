package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.models.Curso;

import jakarta.transaction.Transactional;

public interface CursoDao extends JpaRepository<Curso, String> {
	
	/**
	 * @Query
	 * Metodo
	 * Realiza una consulta a la BD devolviendo los cursos que se encuentren
	 * en ese rango de precios dado
	 */
	@Transactional
	@Query("SELECT c FROM Curso c WHERE c.precio BETWEEN :minPrecio AND :maxPrecio")
	public List<Curso> getCursosEntrePrecios(@Param("minPrecio") Double minPrecio, @Param("maxPrecio") Double maxPrecio);
	
	

}
