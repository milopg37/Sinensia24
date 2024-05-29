package com.curso.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cod_producto")
	private int codProducto;
	private String nombre;
	private int stock;
	private double precio;
	private int pedido;

	public Producto() {
		super();
	}

	public Producto(int codProducto) {
		super();
		this.codProducto = codProducto;
	}

	public Producto(int codProducto, String nombre, int stock, double precio, int pedido) {
		super();
		this.codProducto = codProducto;
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
		this.pedido = pedido;
	}

	public int getCodProducto() {
		return codProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPedido() {
		return pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codProducto);
	}

	@Override
	public String toString() {
		return "Producto [codProducto=" + codProducto + ", nombre=" + nombre + ", stock=" + stock + ", precio=" + precio
				+ ", pedido=" + pedido + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return codProducto == other.codProducto;
	}
}
