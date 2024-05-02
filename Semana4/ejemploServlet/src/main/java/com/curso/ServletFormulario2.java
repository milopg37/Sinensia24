package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletFormulario1
 */
public class ServletFormulario2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("html/formulario1.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		String nombre = request.getParameter("nombre");
		String edad = request.getParameter("edad");
		Integer numeroVeces = Integer.valueOf(request.getParameter("numero")); //Parseo

		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html lang='es'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title> Saluditos </title>");
		out.println("</head>");

		out.println("<body>");
		out.println("<h2>" + "Campo nombre" + "</h2>");
		out.println("<p>" + "Nombre introducido en el form:" + nombre + "</p>");
		out.println("<h2>" + "Campo edad" + "</h2>");
		out.println("<p>" + "Edad introducida en el form:" + edad + "</p>");
		out.println("<h2>" + "Prueba numero" + "</h2>");
		
		for (int i = 0; i < numeroVeces; i++) {
		
			out.println("Printeando hola " + numeroVeces + " nº de veces \n");
		}
		
		
		out.println("</body>");
	}

}
