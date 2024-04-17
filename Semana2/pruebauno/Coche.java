package semana2.pruebauno;

import java.util.Iterator;
import java.util.Random;

public class Coche extends Vehiculo {

	private final String MATRICULA;
	private final int RUEDAS;
	private ColoresEnum color;

	public Coche() {
		super();
		this.MATRICULA = generarMatricula();
		this.RUEDAS = 4;
	}

	public Coche(int km, int puertas, CombustiblesEnum comb, ColoresEnum color) {
		super(km, puertas, comb);
		this.MATRICULA = generarMatricula();
		this.RUEDAS = 4;
		this.color = color;
		
	}
	
	public String getMatricula() {
		return MATRICULA;
	}

	public int getRuedas() {
		return RUEDAS;
	}

	public ColoresEnum getColor() {
		return color;
	}

	public void setColor(ColoresEnum color) {
		this.color = color;
	}

	/**
	 * Autoinvocado al instanciar un coche
	 * Genera una matricula (Formato 1234 ABC) aleatoria
	 * @return String
	 */
	private String generarMatricula() {
		
		String consonantes = "BCDFGHJKLMNPQRSTVWXYZ";
		StringBuilder matriculaStrb = new StringBuilder();
		Random random = new Random();
		
		//Genero los 4 numeros
		for (int i = 0; i < 4; i++) {
			int numero = random.nextInt(10);
			matriculaStrb.append(numero);
		}
		
		matriculaStrb.append(" ");
		
		//Genero las 3 letras
		for (int i = 0; i < 3; i++) {
			char letra = consonantes.charAt(random.nextInt(consonantes.length()));
			matriculaStrb.append(letra);
		}
		return matriculaStrb.toString();
	}
	

	@Override
	public void conducir() {
		System.out.println("Arrancando el coche ..");
	}


	@Override
	public void avanzar(int distancia, int velocidad) {
		int tiempoConduccion = distancia / velocidad;
		
		distancia -= 20;
		velocidad = distancia / tiempoConduccion;
		
		System.out.println("El coche se desplaza a " + velocidad + " kmh \n"
							+ " tiempo restante: " + tiempoConduccion + " horas \n"
							+ " distancia restante: " + distancia + " km");
	}

	@Override
	public void retroceder(int distancia, int velocidad) {
		
		int tiempoConduccion = distancia / velocidad;
		distancia += 15;
		tiempoConduccion += 3;
		
		System.out.println("El coche ha retrocedido y como consecuencia: \n"
						+ " ha aumentado la distancia en " + distancia + " km \n"
						+ " y el tiempo de conduccion en " + tiempoConduccion + " horas");
	}
	
	@Override
	public void parar() {
		
		System.out.println("El coche ha llegado a su destino .. \n");
	}

	@Override
	public String toString() {
		return "Coche [MATRICULA=" + MATRICULA + ", RUEDAS=" + RUEDAS + ", color=" + color + ", getKm()=" + getKm()
				+ ", getPuertas()=" + getPuertas() + ", getCombustible()=" + getCombustible() + "]";
	}
}
