package com.curso.models;

public class Curso {
	
	private String nombre;
	private int numeroCurso;
	private String profesor;
	private int numAlumnos;
	
	public Curso() {
		super();
	}

	
	public Curso(int numeroCurso) {
		super();
		this.numeroCurso = numeroCurso;
	}


	public Curso(String nombre, int numeroCurso, String profesor, int numAlumnos) {
		super();
		this.nombre = nombre;
		this.numeroCurso = numeroCurso;
		this.profesor = profesor;
		this.numAlumnos = numAlumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroCurso() {
		return numeroCurso;
	}

	public void setNumeroCurso(int numeroCurso) {
		this.numeroCurso = numeroCurso;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", numeroCurso=" + numeroCurso + ", profesor=" + profesor + ", numAlumnos="
				+ numAlumnos + "]";
	}
}
