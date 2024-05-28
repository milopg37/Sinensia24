package com.curso.service;

import java.util.List;

import com.curso.models.Curso;
import com.curso.models.Formacion;

public interface FormacionService {

	//Métodos
	List<Curso> getCursosExistentes();
	void altaCurso(Formacion formacionAlta);
}
