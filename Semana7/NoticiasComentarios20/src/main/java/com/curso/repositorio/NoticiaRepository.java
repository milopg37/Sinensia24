package com.curso.repositorio;

import java.util.List;

import com.curso.modelos.Noticia;

public interface NoticiaRepository {

	public Noticia findOne(String titulo);
	public List<Noticia> findAll();
	public void save(Noticia noticia);
	public void delete(Noticia noticia);
}
