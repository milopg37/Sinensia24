package com.curso.services;

import java.util.ArrayList;
import java.util.List;

import com.curso.models.Producto;
import com.curso.models.SeccionEnum;

public class ProductoService {
	static List<Producto> listaProductos = new ArrayList<>();
	
	/**
	 * Añade producto a la lista
	 * @param producto
	 */
	public static void addProducto(Producto producto) {
		
		listaProductos.add(producto);
	}
	
	/**
	 * Devuelve la lista
	 * @return
	 */
	public static List<Producto> getList(){
		
		return listaProductos;
	}

	/**
	 * Devuelve la lista filtrada por seccion pasada por param
	 * @param seccionProducto
	 * @return
	 */
	public static List<Producto> getListBySeccion(SeccionEnum seccionProducto) {
		
		return listaProductos.stream().filter(producto->producto.getSeccion().equals(seccionProducto)).toList();
	}
	
	/**
	 *Elimina un producto de la lista por precio 
	 */
	public static void eliminarProductoByPrecio() {
		
	}
	
}
