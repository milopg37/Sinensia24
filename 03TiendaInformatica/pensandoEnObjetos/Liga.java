package pensandoEnObjetos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


import pensandoEnObjetos.Equipo;

public class Liga {
	//Attr
	private String nombre;
	private List<Equipo> equipos;
	
	
	//Cons
	public Liga() {
		
	}
	
	public Liga(String nom) {
		this.nombre = nom;
		this.equipos = new ArrayList<>();
	}
	
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}

	//Methods
	/**
	 * Este método nos permite agregar un equipo al array Equipos
	 * de la liga
	 * @param equipoaAgregar
	 */
	public void addEquipo(Equipo equipoaAgregar) {
		equipos.add(equipoaAgregar);
	}
	
	
	/**
	 * Este método listará equipos de la liga
	 * ordenados por partidos ganados
	 * @param equipos
	 * @return
	 */
	public List<Equipo> listarEquiposPorVictorias(List<Equipo> equipos){
		List<Equipo> equiposOrdenados = new ArrayList<Equipo>();
		
		Iterator<Equipo> iterator = equipos.iterator();
		
		while (iterator.hasNext()) {
			equiposOrdenados.add(iterator.next());
			Collections.sort(equipos, (equipo1, equipo2) -> equipo1.getPartidosGanados() - equipo2.getPartidosGanados());
		}
		
		return equiposOrdenados;
	}
	
	/**
	 * Este método printea datos
	 * @param equipos
	 */
	public void printDatos(List<Equipo> equipos) {
		int numeroEquipos = 0;
		String equipoMasVictorias = null;
		//Se supone que cuando llega a este metodo ya viene la lista ordenada
		//Entonces asigno el primer valor de la lista al mas victorioso
		equipoMasVictorias = equipos.get(0).getNombre();
		
		for (Equipo equipo : equipos) {
			System.out.println("Equipo " + equipo.getNombre() + " nº victorias: " + equipo.getPartidosGanados());
			System.out.println("Equipo con más victorias: " + equipoMasVictorias);
		}
	}
	
	@Override
	public String toString() {
		return "Liga [nombre=" + nombre + ", equipos=" + equipos + "]";
	}
	
	
}
