package com.curso.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.curso.models.Avion;


public interface AvionService {
		
		/**
		* Métodos CRUD
		*/
		Avion findAvion(String idAvion);
		List<Avion> addAvion(Avion avion);
		List<Avion> deleteAvion(String idAvion);
		void updateAvion(Avion avion, int nuevaCapacidad);
	 
		/**
		* Métodos de Query
		*/
		Integer getTotalHorasByMilitares();
		Integer getTotalCapacidadAerolinea(@Param("aerolinea") String aerolinea);
		List<Avion> findAllComercialesActivos();
		List<Avion> getAvionesByFabricante(@Param("fabricante") String fabricante);
}
