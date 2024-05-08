package com.curso.services;

import java.util.ArrayList;
import java.util.Iterator;
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
	 * La seccion es ingresada por usuario
	 * @param seccionProducto
	 * @return
	 */
	public static List<Producto> getListBySeccion(SeccionEnum seccionProducto) {
	
		return listaProductos.stream().filter(producto->producto.getSeccion().equals(seccionProducto)).toList();
	}
	
	/**
	 *Elimina un producto de la lista por nombre
	 *El nombre es dado por el usuario
	 *Recorro lista, busco nombre, y si encuentro borro producto
	 */
	public static void eliminarProductoByName(String nombreABuscar) {
		
		Iterator<Producto> iterador = listaProductos.iterator();
		
	    while (iterador.hasNext()) {
	        Producto producto = iterador.next();
	        if (producto.getNombre().equalsIgnoreCase(nombreABuscar)) {
	            iterador.remove();
	        }
	    }
	}
	
	/**
	 * Recibe como parametro un nombre de producto y nuevo precio a setear
	 * Nombre y nuevo precio es dado por el usuario
	 */
	public static void modificarPrecioProducto(String nombreABuscar, double nuevoPrecio) {
		
		Iterator<Producto> iterador = listaProductos.iterator();
		
	    while (iterador.hasNext()) {
	        Producto producto = iterador.next();
	        if (producto.getNombre().equalsIgnoreCase(nombreABuscar)) {
	        	producto.setPrecio(nuevoPrecio);
	        }
	    }
	}
	
}
