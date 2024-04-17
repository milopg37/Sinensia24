package semana2.pruebauno;

public class Moto extends Vehiculo {

	private String marca;
	private String modelo;
	private int potencia; // En cv
	private ColoresEnum color;

	public Moto() {
		super();
	}

	public Moto(int km, int puertas, CombustiblesEnum comb, String marca, String modelo, int pot, ColoresEnum color) {
		super(km, puertas, comb);
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = pot;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	

	public ColoresEnum getColor() {
		return color;
	}

	public void setColor(ColoresEnum color) {
		this.color = color;
	}

	
	@Override
	public void conducir() {
		System.out.println("Arrancando la moto ..");
	}

	@Override
	public void avanzar(int distancia, int velocidad) {
		int tiempoConduccion = distancia / velocidad;
		
		distancia -= 25;
		velocidad = distancia / tiempoConduccion;
		
		System.out.println("La moto se desplaza a " + velocidad + " kmh \n"
							+ " tiempo restante: " + tiempoConduccion + " horas \n"
							+ " distancia restante: " + distancia + " km");
	}

	@Override
	public void retroceder(int distancia, int velocidad) {
		int tiempoConduccion = distancia / velocidad;
		distancia += 5;
		tiempoConduccion += 1;
		
		System.out.println("La moto ha retrocedido y como consecuencia: \n"
						+ " ha aumentado la distancia en " + distancia + " km \n"
						+ " y el tiempo de conduccion en " + tiempoConduccion + " horas");
	}

	@Override
	public void parar() {
		System.out.println("La moto ha llegado a su destino .. \n");
	}

	@Override
	public String toString() {
		return "Moto [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", color=" + color
				+ ", getKm()=" + getKm() + ", getPuertas()=" + getPuertas() + ", getCombustible()=" + getCombustible()
				+ "]";
	}
}
