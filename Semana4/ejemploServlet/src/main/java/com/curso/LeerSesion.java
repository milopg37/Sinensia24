package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LeerSesion
 */
public class LeerSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession sesion = request.getSession();
		
	    String cursoString = (String) sesion.getAttribute("curso");
	    
	    
	    response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		out.println("<!DOCTYPE html>");
		out.println("<html lang='es'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Pruebas</title>");
		out.println("</head>");
		out.println("<body>");

		out.println(cursoString);
	
		out.println("</body>");
		out.println("</html>");
	}



}
