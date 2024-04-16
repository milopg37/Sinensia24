package pensandoEnObjetos;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import pensandoEnObjetos.Jugador;

public class Equipo {
	//Attr
	private String nombre;
	private List<Jugador> jugadores;
	private Liga liga;
	private List<Partido> partidos;
	private int partidosGanados;
	private int partidosJugados;
	
	//Cons
	public Equipo() {
	}
	
	public Equipo(String nombre, Liga liga, int partidosGanados, int partidosJugados) {
		this.nombre = nombre;
		this.liga = liga;
		this.partidosGanados = partidosGanados;
		this.partidosJugados = partidosJugados;
		this.jugadores = new ArrayList<>();
		this.partidos = new ArrayList<>()
;	
	}

	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Liga getLiga() {
		return liga;
	}

	public void setLiga(Liga liga) {
		this.liga = liga;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}
	
	public int getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}
	
	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}

	//Methods
	/**
	 * Este método permite agregar un jugador al Array de jugadores
	 * de Equipo
	 * @param jugadoraAgregar
	 */
	public void addJugador(Jugador jugadoraAgregar) {
		this.jugadores.add(jugadoraAgregar);
	}
	
	/**
	 * Este método permite agregar un partido al Array de partidos
	 * de Equipo
	 * @param partidoAgregar
	 */
	public void addPartido(Partido partidoAgregar) {
		partidos.add(partidoAgregar);
	}
	
	
	/**
	 * Este método listará los jugadores de cada equipo
	 * ordenados por goles marcados
	 * @param jugadores
	 * @return
	 */
	public List<Jugador> listarPorGoles(List<Jugador>jugadores) {
		//List<Jugador> jugadoresOrdenados = new ArrayList<Jugador>();
		
		Comparator<Jugador> comparador = new Comparator<Jugador>() {
			
			@Override
			public int compare(Jugador jug1, Jugador jug2) {
				return Integer.compare(jug1.getGolesEstaTemporadas(), jug1.getGolesEstaTemporadas());
			}
		};
		
		jugadores.sort(comparador);
		return jugadores;	
	}
	
	/**
	 * Este método recibe Arrays de jugadores y printea por consola
	 * @param jugadores
	 */
	public void printDatos(List<Jugador> jugadores) {
		 
		 for (Jugador jugador : jugadores) {
				System.out.println("El jugador " + jugador.getNombre() + " ha anotado: " + jugador.getGolesEstaTemporadas() + " goles esta temporada");
			}
	}
	
	/**
	 * Este método listará los partidos jugados con los resultados
	 * @return
	 */
	public void listarPartidos(List<Partido> partidos) {
		
		for (Partido partido : partidos) {
			if (partido.getResultados().equals("victoria")) {
				this.partidosGanados++;
				this.partidosJugados++;
			}else {
				this.partidosJugados++;
			}
		}
		
		for (Partido partido : partidos) {
			System.out.println("El equipo: " + this.getNombre() + " ha jugado: " + 
								partidosJugados + " partidos y ha ganado: " + partidosGanados);
		}
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + ", liga=" + liga + ", partidosGanados="
				+ partidosGanados + ", partidosJugados=" + partidosJugados + "]";
	}
	
	
	
}
