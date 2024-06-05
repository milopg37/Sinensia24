package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.curso.model.Vuelo;

public interface VueloDao extends JpaRepository<Vuelo, Integer> {

	/**
	 * Query JPQL
	 * Reserva el num de plazas solicitadas al vuelo, dado su ID
	 * Se mapean los parametros del metodo con los parametros de la query con @Param
	 */
	@Modifying
	@Transactional
	@Query("UPDATE Vuelo v SET v.plazas = v.plazas - :plazasAReservar WHERE v.idVuelo = :idVuelo")
	void vueloReservado(@Param("idVuelo") int idVuelo, @Param("plazasAReservar") int plazasAReservar);
}
