package com.curso.dominio;

import jakarta.persistence.*;

@Entity
@Table(name = "alumnos")
@NamedQueries({
    @NamedQuery(name = "Alumno.buscarTodos", query = "SELECT a FROM Alumno a"),
    @NamedQuery(name = "Alumno.buscarPorID", query = "SELECT a FROM Alumno a WHERE a.id = :id"),
    @NamedQuery(name = "Alumno.buscarPorNombre", query = "SELECT a FROM Alumno a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Alumno.buscarPorApellido", query = "SELECT a FROM Alumno a WHERE a.apellido = :apellido")
})
public class Alumno {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
    private String nombre;
    private String apellido;
    private String curso;
    
    
    
	public Alumno() {
		super();
	}



	public Alumno(String nombre, String apellido, String curso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.curso = curso;
	}



	public int getId() {
		return id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", curso=" + curso + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Alumno other = (Alumno) obj;
		if (id != other.id)
			return false;
		return true;
	}
    
}
