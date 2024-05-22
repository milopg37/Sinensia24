package com.curso.modelos;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table (name = "departamentos")
public class Departamento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id_dept;
	private String nombre;
	private String localidad;
	
	// Relación uno a muchos con Empleado
    @OneToMany(mappedBy = "departamento")
    private List<Empleado> empleados;
	
	public Departamento() {
		super();
	}
	
	public Departamento(int idDepartamento) {
		super();
		this.id_dept = idDepartamento;
	}
	
	
	public Departamento(int idDepartamento, String nombre, String localidad) {
		super();
		this.id_dept = idDepartamento;
		this.nombre = nombre;
		this.localidad = localidad;
	}

	public int getIdDepartamento() {
		return id_dept;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.id_dept = idDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}


	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	@Override
	public String toString() {
		return "Departamento [id_dept=" + id_dept + ", nombre=" + nombre + ", localidad=" + localidad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_dept;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		if (id_dept != other.id_dept)
			return false;
		return true;
	}
}
