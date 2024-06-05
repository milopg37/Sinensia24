package com.curso.model;

import java.util.Objects;

public class Hotel {

	private int idHotel;

	private String nombre;

	private String categoria;

	private Double precio;

	private boolean disponible;

	public Hotel() {
		super();
	}

	public Hotel(int idHotel) {
		super();
		this.idHotel = idHotel;
	}

	public Hotel(int idHotel, String nombre, String categoria, Double precio, boolean disponible) {
		super();
		this.idHotel = idHotel;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio
				+ ", disponible=" + disponible + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idHotel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return idHotel == other.idHotel;
	}
}
