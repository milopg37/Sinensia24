package semana2.pruebauno;

public class Barco extends Vehiculo {

	private boolean esPesquero;
	private int tonelaje;
	private int tripulacion;
	private ColoresEnum color;

	public Barco() {
		super();
	}

	public Barco(int km, int puertas, CombustiblesEnum comb, boolean esPesquero, int ton, int tripulacion, ColoresEnum color) {
		super(km, puertas, comb);
		this.esPesquero = esPesquero;
		this.tonelaje = ton;
		this.tripulacion = tripulacion;
		this.color = color;
	}

	public boolean isEsPesquero() {
		return esPesquero;
	}

	public void setEsPesquero(boolean esPesquero) {
		this.esPesquero = esPesquero;
	}

	public int getTonelaje() {
		return tonelaje;
	}

	public void setTonelaje(int tonelaje) {
		this.tonelaje = tonelaje;
	}

	public int getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(int tripulacion) {
		this.tripulacion = tripulacion;
	}
	

	public ColoresEnum getColor() {
		return color;
	}

	public void setColor(ColoresEnum color) {
		this.color = color;
	}


	@Override
	public void conducir() {
		System.out.println("El barco zarpa del puerto ..");
	}

	@Override
	public void avanzar(int distancia, int velocidad) {
		int millas = (int) (distancia / 0.6);
		int nudos = (int) (velocidad / 0.5);
		int tiempoConduccion = millas / nudos;
		
		distancia -= 40;
		velocidad = distancia / tiempoConduccion;
		
		System.out.println("El barco navega a " + velocidad + " nudos \n"
				+ " tiempo restante: " + tiempoConduccion + " horas \n"
				+ " distancia restante: " + distancia + " millas nauticas");
	}

	@Override
	public void retroceder(int distancia, int velocidad) {
		int millas = (int) (distancia / 0.6);
		int nudos = (int) (velocidad / 0.5);
		int tiempoConduccion = millas / nudos;
		distancia += 7;
		tiempoConduccion += 6;
		
		System.out.println("El barco ha encallado y retrocedido y como consecuencia: \n"
						+ " ha aumentado la distancia en " + distancia + " millas nauticas \n"
						+ " y el tiempo de navegacion en " + tiempoConduccion + " horas");
	}
		

	@Override
	public void parar() {
		System.out.println("El barco ha llegado a su destino y ha atracado en el puerto .. \n");
	}

	@Override
	public String toString() {
		return "Barco [esPesquero=" + esPesquero + ", tonelaje=" + tonelaje + ", tripulacion=" + tripulacion
				+ ", color=" + color + ", getKm()=" + getKm() + ", getPuertas()=" + getPuertas() + ", getCombustible()="
				+ getCombustible() + "]";
	}
}
