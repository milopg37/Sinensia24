package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.HotelDao;
import com.curso.model.Hotel;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	HotelDao dao;

	//Metodos CRUD
	/**
	 * Busca un hotel dado su ID y devuelve todos sus datos
	 */
	@Override
	public Hotel findHotel(int idHotel) {
		return dao.findById(idHotel).orElse(null);
	}
	
	/**
	 * Trae una lista con todos los hoteles de la BD
	 * comprueba cuales estan disponibles
	 * Si lo estan los añade a otra lista y los devuelve
	 */
	@Override
	public List<Hotel> findDisponibles() {
		List<Hotel> listaHoteles = dao.findAll();
		List<Hotel> listaDisponibles = new ArrayList<>();
		
		for (Hotel hotel : listaHoteles) {
			if (hotel.isDisponible()) {
				listaDisponibles.add(hotel);
			}
		}
		return listaDisponibles;
	}

	/**
	 * Borra un hotel dado por ID
	 * Devuelve lista actualizada
	 */
	@Override
	public List<Hotel> deleteHotel(int idHotel) {
		 dao.deleteById(idHotel);
		return dao.findAll();
	}
	
	/**
	 * Busca un hotel dado por ID
	 * Modifica su precio, lo actualiza
	 * y devuelve la lista
	 */
	@Override
	public List<Hotel> updateHotel(int idHotel, Double nuevoprecio) {
		Hotel hotelActualizar = dao.findById(idHotel).orElse(null);
		hotelActualizar.setPrecio(nuevoprecio);
		dao.save(hotelActualizar);
		return dao.findAll();
	}

	/**
	 * Agrega un nuevo hotel a la BD
	 * Devuelve lista actualizada
	 */
	@Override
	public List<Hotel> addHotel(Hotel nuevoHotel) {
		dao.save(nuevoHotel);
		return dao.findAll();
	}

	/**
	 * Metodo específico
	 * Devuelve los datos de un Hotel dado su nombre
	 * @See -> DAO
	 */
	@Override
	public Hotel findByNombre(String nombreBuscar) {
		return dao.findByNombre(nombreBuscar);
	}	
}
