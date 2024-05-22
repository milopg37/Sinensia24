package com.curso.modelos;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table (name = "empleados")
public class Empleado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id_emp;
	private String nombre;
	private Date fecha;
	private double sueldo;
	
	// Relación muchos a uno con Departamento
    @ManyToOne
    @JoinColumn(name = "id_dept")
    private Departamento departamento;
	
	public Empleado() {
		super();
	}
	

	public Empleado(int idEmpleado) {
		super();
		this.id_emp = idEmpleado;
	}


	public Empleado(int idEmpleado, String nombre, Date fecha, double sueldo) {
		super();
		this.id_emp = idEmpleado;
		this.nombre = nombre;
		this.fecha = fecha;
		this.sueldo = sueldo;
	}


	public int getIdEmpleado() {
		return id_emp;
	}


	public void setIdEmpleado(int idEmpleado) {
		this.id_emp = idEmpleado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	@Override
	public String toString() {
		return "Empleado [id_emp=" + id_emp + ", nombre=" + nombre + ", fecha=" + fecha + ", sueldo=" + sueldo + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_emp;
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
		Empleado other = (Empleado) obj;
		if (id_emp != other.id_emp)
			return false;
		return true;
	}
}
