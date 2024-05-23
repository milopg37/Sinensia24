package com.curso.service;

import java.util.List;

import com.curso.models.Curso;

public interface CursoService {

	//Métodos
	 Curso findCurso(String codCurso);
	 List<Curso> getCursosEntrePrecios(double minPrecio, double maxPrecio);
	 List<Curso> altaCurso(Curso curso);
	 List<Curso> deleteCurso(String codCurso);
	 void updateHorasCurso(Curso curso, int nuevaDuracion);
}
