package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.curso.model.Libro;

public interface LibroDao extends JpaRepository<Libro, Integer> { //T = Entidad ID = tipo de PK
	
	/**
	 * @Query
	 * metodo
	 * Si la query la escribimos en SQL ponemos native = true
	 */
	
}
