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
	
	/**
	 * Implementando el service, recibe un JSON de todos los Productos
	 * @return
	 */
	@GetMapping(value = "productos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> findAll(){
		return servicio.findAll();
	}
	
	/**
	 * Implementando el service, se envia por URl un código de producto y una cantidad
	 * a restar del stock de ese producto
	 * @param codProducto
	 * @param restaStock
	 */
	@PutMapping(value = "productos/stock/{codProducto},{restaStock}")
	public void actualizarStock(@PathVariable("codProducto") int codProducto, @PathVariable("restaStock") int restaStock) {
		servicio.actualizarStock(codProducto, restaStock);
	}
	
	/**
	 * Implementando el service, se le pasa un ID por URL y devuelve el precio unitario de ese producto
	 * @param codProducto
	 * @return
	 */
	@GetMapping(value = "productos/precio/{codProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public double obtenerPrecio(@PathVariable("codProducto") int codProducto) {
		return servicio.obtenerPrecio(codProducto);
	}
	
	/**
	 * Implementando el service, busca un producto por ID en URL y lo devuelve
	 * @param codProducto
	 * @return
	 */
	@GetMapping(value = "productos/{codProducto}")
	public Producto findProducto(@PathVariable("codProducto") int codProducto) {
		return servicio.findProducto(codProducto);
	}
}
