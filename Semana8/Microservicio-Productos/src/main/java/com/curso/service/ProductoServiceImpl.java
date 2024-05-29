package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.ProductoDao;
import com.curso.model.Producto;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private ProductoDao dao;

	/**
	 * Busca y devuelve un producto, dado su ID
	 * Si no lo encuentra devuelve nulo
	 */
	@Override
	public Producto findProducto(int codProducto) {
		return dao.findById(codProducto).orElse(null);
	}
	
	/**
	 * Borra un producto dado su ID
	 * Devuelve lista actualizada
	 */
	@Override
	public List<Producto> deleteProducto(int codProducto) {
		dao.deleteById(codProducto);
		return dao.findAll();
	}
	
	/**
	 * Actualiza un producto, devuelve lista actualizada
	 */
	@Override
	public List<Producto> updateProducto(int codProducto, double nuevoPrecio) {
		Producto producto = dao.findById(codProducto).orElse(null);
		producto.setPrecio(nuevoPrecio);
		dao.save(producto);
		return dao.findAll();
	}

	/**
	 * Crea un nuevo producto y devuelve lista actualizada
	 */
	@Override
	public List<Producto> createProducto(Producto producto) {
		dao.save(producto);
		return dao.findAll();
	}

	/**
	 * Devuelve todos los productos
	 */
	@Override
	public List<Producto> findAll() {
		return dao.findAll();
	}

	/**
	 * Actualiza el stock de un Producto
	 * dado su ID resta unidades
	 */
	@Override
	public void actualizarStock(int codProducto, int restarStock) {
		dao.actualizarStock(codProducto, restarStock);
	}

	/**
	 * Obtiene el precio de un producto dado su ID
	 */
	@Override
	public int obtenerPrecio(int codProducto) {
		return dao.obtenerPrecio(codProducto);
	}
}
