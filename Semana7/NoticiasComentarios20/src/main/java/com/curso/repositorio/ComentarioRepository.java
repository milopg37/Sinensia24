package com.curso.repositorio;

import java.util.List;

import com.curso.modelos.Comentario;

public interface ComentarioRepository {

	public Comentario findOne(int numero);
	public List<Comentario> findAll();
	public void save(Comentario comment);
	public void delete(Comentario coment);
}
