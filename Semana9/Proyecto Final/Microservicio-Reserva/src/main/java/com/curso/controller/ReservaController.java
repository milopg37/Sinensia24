package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.curso.model.Reserva;
import com.curso.service.ReservaService;

@RestController
public class ReservaController {

	@Autowired
	ReservaService servicio;

	// Metodos CRUD
	
	/**
	 * Devuelve una lista con todas las reservas
	 * 
	 * @return
	 */
	@GetMapping(value = "reserva/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reserva> findAll() {
		return servicio.findAll();
	}
	

	/**
	 * Busca una reserva dado su ID y la devuelve
	 * 
	 * @param idReserva
	 * @return
	 */
	@GetMapping(value = "reserva/find/{idReserva}", produces = MediaType.APPLICATION_JSON_VALUE)
	Reserva findByID(@PathVariable("idReserva") int idReserva) {
		return servicio.findByID(idReserva);
	}

	/**
	 * Agrega una nueva reserva a la BD Devuelve lista actualizada
	 * 
	 * @param nuevaReserva
	 * @return
	 */
	@PostMapping(value = "reserva/nuevo", consumes = MediaType.APPLICATION_JSON_VALUE)
	List<Reserva> addReserva(@RequestBody Reserva nuevaReserva) {
		return servicio.addReserva(nuevaReserva);
	}

	/**
	 * Actualiza el nombre a la cual está una reserva Busca la reserva por ID
	 * Devuelve lista actualizada
	 * 
	 * @param idReserva
	 * @param nuevoCliente
	 * @return
	 */
	@PutMapping(value = "reserva/update/{idReserva}/{nuevoCliente}", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Reserva> updateReserva(@PathVariable("idReserva") int idReserva, @PathVariable("nuevoCliente") String nuevoCliente) {
		return servicio.updateReserva(idReserva, nuevoCliente);
	}

	/**
	 * Borra una reserva dado su ID Devuelve lista actualizada
	 * 
	 * @param idReserva
	 * @return
	 */
	@DeleteMapping(value = "reserva/delete/{idReserva}", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Reserva> deleteByID(@PathVariable("idReserva") int idReserva) {
		return servicio.deleteByID(idReserva);
	}

	// Metodo especificos

	/**
	 * Llama al controller de Hotel mediante un GET
	 * Devuelve las reservas existentes para el nombre del Hotel que tenemos como @Param
	 * 
	 * @param hotelABuscar
	 * @return
	 */
	@GetMapping(value = "reserva/reservaByHotel/{hotelABuscar}")
	List<Reserva> reservasPorHotel(@PathVariable("hotelABuscar") String hotelABuscar) {
		return servicio.reservasPorHotel(hotelABuscar);
	}

	/**
	 * LLama al controller de Vuelo mediante un POST
	 * Envia por @RequestBody una Reserva y el totalPersonas por @PathVariable
	 * Comprueba si quedan plazas en ese vuelo y si quedan las reserva
	 * Por último registra esa nueva reserva en la BD
	 * 
	 * @param reserva
	 * @param totalPersonas
	 */
	@PostMapping(value = "reserva/reservaByVuelo/{totalPersonas}", consumes = MediaType.APPLICATION_JSON_VALUE)
	void crearReservaPorVuelo(@RequestBody Reserva reserva, @PathVariable("totalPersonas") int totalPersonas) {
		servicio.crearReservaPorVuelo(reserva, totalPersonas);
	}
}
