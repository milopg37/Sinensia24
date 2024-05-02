package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

/**
 * Servlet implementation class ValidarPasswordFormServlet
 */
public class ValidarPasswordFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	/**
	 * Servlet que se encarga de tratar datos de un Login en HTML
	 * Si la contraseña es correcta redirecciona a otra vista HTML
	 * con otro Servlet dedicado
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Asigno datos del POST a variables
		String usuario = request.getParameter("username");
		String passwd = request.getParameter("password");
		boolean permitirAcceso = false;
		
		//Validacion de datos & sanitizacion
		permitirAcceso = validarDatos(usuario, passwd);
		
		
		if (permitirAcceso) {
			//Redirect a otro form que tiene otro servlet dedicado
			response.sendRedirect("homeEjercicioSesion.html");
			
		}else {
			//Mensaje de error y redirect otra vez al form
			JOptionPane.showMessageDialog(null, "Contraseña incorrecta, redirigiendo ..", "Error", JOptionPane.ERROR_MESSAGE);
			request.getRequestDispatcher("formEjercicioSesion.html").forward(request, response);
		}
		
	}

	/**
	 * Sanitiza y verifica los datos para permitir acceso a la siguiente vista
	 * @param usuario
	 * @param passwd
	 * @return
	 */
	private boolean validarDatos(String usuario, String passwd) {
		usuario.trim();
		passwd.trim();
		
		if (passwd.equalsIgnoreCase("pepito")) {
			return true;
			
		}
		
		return false;
	}

}
