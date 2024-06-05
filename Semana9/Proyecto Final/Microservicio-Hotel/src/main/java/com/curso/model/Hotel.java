package com.curso.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "hoteles")
public class Hotel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_hotel")
	private int idHotel;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "categoria")
	private String categoria;

	@Column(name = "precio")
	private Double precio;

	@Column(name = "disponible")
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

	public static long getSerialversionuid() {
		return serialVersionUID;
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
