package pensandoEnObjetos;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		/**
		 * Instancio jugadores que es lo basico
		 * que se necesita para poder crear el resto
		 */
		 //Pertenecerán al equipo1
		 Jugador messi = new Jugador("messi", 37, 57);
		 Jugador xavi = new Jugador("xavi", 40, 27);
		 Jugador iniesta = new Jugador("iniesta", 39, 29);
		 
		 //Pertenecerán al equipo2
		 Jugador pujol = new Jugador("pujol", 41, 15);
		 Jugador casillas = new Jugador("casillas", 40, 0);
		 Jugador pique = new Jugador("pique", 35, 18);
		 
		 //Pertenecerán al equipo3
		 Jugador villa = new Jugador("villa", 32, 45);
		 Jugador torres = new Jugador("torres", 36, 40);
		 Jugador busquets = new Jugador("busquets", 44, 10);
		 
		 /**
		  * Instancio Ligas
		  */
		 Liga laLiga = new Liga("laliga");
		 Liga premierLigue = new Liga("premierLigue");
		 
		 /**
		  * Instancio equipos
		  */
		 Equipo equipoUno = new Equipo("fcb", laLiga, 0, 0);
		 Equipo equipoDos = new Equipo("rmd", laLiga, 0, 0);
		 Equipo equipoTres = new Equipo("totten", premierLigue, 0, 0);
		 Equipo equipoCuatro = new Equipo("manch", premierLigue, 0, 0);
		 
		 /**
		  * Agrego Equipos a cada Liga
		  */
		 laLiga.addEquipo(equipoUno);
		 laLiga.addEquipo(equipoTres);
		 premierLigue.addEquipo(equipoDos);
		 
		 /**
		  * Agrego Jugadores a los equipos
		  */
		 equipoUno.addJugador(messi);
		 equipoUno.addJugador(xavi);
		 equipoUno.addJugador(iniesta);
		 
		 equipoDos.addJugador(pujol);
		 equipoDos.addJugador(casillas);
		 equipoDos.addJugador(pique);
		 
		 equipoTres.addJugador(villa);
		 equipoTres.addJugador(torres);
		 equipoTres.addJugador(busquets);
		 
		 equipoTres.addJugador(new Jugador("milo", 26, 3));
		 equipoTres.addJugador(new Jugador("kenzy", 18, 11));
		 equipoTres.addJugador(new Jugador("paco", 21, 9));
		 
		 /**
		  * Agrego partidos a los equipos
		  */
		 equipoUno.addPartido(new Partido("victoria"));
		 equipoUno.addPartido(new Partido("victoria"));
		 equipoUno.addPartido(new Partido("derrota"));
		 
		 equipoDos.addPartido(new Partido("derrota"));
		 equipoDos.addPartido(new Partido("derrota"));
		 equipoDos.addPartido(new Partido("victoria"));
		 
		 equipoTres.addPartido(new Partido("victoria"));
		 equipoTres.addPartido(new Partido("victoria"));
		 equipoTres.addPartido(new Partido("victoria"));
		 
		 equipoCuatro.addPartido(new Partido("derrota"));
		 equipoCuatro.addPartido(new Partido("derrota"));
		 equipoCuatro.addPartido(new Partido("derrota"));
		
		/**
		 * Listar jugadores de Equipos por goles
		 * Creo un array vacio el cual almacenará los datos ya ordenados
		 * Le paso como parámetro los jugadores de cada equipo
		 */
		 List<Jugador> jugadoresOrdenados = new ArrayList<Jugador>();
		 jugadoresOrdenados = equipoUno.listarPorGoles(equipoUno.getJugadores());
		 equipoUno.printDatos(jugadoresOrdenados);
		 
		 jugadoresOrdenados = equipoDos.listarPorGoles(equipoDos.getJugadores());
		 equipoDos.printDatos(jugadoresOrdenados);
		 
		 jugadoresOrdenados = equipoTres.listarPorGoles(equipoDos.getJugadores());
		 equipoTres.printDatos(jugadoresOrdenados);
		 
		 jugadoresOrdenados = equipoCuatro.listarPorGoles(equipoCuatro.getJugadores());
		 equipoCuatro.printDatos(jugadoresOrdenados);
		 
		 /**
		  * Lista y printea partidos jugados con los resultados
		  */
		  equipoUno.listarPartidos(equipoUno.getPartidos());
		  equipoDos.listarPartidos(equipoUno.getPartidos());
		  equipoTres.listarPartidos(equipoUno.getPartidos());
		  equipoCuatro.listarPartidos(equipoUno.getPartidos());
		  
		  /**
		   * Lista los equipos de la Liga
		   * Ordenados por partidos ganados
		   * Creo un array vacio que almacenará el orden
		   */
		  List<Equipo> equiposListados = new ArrayList<Equipo>();
		  equiposListados = laLiga.listarEquiposPorVictorias(laLiga.getEquipos());
		  laLiga.printDatos(equiposListados);
		  
		  equiposListados = premierLigue.listarEquiposPorVictorias(premierLigue.getEquipos());
		  premierLigue.printDatos(equiposListados);
		   
		 
	}
}
