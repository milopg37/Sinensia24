package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletFormulario3
 */
public class ServletFormulario3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	
		out.println("<!DOCTYPE html>");
		out.println("<html lang='es'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title> Form3 </title>");
		out.println("</head>");
		out.println("<body>");

		if (request.getParameter("yoga") != null) {
			out.println("Has seleccionado yoga");
		}
		
		if (request.getParameter("pilates") != null) {
			out.println("Has seleccionado pilates");
		}
		
		if (request.getParameter("bici") != null) {
			out.println("Has seleccionado bici");
		}

		out.println("</body>");
	}

}
