package com.servlets;

import java.util.HashMap;
import java.util.Map;

public class MapRecursos {

	private Map<String, String> temasRelacionados;
	

	public MapRecursos() {
		temasRelacionados = new HashMap<>();
        // Constructor crea el mapa vacio Y de manera preestablecida
		// Relaciono una tematica buscada por input, a webs utiles sobre el campo
		
		temasRelacionados.put("artes marciales", "https://www.ufc.com/");
		
		temasRelacionados.put("formula 1", "https://soymotor.com/");
		
		temasRelacionados.put("teatro", "https://www.teatroreal.es/es");
    }
	
	

	public Map<String, String> getTemasRelacionados() {
		return temasRelacionados;
	}

	public void setTemasRelacionados(Map<String, String> temasRelacionados) {
		this.temasRelacionados = temasRelacionados;
	}
	
	
}
