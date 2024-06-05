package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Hotel;

public interface HotelDao extends JpaRepository<Hotel, Integer> {

	/**
	 * JPQL Query
	 * Devuelve datos de un hotel a partir de su nombre
	 * Se mapea el parametro del metodo con el parametro de la query con @Param
	 */
	@Query("SELECT h FROM Hotel h WHERE h.nombre = :nombreBuscar")
	public Hotel findByNombre(@Param("nombreBuscar") String nombreBuscar);	
}
