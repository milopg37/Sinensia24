package com.curso.service;

import java.util.List;

import com.curso.model.Reserva;

public interface ReservaService {
	
	/**
	 * Metodos CRUD
	 */
	List<Reserva> findAll();//Get
	Reserva findByID(int idReserva);//Get
	List<Reserva> addReserva(Reserva nuevaReserva);//Post
	List<Reserva> updateReserva(int idReserva, String nuevoCliente);//Put
	List<Reserva> deleteByID(int idReserva);//Delete
	
	
	/**
	 * Metodos especificos
	 */
	List<Reserva> reservasPorHotel(String hotelABuscar);//Get
	void crearReservaPorVuelo(Reserva reserva, int totalPersonas);//Post
}
