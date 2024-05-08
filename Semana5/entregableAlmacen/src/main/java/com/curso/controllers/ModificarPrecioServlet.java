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
 * Servlet implementation class ModificarPrecioServlet
 */
public class ModificarPrecioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	*/

	/**
	 * Recibe por POST el nombre de un producto, y un nuevo precio a setearle
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombreProducto = request.getParameter("nombreProducto");
		double nuevoPrecio = Double.parseDouble(request.getParameter("nuevoPrecio"));
		boolean validarDatos = false;
		
		validarDatos = validar(nombreProducto,nuevoPrecio);
		
		if (validarDatos) {
			HttpSession session = request.getSession();
			ProductoService.modificarPrecioProducto(nombreProducto, nuevoPrecio);
			response.sendRedirect("views/Exito.html");
			
		}else {
			response.sendRedirect("views/Error.html");
		}
	}

	/**
	 * Sanitizo y valido
	 * @param nombreProducto
	 * @param nuevoPrecio
	 * @return
	 */
	private boolean validar(String nombreProducto, double nuevoPrecio) {
		
		String nombreTrimmed = nombreProducto.trim();
		
		if (nuevoPrecio > 0 && nombreTrimmed != null) {
			return true;
		}
		
		return false;
	}

}
