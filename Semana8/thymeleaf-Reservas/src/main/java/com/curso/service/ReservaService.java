package com.curso.service;

import java.util.List;

import com.curso.model.Reserva;

public interface ReservaService {

	List<Reserva> listarReservas();
	double precioTotalReserva(List<Reserva> listaReservas);
}
