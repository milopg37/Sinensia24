package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.curso.models.Avion;
import com.curso.service.AvionServiceImpl;

@RestController
public class AvionController {

	@Autowired
	AvionServiceImpl servicio;
	
	/**
	 * Métodos CRUD
	 */
	@GetMapping(value = "avion/{idAvion}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Avion findAvion(@PathVariable String idAvion) {
		return servicio.findAvion(idAvion);
	}
	
	@PostMapping(value = "avion", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Avion> addAvion(@RequestBody Avion avion){
		return servicio.addAvion(avion);
	}
	
	@DeleteMapping(value = "avion/{idAvion}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Avion> deleteaAvion(@PathVariable("idAvion") String idAvion) {
		return servicio.deleteAvion(idAvion);
	}
	
	@PutMapping(value = "avion/{nuevaCapacidad}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateAvion(@RequestBody Avion avion, @PathVariable("nuevaCapacidad") int nuevaCapacidad) {
		servicio.updateAvion(avion, nuevaCapacidad);
	}
	
	
	/**
	 * Métodos de Query
	 */
	@GetMapping(value = "avion/horasMilitares", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getTotalHorasByMilitares() {
		return servicio.getTotalHorasByMilitares() + "";
	}
	
	@GetMapping(value = "avion/capacidadAerolinea/{aerolinea}", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getTotalCapacidadAerolinea(@PathVariable("aerolinea") String aerolinea) {
		return servicio.getTotalCapacidadAerolinea(aerolinea) + "";
	}
	
	@GetMapping(value = "avion/comercialesActivos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Avion> findAllComercialesActivos() {
		return servicio.findAllComercialesActivos();
	}
	
	@GetMapping(value = "avion/avionesPorFabricante/{fabricante}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Avion> getAvionesByFabricante(@PathVariable("fabricante") String fabricante){
		return servicio.getAvionesByFabricante(fabricante);
	}
}
