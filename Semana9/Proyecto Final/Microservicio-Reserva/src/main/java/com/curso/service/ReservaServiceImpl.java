package com.curso.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.ReservaDao;
import com.curso.model.Hotel;
import com.curso.model.Reserva;
import com.curso.model.Vuelo;

@Service
public class ReservaServiceImpl implements ReservaService {

	@Autowired
	ReservaDao dao;
	
	@Autowired
	RestTemplate template;
	
	private String urlHotel = "http://localhost:8080/hotel";
	private String urlVuelo = "http://localhost:9090/vuelo";
	
	//Metodos CRUD
	
	/**
	 * Devuelve una lista con todas las reservas
	 */
	@Override
	public List<Reserva> findAll() {
		return dao.findAll();
	}
	
	/**
	 * Busca una reserva dado su ID y la devuelve
	 */
	@Override
	public Reserva findByID(int idReserva) {
		return dao.findById(idReserva).orElse(null);
	}

	/**
	 * Agrega una nueva reserva a la BD
	 * Devuelve lista actualizada
	 */
	@Override
	public List<Reserva> addReserva(Reserva nuevaReserva) {
		 dao.save(nuevaReserva);
		return dao.findAll();
	}

	/**
	 * Actualiza el nombre a la cual está una reserva
	 * Busca la reserva por ID
	 * Devuelve lista actualizada
	 */
	@Override
	public List<Reserva> updateReserva(int idReserva, String nuevoCliente) {
		Reserva reservaActualizar = dao.findById(idReserva).orElse(null);
		reservaActualizar.setNombreCliente(nuevoCliente);
		dao.save(reservaActualizar);
		return dao.findAll();
	}

	/**
	 * Borra una reserva dado su ID
	 * Devuelve lista actualizada
	 */
	@Override
	public List<Reserva> deleteByID(int idReserva) {
		dao.deleteById(idReserva);
		return dao.findAll();
	}
	
	//Metodos Especificos

	/**
	 * Llama al controller de Hotel findByName mediante un GET
	 * Si la reserva contiene el idHotel del getID de hotel que obtenemos por template
	 * Se añade esa reserva a la lista de reservas pertenecientes a ese hotel.
	 * Nombre del hotel a buscar como @Param
	 */
	@Override
	public List<Reserva> reservasPorHotel(String hotelABuscar) {
		List<Reserva> reservas = findAll();
		List<Reserva> reservasDelHotel = new ArrayList<>();
		
		Hotel hotel = template.getForObject(urlHotel + "/buscar/" + hotelABuscar, Hotel.class);
		
		for (Reserva reserva : reservas) {
			if (reserva.getIdHotel() == hotel.getIdHotel()) {
				reservasDelHotel.add(reserva);
			}
		}
		return reservasDelHotel;
	}

	/**
	 * Llama al controller de Vuelos mediante un POST
	 * @RequestBody (idVuelo, idHotel, nombre, dni, plazasAReservar)
	 * Se creará una nueva reserva y llamará al método de Vuelo para reservar plazas
	 */
	@Override
	public void crearReservaPorVuelo(Reserva reserva, int totalPersonas) {
		
		//Traigo los vuelos que cumplan: plazas > totalPersonas
		List<Vuelo> listaVuelos = Arrays.asList(template.getForObject(urlVuelo + "/check/" + totalPersonas, Vuelo[].class));
		
		//Busco el vuelo en cuestión y reservo las plazas
		for (Vuelo vuelo : listaVuelos) {
			if (vuelo.getIdVuelo() == reserva.getIdVuelo()) {
				template.put(urlVuelo + "/reserva/" + vuelo.getIdVuelo() + "/" + totalPersonas, reserva);//Metodo en controller que reserva
			}
		}
		dao.save(reserva);
	}
}
