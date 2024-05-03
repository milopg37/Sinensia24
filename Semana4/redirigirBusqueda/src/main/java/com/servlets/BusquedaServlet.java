package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JOptionPane;

/**
 * Servlet implementation class BusquedaServlet
 */
public class BusquedaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * doGet = Los datos enviados viajan en la URL y no tienen impacto en el
	 * servidor
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("formularioBusqueda.html");
	}

	/**
	 * doPost = Los datos viajan ocultos y si pueden tener impacto en el servidor
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Almaceno dato de POST a variable
		String busqueda = request.getParameter("searchInput");
		boolean datoValidado = false;

		// Sanitizo y valido
		datoValidado = validarDato(busqueda);

		if (datoValidado) {
			// Obtener la sesión actual o crear una nueva si no existe
			HttpSession session = request.getSession(true);
			session.setAttribute("busqueda", busqueda);

			MapRecursos mapaEstablecido = new MapRecursos(); // Este objeto autoinvoca un mapa con contenido al
																// instanciarlo
			Map<String, String> mapaDatos; // Creo un Map vacío para rellenarlo
			mapaDatos = mapaEstablecido.getTemasRelacionados(); // Relleno mapa

			// Compruebo que key == dato a buscar y si es asi, printeo
			printDatos(mapaDatos, response, session);
		}

	}// end doPost

	/**
	 * Sanitiza y valida
	 * 
	 * @return
	 */
	private boolean validarDato(String busqueda) {
		busqueda.trim();

		if (busqueda != null) {
			return true;
		}

		return false;
	}

	/**
	 * Recorro el mapa, compruebo si el dato a buscar en el form coincide con alguna
	 * key Si coincide printeo los values de esa key, siendo estas, enlaces a otras
	 * webs relacionadas Printeo webs relacionadas con el concepto de búsqueda
	 * introducido en el form
	 * 
	 * @param mapaDatos
	 * @param response
	 * @param session
	 * @throws IOException
	 */
	private void printDatos(Map<String, String> mapaDatos, HttpServletResponse response, HttpSession session)
			throws IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String busqueda = (String) session.getAttribute("busqueda");

		out.println("<!DOCTYPE html>");
		out.println("<html lang='es'>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title> Búsquedas Relacionadas </title>");
		out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"estilosResultado.css\">");
		out.println("</head>");

		out.println("<body>");
		out.println("<div class='content'>");
		out.println("<h2> - Resultado Busqueda - </h2>");

		out.println("<ul>");
		
		out.println(datosEncontrados(mapaDatos, busqueda));
		
		out.println("</ul>");

		out.println("<p> <a href='formularioBusqueda.html'> Volver a la vista Búsqueda </a> </p>");

		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}

	private String datosEncontrados(Map<String, String> mapaDatos, String busqueda) {
		String cadena = "";
		for (Map.Entry<String, String> entry : mapaDatos.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();

			if (key.equalsIgnoreCase(busqueda)) {

				cadena += "<li><a href='" + val + "'>" + val + "</a></li>";

			}

		}
		if (cadena.length() == 0) {
			return "<li>No hemos encontrado nada</li>";
		}
		return cadena;
	}
}
