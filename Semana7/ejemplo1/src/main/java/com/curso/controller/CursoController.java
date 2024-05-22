package com.curso.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.curso.models.Curso;

@RestController
public class CursoController {
	
		/**[ Get ] localhost:8080/cursos
		 * Mostrar todos los cursos
		 * @return
		 */
		@GetMapping(value = "cursos", produces = MediaType.TEXT_PLAIN_VALUE)
		public List<Curso> getCursos() {
			
			List<Curso> listaCursos = new ArrayList<>();
			return listaCursos;
		}
		
		/**[ Get ] localhost:8080/cursos{id}
		 * Mostrar curso por id proporcionado
		 * @return
		 */
		@GetMapping(value = "cursos/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
		public Curso getCursoByID(@PathVariable("id") int id) {
			
			Curso curso = new Curso();
			return curso;
		}
		
		/**[ Post ] localhost:8080/cursos{id}
		 * Dar de alta nuevo curso con id proporcionado
		 * @return
		 */
		@GetMapping(value = "cursos/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
		public void nuevoCurso(@PathVariable("id") int id) {
			Curso nuevoCurso = new Curso(id);
		}
		
		/**[ Delete ] localhost:8080/cursos{id}
		 * Eliminar curso por ID
		 * @return
		 */
		@GetMapping(value = "cursos/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
		public void eliminarCurso(@PathVariable("id") int id) {
			
		}
		
		/**[ Put ] localhost:8080/cursos{id}
		 * Actualizar curso por id
		 * @return
		 */
		@GetMapping(value = "cursos/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
		public void updateCurso(@PathVariable("id") int id) {
			
		}

}
