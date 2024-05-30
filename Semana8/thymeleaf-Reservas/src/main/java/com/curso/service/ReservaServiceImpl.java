package com.curso.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.model.Reserva;

@Service
public class ReservaServiceImpl implements ReservaService {
	
	 static List<Reserva> listaReservas = new ArrayList<>();

	/**
	 * Recibe una lista vacia y la rellena con datos estaticos solo para mostrar
	 */
	static {
		listaReservas.add(new Reserva("R001", "Madrid", 2, "Calle Gran Vía 10", "Apartamento", 5, 120.0));
		listaReservas.add(new Reserva("R002", "Barcelona", 4, "Avenida Diagonal 45", "Casa", 7, 150.0));
		listaReservas.add(new Reserva("R003", "Valencia", 3, "Calle Colón 8", "Piso", 3, 100.0));
		listaReservas.add(new Reserva("R004", "Sevilla", 1, "Calle Sierpes 15", "Estudio", 2, 80.0));
		listaReservas.add(new Reserva("R005", "Bilbao", 5, "Plaza Moyua 1", "Ático", 6, 200.0));
	}

	/**
	 * Devuelve la lista de reservas
	 */
	@Override
	public List<Reserva> listarReservas() {
		return listaReservas;
	}

	/**
	 * Recibe la lista de reservas y saca el precio total de la misma
	 * Multiplicando numDias * precio por noche
	 */
	@Override
	public double precioTotalReserva(List<Reserva> listaReservas) {
		  double precioTotal = 0.0;
	        for (Reserva reserva : listaReservas) {
	            precioTotal += reserva.getNumDias() * reserva.getPrecioNoche();
	        }
	        return precioTotal;
	}
}
