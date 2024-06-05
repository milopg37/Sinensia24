package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.curso.model.Hotel;
import com.curso.service.HotelService;

@RestController
public class HotelController {

	@Autowired
	HotelService servicio;
	
	//Metodos CRUD
	
	/**
	 * Busca un hotel dado su ID y devuelve todos sus datos
	 * 
	 * @param idHotel
	 * @return
	 */
	@GetMapping(value = "hotel/{idHotel}", produces = MediaType.APPLICATION_JSON_VALUE)
	Hotel findHotel(@PathVariable("idHotel") int idHotel) {
		return servicio.findHotel(idHotel);
	}
	
	/**
	 * Devuelve lista de todos los hoteles disponibles
	 * 
	 * @return
	 */
	@GetMapping(value = "hotel/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Hotel> findDisponibles(){
		return servicio.findDisponibles();
	}
	
	/**
	 * Borra un hotel dado por ID
	 * Devuelve lista actualizada
	 * 
	 * @param idHotel
	 * @return
	 */
	@DeleteMapping(value = "hotel/delete/{idHotel}", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Hotel> deleteHotel(@PathVariable("idHotel") int idHotel){
		return servicio.deleteHotel(idHotel);
	}
	
	/**
	 * Busca un hotel dado por ID
	 * Modifica su precio, lo actualiza y devuelve la lista
	 * 
	 * @param idHotel
	 * @param nuevoprecio
	 * @return
	 */
	@PutMapping(value = "hotel/edit/{idHotel}/{nuevoPrecio}", produces = MediaType.APPLICATION_JSON_VALUE)
	List<Hotel> updateHotel(@PathVariable("idHotel") int idHotel, @PathVariable("nuevoPrecio") Double nuevoprecio){
		return servicio.updateHotel(idHotel, nuevoprecio);
	}
	
	/**
	 * Agrega un nuevo hotel a la BD y Devuelve lista actualizada
	 * 
	 * @param nuevoHotel
	 * @return
	 */
	@PostMapping(value = "hotel/nuevo", consumes = MediaType.APPLICATION_JSON_VALUE)
	List<Hotel> addHotel(@RequestBody Hotel nuevoHotel){
		return servicio.addHotel(nuevoHotel);
	}
	
	//Metodos de Query
	
	/**
	 * Metodo específico
	 * Devuelve los datos de un Hotel dado su nombre
	 * 
	 * @param nombreBuscar
	 * @return
	 */
	@GetMapping(value = "hotel/buscar/{nombreBuscar}", produces = MediaType.APPLICATION_JSON_VALUE)
	Hotel findByNombre(@PathVariable("nombreBuscar") String nombreBuscar) {
		return servicio.findByNombre(nombreBuscar);
	}
}
