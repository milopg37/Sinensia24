package com.curso.model;

import java.time.LocalDate;
import java.util.Objects;


public class Vuelo {

	private int idVuelo;

	private String companhia;

	private LocalDate fechaVuelo;

	private Double precio;

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
