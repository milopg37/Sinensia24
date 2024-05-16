package com.curso.generar;

import jakarta.persistence.*;

public class Generar {

	public static void main(String[] args) {
		
		//LLama al Persistence y este se encarga de ejecutar los primeros 3 scripts
        Persistence.generateSchema("bdperiodico", null);
        
        
	}

}
