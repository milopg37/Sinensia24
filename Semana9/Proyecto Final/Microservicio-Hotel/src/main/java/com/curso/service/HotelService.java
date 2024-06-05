package com.curso.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.curso.model.Hotel;

public interface HotelService {

	/**
	 * Métodos CRUD
	 */
	Hotel findHotel(int idHotel);//Get
	List<Hotel> findDisponibles(); //Get
	List<Hotel> deleteHotel(int idHotel);//Delete
	List<Hotel> updateHotel(int idHotel, Double nuevoprecio);//Put
	List<Hotel> addHotel(Hotel nuevoHotel); //Post
	
	/**
	 * Métodos específicos
	 */
	Hotel findByNombre(@Param("nombreBuscar") String nombreBuscar);
}
