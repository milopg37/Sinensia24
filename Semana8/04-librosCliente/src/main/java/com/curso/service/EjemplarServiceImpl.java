package com.curso.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.models.Ejemplar;

@Service
public class EjemplarServiceImpl implements EjemplarService {

	@Autowired
	RestTemplate template;
	
	private String url = "http://localhost:8080/libros";
	
	@Override
	public List<Ejemplar> nuevoEjemplar(Ejemplar ejemplar) {
		template.postForLocation(url , ejemplar); //http://localhost:8080/libros POST en 03-librosCRUD-BD
		
		return Arrays.asList(template.getForObject(url, Ejemplar[].class)); //http://localhost:8080/libros GET en 03-librosCRUD-BD
	}

}
