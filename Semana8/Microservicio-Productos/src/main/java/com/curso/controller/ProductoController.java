package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.curso.model.Producto;
import com.curso.service.ProductoServiceImpl;

@RestController
public class ProductoController {

	@Autowired
	ProductoServiceImpl servicio;
	
	@GetMapping(value = "productos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> findAll(){
		return servicio.findAll();
	}
	
	@PutMapping(value = "productos/stock/{codProducto},{restaStock}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void actualizarStock(@PathVariable("codProducto") int codProducto, @PathVariable("restaStock") int restaStock) {
		servicio.actualizarStock(codProducto, restaStock);
	}
	
	@GetMapping(value = "productos/precio/{codProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public int obtenerPrecio(@PathVariable("codProducto") int codProducto) {
		return servicio.obtenerPrecio(codProducto);
	}
}
