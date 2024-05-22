package com.curso.modelos;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Comentario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String texto;
	private String autor;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn (name = "noticia_titulo") //Columna referencia en la DB
	private Noticia noticia;
	
	
	public Comentario(int id) {
		super();
		this.id = id;
	}


	public Comentario() {
		super();
	}
	
	
	public Comentario(String texto, String autor, Noticia noticia) {
		super();
		this.texto = texto;
		this.autor = autor;
		this.noticia = noticia;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public Noticia getNoticia() {
		return noticia;
	}

	public void setNoticia(Noticia noticia) {
		this.noticia = noticia;
	}

	@Override
	public String toString() {
		return "Comentario [id=" + id + ", texto=" + texto + ", autor=" + autor + "]";
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
		Comentario other = (Comentario) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
