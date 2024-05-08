package com.curso.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * Redirige al login html
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("Login.jsp");
	}
	
	
	/**
	 * Recibe datos de POST form Login
	 * Parsea a variables, sanitiza & Valida para dar acceso a la vista HOME
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
        String contrasena = request.getParameter("contrasena");
        boolean permitirAcceso = false;
        
        permitirAcceso = validarDatos(usuario, contrasena);
        
        if (permitirAcceso) {
        	 // Usuario autenticado, redirigir a la página de inicio
            RequestDispatcher dispatcher = request.getRequestDispatcher("views/Home.jsp");
            dispatcher.forward(request, response);
		}else {
			response.sendRedirect("Error.html");
		}
        
	}

	/**
	 * Sanitiza & Valida
	 * @param usuario
	 * @param contrasena
	 * @return
	 */
	private boolean validarDatos(String usuario, String contrasena) {
		String usuarioTrimmed  = usuario.trim();
		String contrasenaTrimmed = contrasena.trim();
		
		if (usuarioTrimmed != null && contrasenaTrimmed != null) {
			return true;
		}
		return false;
	}


}
