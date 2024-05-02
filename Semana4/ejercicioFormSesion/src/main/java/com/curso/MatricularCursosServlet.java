package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class MatricularCursosServlet
 */
public class MatricularCursosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	*/
	
	/**
	 * Servlet que se encarga de recibir un curso introducido mediante input
	 * Valida, lo agrega a una lista y luego muestrea info
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//Seteo el curso enviado a variable y lo almaceno en una lista
		List<String> listaCursos = new ArrayList<>();
		String cursoMatriculado = request.getParameter("curso");
		boolean cursoValidado = false;
		
		//Validacion & Sanitizacion
		cursoValidado = validarDatos(cursoMatriculado);
		
		//Lo agrego a la lista y muestreo
		if (cursoValidado) {
			
			listaCursos.add(cursoMatriculado);	
			printDatos(listaCursos, response);
		}
		
	}


	/**
	 * Sanitiza y verifica que el curso introducido no es nulo
	 * @param cursoMatriculado
	 * @return
	 */
	private boolean validarDatos(String cursoMatriculado) {
		
		cursoMatriculado.trim();
		
		if (cursoMatriculado != null) {
			return true;
		}
		
		return false;
	}
	

	private void printDatos(List<String> listaCursos, HttpServletResponse response) throws IOException {
				//Muestro la vista de cursos
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				
				out.println("<!DOCTYPE html>");
				out.println("<html lang='es'>");
				out.println("<head>");
				out.println("<meta charset='UTF-8'>");
				out.println("<title> Cursos - Usuario </title>");
				out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"estilosPrintDatos.css\">");
				out.println("</head>");
				
				out.println("<body>");
				out.println("<div class='content'>");
				out.println("<h2> - Lista de Cursos Matriculados - </h2>");
				
				out.println("<ul>");
				for (String curso : listaCursos) {
					out.println("<li>" +  curso + "</li>");
				}
				out.println("</ul>");
				
				out.println("<p> <a href='homeEjercicioSesion.html'> Volver a la vista matriculacion </a> </p>");
				
				out.println("</div>");
				out.println("</body>");
				out.println("</html>");
	}

}
