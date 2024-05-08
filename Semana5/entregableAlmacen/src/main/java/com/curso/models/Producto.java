package com.curso.models;

public class Producto {

	private String nombre;
	private SeccionEnum seccion;
	private double precio;
	private int stock;
	
	
	public Producto() {
		super();
	}


	public Producto(String nombre, SeccionEnum seccion, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.seccion = seccion;
		this.precio = precio;
		this.stock = stock;
	}


	public SeccionEnum getSeccion() {
		return seccion;
	}


	public void setSeccion(SeccionEnum seccion) {
		this.seccion = seccion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", seccion=" + seccion + ", precio=" + precio + ", stock=" + stock + "]";
	}
	
	
	
}
