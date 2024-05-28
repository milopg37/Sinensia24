package com.curso.models;

import java.util.Objects;

public class Formacion {

	private String curso;
	private int asignaturas;
	private double precio;

	public Formacion() {
		super();
	}

	public Formacion(String curso) {
		super();
		this.curso = curso;
	}

	public Formacion(String curso, int asignaturas, double precio) {
		super();
		this.curso = curso;
		this.asignaturas = asignaturas;
		this.precio = precio;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(int asignaturas) {
		this.asignaturas = asignaturas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Formacion [curso=" + curso + ", asignaturas=" + asignaturas + ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(curso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Formacion other = (Formacion) obj;
		return Objects.equals(curso, other.curso);
	}

}
