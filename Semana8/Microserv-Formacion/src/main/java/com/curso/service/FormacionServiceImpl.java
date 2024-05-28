package com.curso.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.models.Curso;
import com.curso.models.Formacion;

@Service
public class FormacionServiceImpl implements FormacionService {

	@Autowired
	RestTemplate template;
	
	private final String URL_BASE = "http://localhost:8080/cursos";
	
	/**
	 * Como el microservicio de cursos no dispone del dato de asignaturas,
	 * se seguirá el siguiente algoritmo:
	 * Si un curso tiene una duración igual o superior a 50 horas,
	 * se considera que tiene 10 asignaturas, sino, serán 5 asignaturas
	 */
	@Override
	public List<Curso> getCursosExistentes() {
		String url = URL_BASE + "/findAll";
		List<Curso> listaCursos = Arrays.asList(template.getForObject(url, Curso[].class));
		List<Curso> cursos10asig = new ArrayList<>();
		List<Curso> cursos5asig = new ArrayList<>();
		
		for (Curso curso : listaCursos) {
			if (curso.getDuracion() >= 50) {
				cursos10asig.add(curso);
				
			}else {
				cursos5asig.add(curso);
			}
		}
		return cursos10asig;
	}

	/**
	 * A partir de los datos de formación recibidos en el cuerpo,
	 * se dará de alta el curso a través del microservicio de cursos,
	 * siempre que no exista un curso con el mismo nombre,
	 * en cuyo caso no se hará nada.
	 * La duración del curso se establecerá según la fórmula: asignaturas*10
	 */
	@Override
	public void altaCurso(Formacion formacionAlta) {
		String url = URL_BASE + "/nuevo";
		boolean existeCurso = false;
		
			List<Curso> listaCursos = getCursosExistentes();
			
			for (Curso curso : listaCursos) {
				if (curso.getNombre().equalsIgnoreCase(formacionAlta.getCurso())) {
					existeCurso = true;
					break;
				}
			}
		
		
			if (!existeCurso) {
				//Parseo de formacion a Curso
				Curso cursoAlta = new Curso();
				//cursoAlta.setNombre(formacionAlta.getCurso());
				//cursoAlta.setDuracion(formacionAlta.getAsignaturas() * 10);
				//cursoAlta.setPrecio(14.45);
				cursoAlta.setCodCurso("C111");
				formacionAlta.setCurso(cursoAlta.getNombre());
				formacionAlta.setPrecio(cursoAlta.getPrecio());
				formacionAlta.setAsignaturas(37);
				
				template.postForObject(url, cursoAlta, Curso.class);
				template.postForObject(url, formacionAlta, Curso.class);
			}
	}

}
