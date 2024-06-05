package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.VueloDao;
import com.curso.model.Vuelo;

@Service
public class VueloServiceImpl implements VueloService{

	@Autowired
	VueloDao dao;
	
	//Metodos CRUD

	/**
	 * Busca un vuelo por ID y lo devuelve
	 */
	@Override
	public Vuelo findByID(int idVuelo) {
		return dao.findById(idVuelo).orElse(null);
	}

	/**
	 * Busca un vuelo por ID
	 * Actualiza su capacidad maxima de plazas
	 * Lo guarda y devuelve lista actualizada
	 */
	@Override
	public List<Vuelo> updateVuelo(int idVuelo, int nuevoMaxPlazas) {
		Vuelo vueloActualizar = dao.findById(idVuelo).orElse(null);
		vueloActualizar.setPlazas(nuevoMaxPlazas);
		dao.save(vueloActualizar);
		return dao.findAll();
	}

	/**
	 * Borra un vuelo dado su ID
	 * Devuelve lista actualizada
	 */
	@Override
	public List<Vuelo> deleteVuelo(int idVuelo) {
		dao.deleteById(idVuelo);
		return dao.findAll();
	}

	/**
	 * Agrega un nuevo vuelo a la BD
	 * Devuelve lista actualizada
	 */
	@Override
	public List<Vuelo> addVuelo(Vuelo vuelo) {
		dao.save(vuelo);
		return dao.findAll();
	}

	//Metodos especificos
	
	/**
	 * Comprueba que vuelos tienen el num de plazas solicitadas
	 * Devuelve una lista de los que cumplan esa condicion
	 */
	@Override
	public List<Vuelo> listarVuelosPlazasSuficientes(int plazasSolicitadas) {
		List<Vuelo> listaVuelos = dao.findAll();
		List<Vuelo> vueloConPlazasSuficientes = new ArrayList<>();
		
		for (Vuelo vuelo : listaVuelos) {
			if (vuelo.getPlazas() >= plazasSolicitadas) {
				vueloConPlazasSuficientes.add(vuelo);
			}
		}
		return vueloConPlazasSuficientes;
	}

	/**
	 * Reserva el num de plazas solicitadas al vuelo, dado su ID
	 * NO devuelve nada porque es un Update en JPQL
	 * @See DAO
	 */
	@Override
	public void vueloReservado(int idVuelo, int plazasAReservar) {
		dao.vueloReservado(idVuelo, plazasAReservar);
	}	
}
