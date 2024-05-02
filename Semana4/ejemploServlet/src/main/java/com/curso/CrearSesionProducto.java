package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class CrearSesionProducto
 */
public class CrearSesionProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession sesion = request.getSession(true);//Al establecer sesion, ponemos true
		
		sesion.setMaxInactiveInterval(120); //2minutos
		
		Producto producto = new Producto(1, "mesa", 350.55);
		
		sesion.setAttribute("producto", producto);
		
	}



}
