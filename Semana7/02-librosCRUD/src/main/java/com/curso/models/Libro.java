package com.curso.models;

public class Libro {

	private int isbn;
	private String titulo;
	private String tematica;
	
	public Libro() {
		super();
	}
	
	public Libro(int isbn) {
		super();
		this.isbn = isbn;
	}
	
	public Libro(int isbn, String titulo, String tematica) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.tematica = tematica;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTematica() {
		return tematica;
	}
	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", tematica=" + tematica + "]";
	}
	
	
}
