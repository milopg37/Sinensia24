package com.curso;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LeerSesionProducto
 */
public class LeerSesionProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession sesion = request.getSession();
		
		Producto producto = (Producto) sesion.getAttribute("producto");
		
		if (producto != null) {
			
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<!DOCTYPE html>");
			out.println("<html lang='es'>");
			out.println("<head>");
			out.println("<meta charset='UTF-8'>");
			out.println("<title> Saluditos </title>");
			out.println("</head>");
			out.println("<body>");
			
			out.println(producto.getId() + " " + producto.getConcepto() + " " + producto.getPrecio());
			
			out.println("</body>");
			out.println("</html>");
		}
	}


}
