package com.curso.service;

import java.util.List;

import com.curso.model.Pedido;

public interface PedidoService {
	
	/**
	 * CRUD
	 */
	Pedido findPedido(int codPedido);
	List<Pedido> deletePedido(int codPedido);
	List<Pedido> updatePedido(int codPedido, int unidades);
	List<Pedido> createPedido(Pedido pedido);
	List<Pedido> findAll();
}
