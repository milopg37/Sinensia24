package com.curso.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.curso.models.Producto;
import com.curso.models.SeccionEnum;
import com.curso.services.ProductoService;

/**
 * Servlet implementation class BuscarSeccionServlet
 */
public class BuscarSeccionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	*/

	/**
	 * Ingresa una seccion en un input y devuelve una lista de productos
	 * asociado a esa seccion en la misma vista jsp
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String seccionStr = request.getParameter("seccion");
		SeccionEnum seccionProducto = SeccionEnum.valueOf(seccionStr);
		
		List<Producto> lista;
		lista = ProductoService.getListBySeccion(seccionProducto);
		HttpSession session = request.getSession();
		session.setAttribute("listaProductos", lista);
		
		if (lista != null) {
			response.sendRedirect("views/mostrarBusqueda.jsp");
		}
		
	}

}
