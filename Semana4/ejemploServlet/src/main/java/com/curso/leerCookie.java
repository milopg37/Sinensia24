package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class leerCookie
 */
public class leerCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Cookie[] arrayCookies = request.getCookies();
	
		out.println("<!DOCTYPE html>");
		out.println("<html lang='es'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Pruebas</title>");
		out.println("</head>");
		out.println("<body>");

		if (arrayCookies != null) {
			for (Cookie cookie : arrayCookies) {
				out.println("Cookie " + cookie.getName());
			}
		}
		
		out.println("</body>");
		out.println("</html>");
	}

	
}
