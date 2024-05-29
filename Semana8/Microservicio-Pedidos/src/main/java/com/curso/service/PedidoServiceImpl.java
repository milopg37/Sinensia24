package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.PedidoDao;
import com.curso.model.Pedido;

@Service
public class PedidoServiceImpl implements PedidoService {
	
	@Autowired
	PedidoDao dao;
	
	@Autowired
	RestTemplate template;
	
	 final String BASE_URL = "http://localhost:3306/";

	/**
	 * Encuentra un pedido por ID y lo devuelve
	 * Si no, devuelve nulo
	 */
	@Override
	public Pedido findPedido(int codPedido) {
		return dao.findById(codPedido).orElse(null);
	}

	/**
	 * Borrar un pedido por ID, devuelve lista actualizada
	 */
	@Override
	public List<Pedido> deletePedido(int codPedido) {
		dao.deleteById(codPedido);
		return dao.findAll();
	}

	/**
	 * Actualiza unidades de pedido, devuelve lista actualizada
	 */
	@Override
	public List<Pedido> updatePedido(int codPedido, int unidades) {
		Pedido pedido = dao.findById(codPedido).orElse(null);
		pedido.setUnidades(unidades);
		dao.save(pedido);
		return dao.findAll();
	}

	/**
	 * Crea un pedido nuevo, devuelve lista actualizada
	 */
	@Override
	public List<Pedido> createPedido(Pedido pedido) {
		String url = BASE_URL + "productos/stock/{codProducto},{restaStock}";
		dao.save(pedido);
		return dao.findAll();
	}

	/**
	 * Devuelve todos los pedidos
	 */
	@Override
	public List<Pedido> findAll() {
		return dao.findAll();
	}
}
