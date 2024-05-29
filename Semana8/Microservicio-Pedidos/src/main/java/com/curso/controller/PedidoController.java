package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.curso.model.Pedido;
import com.curso.service.PedidoServiceImpl;

@RestController
public class PedidoController {

	@Autowired
	PedidoServiceImpl servicio;
	
	/**
	 * Esto llama al microservicio de Productos
	 * @param pedido
	 * @return
	 */
	@PostMapping(value = "pedidos/nuevo", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> createPedido(@RequestBody Pedido pedido){
		return servicio.createPedido(pedido);
	}
	
	@GetMapping(value = "pedidos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> findAll(){
		return servicio.findAll();
	}
}
