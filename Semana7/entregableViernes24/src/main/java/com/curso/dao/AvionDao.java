package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.models.Avion;


public interface AvionDao extends JpaRepository<Avion, String> {
	
	/**
	 * @Query
	 * Metodo
	 * Contar el número total de horas de vuelo acumuladas por los aviones militares:
	 */
	@Query("SELECT SUM(a.horasVuelo) AS total_horas_militares FROM Avion a WHERE a.tipoAvion = 'Militar'")
	Integer getTotalHorasByMilitares();
	
	
	/**
	 * @Query
	 * Metodo
	 * Obtener la capacidad total de pasajeros de todos los aviones de una aerolínea específica
	 */
	@Query("SELECT a.aerolinea, SUM(a.capacidad) AS capacidad_total_pasajeros FROM Avion a WHERE a.aerolinea = :aerolinea GROUP BY a.aerolinea")
	Integer getTotalCapacidadAerolinea(@Param("aerolinea") String aerolinea);
	
	
	/**
	 * @Query
	 * Metodo
	 * Consultar todos los aviones comerciales activos
	 */
	@Query("SELECT a FROM Avion a WHERE a.tipoAvion = 'Comercial' AND a.estado = 'Activo'")
	List<Avion> findAllComercialesActivos();
	
	
	/**
	 * @Query
	 * Metodo
     * Obtener aviones por fabricante
     */
    @Query("SELECT a FROM Avion a WHERE a.fabricante = :fabricante")
    List<Avion> getAvionesByFabricante(@Param("fabricante") String fabricante);
}
