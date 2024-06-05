package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.curso.model.Vuelo;
import com.curso.service.VueloService;

@RestController
public class VueloController {

	@Autowired
	VueloService servicio;

	// Metodos CRUD

	/**
	 * Busca un vuelo por ID y lo devuelve
	 * 
	 * @param idVuelo
	 * @return
	 */
	@GetMapping(value = "vuelo/find/{idVuelo}",produces = MediaType.APPLICATION_JSON_VALUE)
	Vuelo findByID(@PathVariable("idVuelo") int idVuelo) {
		return servicio.findByID(idVuelo);
	}

	/**
	 * Busca un vuelo por ID Actualiza su capacidad maxima de plazas
	 * Lo guarda y devuelve lista actualizada
	 * 
	 * @param idVuelo
	 * @param nuevoMaxPlazas
	 * @return
	 */
	@PutMapping(value = "vuelo/update/{idVuelo}/{nuevoMaxPlazas}", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Vuelo> updateVuelo(@PathVariable("idVuelo") int idVuelo, @PathVariable("nuevoMaxPlazas") int nuevoMaxPlazas) {
		return servicio.updateVuelo(idVuelo, nuevoMaxPlazas);
	}

	/**
	 * Borra un vuelo dado su ID Devuelve lista actualizada
	 * 
	 * @param idVuelo
	 * @return
	 */
	@DeleteMapping(value = "vuelo/delete/{idVuelo}", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Vuelo> deleteVuelo(@PathVariable("idVuelo") int idVuelo) {
		return servicio.deleteVuelo(idVuelo);
	}

	/**
	 * Agrega un nuevo vuelo a la BD Devuelve lista actualizada
	 * El vuelo se envia desde el RequestBody
	 * 
	 * @param vuelo
	 * @return
	 */
	@PostMapping(value = "vuelo/nuevo", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Vuelo> addVuelo(@RequestBody Vuelo vuelo) {
		return servicio.addVuelo(vuelo);
	}

	// Metodos especificos

	/**
	 * Comprueba que vuelos tienen el num de plazas solicitadas
	 * Devuelve una lista de los que cumplan esa condicion
	 * 
	 * @param plazasSolicitadas
	 * @return
	 */
	@GetMapping(value = "vuelo/check/{plazasSolicitadas}", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Vuelo> listarVuelosPlazasSuficientes(@PathVariable("plazasSolicitadas") int plazasSolicitadas) {
		return servicio.listarVuelosPlazasSuficientes(plazasSolicitadas);
	}

	/**
	 * Reserva el num de plazas solicitadas al vuelo, dado su ID
	 * Devuelve el vuelo con las plazas restadas
	 * Se realiza con una query JPQL -> @See DAO
	 * 
	 * @param idVuelo
	 * @param plazasAReservar
	 * @return
	 */
	@PutMapping(value = "vuelo/reserva/{idVuelo}/{plazasAReservar}")
	void vueloReservado(@PathVariable("idVuelo") int idVuelo, @PathVariable("plazasAReservar") int plazasAReservar) {
		servicio.vueloReservado(idVuelo, plazasAReservar);
	}
}
