package com.curso.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

import com.curso.models.Producto;
import com.curso.models.SeccionEnum;
import com.curso.services.ProductoService;

/**
 * Servlet implementation class AgregarProductoServlet
 */
public class AgregarProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * doGet hace redireccion
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("AgregarProducto.jsp");
	}

	/**
	 * Recibo datos por POST para crear un objeto Producto
	 * Parseo, sanitivo, valido y luego creo el objeto y lo añado a lista Productos
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombreProducto = request.getParameter("nombre");
		String seccionStr = request.getParameter("seccion");
		SeccionEnum seccionProducto = SeccionEnum.valueOf(seccionStr); 
		double precioProducto = Double.parseDouble(request.getParameter("precio"));
		int stockProducto = Integer.parseInt(request.getParameter("stock"));
		
		boolean validarDatos = false;
		
		validarDatos = validacion(nombreProducto, seccionProducto, precioProducto, stockProducto);
		
		//Si valida, creo sesion, listaproductos, producto y lo agrego
		if (validarDatos) {
			HttpSession session = request.getSession(true);
			
			ProductoService.addProducto(new Producto(nombreProducto, seccionProducto, precioProducto, stockProducto));
			
			response.sendRedirect("views/Exito.html");
			
		}else {
			response.sendRedirect("views/Error.html");
		}
	}
	
	/**
	 * Sanitizar & Validar
	 * @param nombreProducto
	 * @param seccionProducto
	 * @param precioProducto
	 * @param stockProducto 
	 * @param stockProducto
	 * @return
	 */
	private boolean validacion(String nombreProducto, SeccionEnum seccionProducto, double precioProducto, int stockProducto) {
		
		String nombreTrimmed = nombreProducto.trim();
		String seccionTrimmed = seccionProducto.toString().trim();
		
		if (precioProducto > 0 && nombreTrimmed != null && seccionTrimmed != null && stockProducto > 0) {
			return true;
		}
		
		return false;
	}

}
