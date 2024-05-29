package com.curso.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cod_pedido")
	private int codPedido;
	private String producto;
	private int unidades;
	@Column(name = "precio_total")
	private double precioTotal;

	public Pedido() {
		super();
	}

	public Pedido(int codPedido) {
		super();
		this.codPedido = codPedido;
	}

	public Pedido(int codPedido, String producto, int unidades, double precioTotal) {
		super();
		this.codPedido = codPedido;
		this.producto = producto;
		this.unidades = unidades;
		this.precioTotal = precioTotal;
	}

	public int getCodPedido() {
		return codPedido;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	@Override
	public String toString() {
		return "Pedido [codPedido=" + codPedido + ", producto=" + producto + ", unidades=" + unidades + ", precioTotal="
				+ precioTotal + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codPedido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return codPedido == other.codPedido;
	}
}
