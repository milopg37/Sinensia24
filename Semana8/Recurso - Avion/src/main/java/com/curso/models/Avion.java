package com.curso.models;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table (name = "aviones")
public class Avion implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name = "id_avion")
	private String idAvion;
	private String modelo;
	private String fabricante;
	@Column (name = "numero_serie")
	private String numeroSerie;
	@Column (name = "capacidad_pasajeros")
	private int capacidad;
	@Column (name = "tipo_avion")
	private String tipo;
	private String estado;
	@Column (name = "horas_vuelo")
	private int horasVuelo;
	private String aerolinea;
	
	public Avion() {
		super();
	}


	public Avion(String idAvion) {
		super();
		this.idAvion = idAvion;
	}


	public Avion(String idAvion, String modelo, String fabricante, String numeroSerie, int capacidad, String tipo,
			String estado, int horasVuelo, String aerolinea) {
		super();
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.numeroSerie = numeroSerie;
		this.capacidad = capacidad;
		this.tipo = tipo;
		this.estado = estado;
		this.horasVuelo = horasVuelo;
		this.aerolinea = aerolinea;
	}


	public String getIdAvion() {
		return idAvion;
	}


	public void setIdAvion(String idAvion) {
		this.idAvion = idAvion;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public String getNumeroSerie() {
		return numeroSerie;
	}


	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public int getHorasVuelo() {
		return horasVuelo;
	}


	public void setHorasVuelo(int horasVuelo) {
		this.horasVuelo = horasVuelo;
	}


	public String getAerolinea() {
		return aerolinea;
	}


	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}


	@Override
	public String toString() {
		return "Avion [idAvion=" + idAvion + ", modelo=" + modelo + ", fabricante=" + fabricante + ", numeroSerie="
				+ numeroSerie + ", capacidad=" + capacidad + ", tipo=" + tipo + ", estado=" + estado + ", horasVuelo="
				+ horasVuelo + ", aerolinea=" + aerolinea + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(idAvion);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avion other = (Avion) obj;
		return Objects.equals(idAvion, other.idAvion);
	}
}
