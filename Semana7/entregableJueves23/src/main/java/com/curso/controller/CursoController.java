package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.curso.models.Curso;
import com.curso.service.CursoServiceImpls;

@RestController
public class CursoController {

	@Autowired
	CursoServiceImpls servicio;
	
	@GetMapping(value = "cursos/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Curso findCurso(@PathVariable("codCurso") String codCurso) {
		return servicio.findCurso(codCurso);
	}
	
	@GetMapping(value = "cursos/rango/{minPrecio},{maxPrecio}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> getCursosEntrePrecios(@PathVariable double minPrecio, @PathVariable double maxPrecio) {
		return servicio.getCursosEntrePrecios(minPrecio, maxPrecio);
	}
	
	@PostMapping(value = "cursos/nuevo", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> altaCurso(@RequestBody Curso curso) {
		return servicio.altaCurso(curso);
	}
	
	@GetMapping(value = "cursos/delete/{codCurso}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Curso> deleteCurso(@RequestBody String codCurso) {
		return servicio.deleteCurso(codCurso);
	}
	
	@PostMapping(value = "cursos/udpdate{nuevaDuracion}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateCurso(@RequestBody Curso curso, @PathVariable("nuevaDuracion") int nuevaDuracion) {
		servicio.updateHorasCurso(curso, nuevaDuracion);
	}
}
