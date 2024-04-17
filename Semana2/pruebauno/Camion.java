package semana2.pruebauno;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo{

	private int carga;
	private List<Integer> tacometro;
	private int numEjes;
	private ColoresEnum color;
	
	public Camion() {
		super();
	}
	
	public Camion(int km, int puertas, CombustiblesEnum comb, int carga, int numEjes, ColoresEnum color) {
		super(km, puertas, comb);
		this.carga = carga;
		this.tacometro = new ArrayList<>();
		this.numEjes = numEjes;
		this.color = color;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public List<Integer> getTacometro() {
		return tacometro;
	}

	public void setTacometro(List<Integer> tacometro) {
		this.tacometro = tacometro;
	}

	public int getNumEjes() {
		return numEjes;
	}

	public void setNumEjes(int numEjes) {
		this.numEjes = numEjes;
	}

	public ColoresEnum getColor() {
		return color;
	}

	public void setColor(ColoresEnum color) {
		this.color = color;
	}
	
	/**
	 * Permite agregar Velocidades a la lista del tacometro
	 * @param velocidadAgregar
	 */
	public void addVelocidad(int velocidadAgregar) {
		
		if (this.tacometro.add(velocidadAgregar)) {
			System.out.println("Velocidad añadida al tacometro con exito.");
		}
	}

	

	@Override
	public void conducir() {
		System.out.println("Arrancando el camion ..");
	}

	@Override
	public void avanzar(int distancia, int velocidad) {
		int tiempoConduccion = distancia / velocidad;
		
		distancia -= 30;
		velocidad = distancia / tiempoConduccion;
		this.tacometro.add(velocidad);//Añado velocidad al tacometro
		
		System.out.println("El camión se desplaza a " + velocidad + " kmh \n"
							+ " tiempo restante: " + tiempoConduccion + " horas \n"
							+ " distancia restante: " + distancia + " km");
	}

	@Override
	public void retroceder(int distancia, int velocidad) {
		int tiempoConduccion = distancia / velocidad;
		distancia += 17;
		tiempoConduccion += 2;
		
		System.out.println("E camión ha retrocedido y como consecuencia: \n"
						+ " ha aumentado la distancia en " + distancia + " km \n"
						+ " y el tiempo de conduccion en " + tiempoConduccion + " horas");
	}

	@Override
	public void parar() {
		System.out.println("El camión ha llegado a su destino .. \n"
							+ " El camion ha circulado a estas velocidades: " + this.tacometro + " kmh");
	}

	@Override
	public String toString() {
		return "Camion [carga=" + carga + ", tacometro=" + tacometro + ", numEjes=" + numEjes + ", color=" + color
				+ ", getKm()=" + getKm() + ", getPuertas()=" + getPuertas() + ", getCombustible()=" + getCombustible()
				+ "]";
	}
}
