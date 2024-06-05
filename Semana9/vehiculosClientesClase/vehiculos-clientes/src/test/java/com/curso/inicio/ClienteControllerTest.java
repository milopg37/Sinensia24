package com.curso.inicio;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.curso.model.Cliente;
import com.curso.services.cliente.ClienteService;

@SpringBootTest
@AutoConfigureMockMvc
public class ClienteControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ClienteService servicio;
	
	@BeforeEach
	public void setup() {
		Cliente cliente = new Cliente("Pedro","Picapiedras");
		when(servicio.getClienteById(1)).thenReturn(cliente);
		when(servicio.listAllClients()).thenReturn(Arrays.asList(cliente));
	}
	
	@Test
	public void createClienteWithPathVariable() throws Exception{
		doNothing().when(servicio).createClient(any(Cliente.class));
		mockMvc.perform(post("/clientes/Pepito/Grillo")).andExpect(status().isOk());
	}
	
	@Test
	public void updateClienteByIdTest() throws Exception{
		doNothing().when(servicio).updateClienteById(1, "Pepito", "Grillo");
		mockMvc.perform(put("/clientes/1/Pepito/Grillo")).andExpect(status().isOk());
	}
	
	@Test
	public void deleteClienteByIdTest() throws Exception{
		doNothing().when(servicio).deleteClienteById(1);
		mockMvc.perform(delete("/clientes/1")).andExpect(status().isOk());
	}
	
	@Test
	public void createClienteTest() throws Exception{
		doNothing().when(servicio).createClient(any(Cliente.class));
		mockMvc.perform(post("/clientes")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"nombre\" : \"Juan\", \"apellido\" : \"Perez\"}"))
				.andExpect(status().isOk());
	}
	
	/*problemas con los imports
	 * 
	@Test
	public void getListTodosLosClientesTest() throws Exception{
		mockMvc.perform(get("/clientes"))
			.andExpect(status().isOk())
			//.andExpect(content().contentType(MediaType.APPLICATION_JSON))
			//.andExpect(jsonPath("$", hasSize(1)))
			//.andExpect(jsonPath("$[0].nombre", is("Pedro")))
			//.andExpect(jsonPath("$[1].apellido", is("Picapiedras")));
	}
	*/
	
	/*Fallan imports
	 * 
	@Test
	public void getClienteByIdTest() throws Exception{
		mockMvc.perform(get("/clientes/1")).andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON))
			.andExpect(jsonPath("$.nombre", is("Pedro")))
			.andExpect(jsonPath("$.apellido", is("Picapiedras")));
	}
	*/
}
