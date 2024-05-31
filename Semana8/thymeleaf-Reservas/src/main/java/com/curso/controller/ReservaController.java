package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.model.Reserva;
import com.curso.service.ReservaService;

@Controller
//@RequestMapping(value = "/reservas")
public class ReservaController {

	@Autowired
	private ReservaService servicio;
	
	/**
	 * Implementando el servicio, rellena la lista con datos y la muestra en la vista HTML
	 * @param model
	 * @return
	 */
	 @GetMapping(value = "/mostrarReservas")
	    public String mostrarReservas(Model model) {
	        model.addAttribute("listaReservas", servicio.listarReservas());
	        return "reservas/mostrarReservas";//ruta vista html
	    }
	 
	 /**
	  * Implementando el service, muestra en la vista HTML el precio total por reserva
	  * @param model
	  * @return
	  */
	  @GetMapping(value = "/precioTotalReservas")
	    public String obtenerPrecioTotalReservas(Model model) {
	        List<Reserva> reservas = servicio.listarReservas();
	        double precioTotal = servicio.precioTotalReserva(reservas);
	        model.addAttribute("precioTotal", precioTotal);
	        model.addAttribute("listaReservas", reservas);
	        model.addAttribute("precioReservaIndividual", reservas);
	        return "reservas/precioTotalReservas";//ruta vista html
	    }
}
