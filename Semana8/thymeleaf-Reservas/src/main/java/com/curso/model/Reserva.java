package com.curso.model;

import java.util.Objects;

public class Reserva {

	private String idReserva;
	private String lugar;
	private int numHospedados;
	private String direccion;
	private String tipoVivienda;
	private int numDias;
	private double precioNoche;

	public Reserva() {
		super();
	}

	public Reserva(String idReserva) {
		super();
		this.idReserva = idReserva;
	}

	public Reserva(String idReserva, String lugar, int numHospedados, String direccion, String tipoVivienda,
			int numDias, double precioNoche) {
		super();
		this.idReserva = idReserva;
		this.lugar = lugar;
		this.numHospedados = numHospedados;
		this.direccion = direccion;
		this.tipoVivienda = tipoVivienda;
		this.numDias = numDias;
		this.precioNoche = precioNoche;
	}

	public String getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(String idReserva) {
		this.idReserva = idReserva;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getNumHospedados() {
		return numHospedados;
	}

	public void setNumHospedados(int numHospedados) {
		this.numHospedados = numHospedados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipoVivienda() {
		return tipoVivienda;
	}

	public void setTipoVivienda(String tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}

	public int getNumDias() {
		return numDias;
	}

	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	public double getPrecioNoche() {
		return precioNoche;
	}

	public void setPrecioNoche(double precioNoche) {
		this.precioNoche = precioNoche;
	}

	@Override
	public String toString() {
		return "Reserva [lugar=" + lugar + ", numHospedados=" + numHospedados + ", direccion=" + direccion
				+ ", tipoVivienda=" + tipoVivienda + ", numDias=" + numDias + ", precioNoche=" + precioNoche + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idReserva);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(idReserva, other.idReserva);
	}
}
