package com.curso.inicio;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.curso.model.Hotel;
import com.curso.service.HotelService;

@SpringBootTest
@AutoConfigureMockMvc
public class HotelControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private HotelService servicio;
	
	@BeforeEach
	public void setup() {
		Hotel hotel = new Hotel();
	    hotel.setNombre("Hotel Test");
        hotel.setCategoria("5 Estrellas");
        hotel.setPrecio(3000.0);
        hotel.setDisponible(true);
        
     // Configurar el mock del servicio para que devuelva el hotel
        when(servicio.findByNombre("Hotel Test")).thenReturn(hotel);
	}
	
	/**
	 * Checkea que el método del controlador findByNombre devuelve un objeto Hotel con los datos esperados
	 * y que los datos del hotel son devueltos en la respuesta JSON
	 * 
	 * @throws Exception
	 */
	@Test
    public void findByNombreTest() throws Exception {
        mockMvc.perform(get("/hotel/buscar/{nombreBuscar}", "Hotel Test")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nombre").value("Hotel Test"))
                .andExpect(jsonPath("$.categoria").value("5 Estrellas"))
                .andExpect(jsonPath("$.precio").value(3000.0))
                .andExpect(jsonPath("$.disponible").value(true));
    }
	
	
}