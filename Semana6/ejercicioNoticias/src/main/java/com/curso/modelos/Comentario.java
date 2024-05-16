package com.curso.modelos;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table (name = "comentarios")
public class Comentario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column (name = "id")
	private String id;
	
	@Column (name = "texto")
	private String texto;
	
	@Column (name = "autor")
	private String autor;
	
	@ManyToOne
    @JoinColumn(name = "noticia_id")
    private Noticia noticia;

	public Comentario() {
		super();
	}

	public Comentario(String id) {
		super();
		this.id = id;
	}

	public Comentario(String id, String texto, String autor) {
		super();
		this.id = id;
		this.texto = texto;
		this.autor = autor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	@Override
	public String toString() {
		return "Comentario [id=" + id + ", texto=" + texto + ", autor=" + autor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
