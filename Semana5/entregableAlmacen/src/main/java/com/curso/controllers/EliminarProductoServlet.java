package com.curso.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.curso.services.ProductoService;

/**
 * Servlet implementation class EliminarProductoServlet
 */
public class EliminarProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	*/

	/**
	 * Recibe un string por POST el cual es el nombre de producto a eliminar de la lista
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombreProducto = request.getParameter("nombreProducto");
		boolean datoValido = false;
		
		datoValido = validar(nombreProducto);
		
		if (datoValido) {
			
			HttpSession session = request.getSession();
			ProductoService.eliminarProductoByName(nombreProducto);
			response.sendRedirect("views/Exito.html");
			
		}else {
			response.sendRedirect("views/Error.html");
		}
	}

	/**
	 * Validacion
	 * @param nombreProducto
	 * @return
	 */
	private boolean validar(String nombreProducto) {
		String nombreTrimmed = nombreProducto.trim();
		
		if (nombreTrimmed != null) {
			return true;
		}
		return false;
	}

}
