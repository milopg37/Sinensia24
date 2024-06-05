package com.curso.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.curso.model.Vuelo;

public interface VueloService {
	
	/**
	 * Metodos CRUD
	 */
	Vuelo findByID(int idVuelo);//Get
	List<Vuelo> updateVuelo(int idVuelo, int nuevoMaxPlazas);//Put
	List<Vuelo> deleteVuelo(int idVuelo);//Delete
	List<Vuelo> addVuelo(Vuelo vuelo);//Post
	
	/**
	 * Metodos Especificos
	 */
	List<Vuelo> listarVuelosPlazasSuficientes(int plazasSolicitadas);//Get
	void vueloReservado(@Param("idVuelo") int idVuelo, @Param("plazasAReservar") int plazasAReservar);//Patch
}
