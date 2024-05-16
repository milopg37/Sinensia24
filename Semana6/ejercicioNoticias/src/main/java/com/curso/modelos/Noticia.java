package com.curso.modelos;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table (name = "noticias")
public class Noticia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name = "titulo")
	private String titulo;
	
	@Column (name = "autor")
	private String autor;
	
	@Column (name = "fecha")
	private String fecha;
	
	@OneToMany(mappedBy = "noticia")
    private List<Comentario> comentarios;
	
	public Noticia() {
		super();
	}
	
	public Noticia(String titulo) {
		super();
		this.titulo = titulo;
	}
	
	public Noticia(String titulo, String autor, String fecha) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.fecha = fecha;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Noticia [titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Noticia other = (Noticia) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
}
