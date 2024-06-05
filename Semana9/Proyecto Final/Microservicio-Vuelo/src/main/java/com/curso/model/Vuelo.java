package com.curso.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "vuelos")
public class Vuelo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vuelo")
	private int idVuelo;

	@Column(name = "companhia")
	private String companhia;

	@Column(name = "fecha_vuelo")
	private LocalDate fechaVuelo;

	@Column(name = "precio")
	private Double precio;

	@Column(name = "plazas")
	private int plazas;

	public Vuelo() {
		super();
	}

	public Vuelo(int idVuelo) {
		super();
		this.idVuelo = idVuelo;
	}

	public Vuelo(int idVuelo, String companhia, LocalDate fechaVuelo, Double precio, int plazas) {
		super();
		this.idVuelo = idVuelo;
		this.companhia = companhia;
		this.fechaVuelo = fechaVuelo;
		this.precio = precio;
		this.plazas = plazas;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public LocalDate getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDate fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Vuelo [idVuelo=" + idVuelo + ", companhia=" + companhia + ", fechaVuelo=" + fechaVuelo + ", precio="
				+ precio + ", plazas=" + plazas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idVuelo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return idVuelo == other.idVuelo;
	}
}
