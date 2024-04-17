package semana2.pruebauno;

import javax.sound.midi.Soundbank;

public class Vehiculo implements Conducible {

	private int km;
	private int puertas;
	private CombustiblesEnum combustible;

	public Vehiculo() {

	}

	public Vehiculo(int km, int puertas, CombustiblesEnum comb) {
		this.km = km;
		this.puertas = puertas;
		this.combustible = comb;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public CombustiblesEnum getCombustible() {
		return combustible;
	}

	public void setCombustible(CombustiblesEnum combustible) {
		this.combustible = combustible;
	}

	/**
	 * Arranca el vehiculo
	 * Recibe informacion sobre el viaje a realizar
	 * Tiempo(horas) - Recorrido (km) - Velocidad (km/h)
	 */
	@Override
	public void conducir() {
		System.out.println("Arrancaste el vehiculo .."
							+ " Recalculando ruta ..");
	}
	
	/**
	 * Pone el vehiculo en movimiento
	 * Va restando distancia de recorrido y de tiempo de conduccion
	 * En funcion de la velocidad
	 */
	@Override
	public void avanzar(int distancia, int velocidad) {
		
		System.out.println("Vehiculo en movimiento ..");
	}

	/**
	 * Retrocede vehiculo
	 */
	@Override
	public void retroceder(int distancia, int velocidad) {
		
		System.out.println("Vehiculo retrocediendo ..");
	}

	/**
	 * Finaliza trayecto y printea informacion final
	 */
	@Override
	public void parar() {
		
		System.out.println("Llegada a su destino .."
						  + "Vehiculo completamente detenido ..");
	}

	@Override
	public String toString() {
		return "Vehiculo [km=" + km + ", puertas=" + puertas + ", combustible=" + combustible + "]";
	}
	

}
