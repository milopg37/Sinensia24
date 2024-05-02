package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.CoderMalfunctionError;
import java.time.LocalDate;

/**
 * Servlet implementation class ServletFormCompleto
 */
public class ServletFormCompleto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			response.sendRedirect("html/formularioCompleto.html");//origen webapps
		}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Seteo print writer y especifico doctype
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//Seteo todos los datos del form POST a variables
		String campoTexto = request.getParameter("nombre");
		String campoPassw = request.getParameter("password");
		String campoEmail = request.getParameter("email");
		int campoNumero = Integer.valueOf(request.getParameter("edad"));
		String campoFecha = request.getParameter("date");
		String campoHora = request.getParameter("time");
		String checkboxes = "";
		
		if ((request.getParameter("comidaCheck") != null) && (request.getParameter("deporteCheck") != null)) {
			checkboxes = "Come sano y hace deporte!";
			
		}else if (request.getParameter("comidaCheck") != null) {
			checkboxes = "Solo come sano..";
		}else {
			checkboxes = "Solo hace deporte..";
		}
		
		String campoRadioButton = request.getParameter("vehiculo");
		String campoTextarea = request.getParameter("textarea");
		String campoSelect = request.getParameter("select");
		
		
		//Construyo html y juego con los datos
		out.println("<!DOCTYPE html>");
		out.println("<html lang='es'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Formulario Completo</title>");
		out.println("</head>");
		out.println("<body>");
		
		int contador = 0;
		for (int i = 0; i < campoTexto.length(); i++) {
			contador++; 
		}
		
		out.println("<p> El nombre " + campoTexto + " tiene " +  contador + " letras </p>");
		
		if (campoPassw.length() >= 12) {
			out.println("<p> La contraseña es segura </p>");
		}
		
		if (campoNumero >= 18) {
			out.println("<p> El usuario es mayor de edad! </p>");
		}
		
		out.println("<p>El usuario ha nacido en el año </p>" + campoFecha.substring(6));
		out.println("<p>" + campoHora + "AM" + "</p>");
		out.println("<p>Es un usuario sano? " + checkboxes + "</p>");
		out.println("<p>Que vehiculo conduce el usuario?" + campoRadioButton + "</p>");
		out.println("<p>Esto es lo que el usuario piensa de si mismo: " + campoTextarea + "</p>");
		out.println("<p>Y su hobbie favorito es: " + campoSelect + "</p>");
		
		out.println("</body>");
		out.println("</html>");
	}

}
