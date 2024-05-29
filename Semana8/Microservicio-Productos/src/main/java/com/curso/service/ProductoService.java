package com.curso.service;

import java.util.List;


import com.curso.model.Producto;

public interface ProductoService {
	
	/**
	 * Métodos CRUD
	 */
	Producto findProducto(int codProducto);
	List<Producto> deleteProducto(int codProducto);
	List<Producto> updateProducto(int codProducto, double nuevoPrecio);
	List<Producto> createProducto(Producto producto);
	List<Producto> findAll();
	
	/**
	 * Metodos de Querys
	 */
	void actualizarStock(int codProducto, int restarStock);
	int obtenerPrecio(int codProducto);
}
